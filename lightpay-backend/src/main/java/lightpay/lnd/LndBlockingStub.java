package lightpay.lnd;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import io.grpc.ManagedChannel;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContext;
import lightpay.config.properties.LightPayBackendProperties;
import lightpay.lnd.grpc.LightningGrpc;
import lightpay.lnd.grpc.LightningGrpc.LightningBlockingStub;

@Component
public class LndBlockingStub {

    @Autowired
    private LightPayBackendProperties lightPayBackendProperties;

    private ManagedChannel channel;

    private LightningBlockingStub blockingStub;

    /**
     *
     * @throws DecoderException
     * @throws IOException
     */
    @PostConstruct
    private void init() throws DecoderException, IOException {
        SslContext sslContext = GrpcSslContexts.forClient()
            .trustManager(ResourceUtils.getFile(lightPayBackendProperties.getLnd().getSsl().getCertificateFilePath()))
            .build();

        byte[] macaroonData = FileUtils.readFileToByteArray(ResourceUtils.getFile(lightPayBackendProperties.getLnd().getMacaroon().getFilePath()));

        channel = NettyChannelBuilder
            .forAddress(
                lightPayBackendProperties.getLnd().getHost(),
                lightPayBackendProperties.getLnd().getPort()
                )
            .negotiationType(NegotiationType.TLS)
            .sslContext(sslContext)
            .intercept(new MacaroonAuthInterceptor(Hex.encodeHexString(macaroonData)))
            .build();

        blockingStub = LightningGrpc.newBlockingStub(channel);
    }

    @PreDestroy
    private void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public LightningBlockingStub getInstance() {
        return blockingStub;
    }

}
