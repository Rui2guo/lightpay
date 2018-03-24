package lightpay.lnd;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

public class MacaroonAuthInterceptor implements ClientInterceptor {

    private final String macaroonHex;

    public MacaroonAuthInterceptor(String macaroonHex) {
        this.macaroonHex = macaroonHex;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
        CallOptions callOptions, Channel next) {
        return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                Metadata.Key<String> authorization = Metadata.Key.of("macaroon", Metadata.ASCII_STRING_MARSHALLER);
                headers.put(authorization, macaroonHex);
                super.start(responseListener, headers);
            }

        };
    }

}
