package lightpay.history.wallet;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(indexes = @Index(columnList = "destAddress"))
public class TransactionHistory extends WalletHistory {

    @Id
    private String txHash;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    private String destAddress;

    private Long amount;

    private Long totalFees;


    public static enum TransactionType {

        OpenChannel,

        CloseChannel,

        SendCoins,

        ReceiveCoins;

    }

}
