package lightpay.history.wallet;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(indexes = @Index(columnList = "txHash"))
@Data
@EqualsAndHashCode(exclude = { "walletHistory" })
@ToString(exclude = { "walletHistory" })
public class TransactionHistory implements Serializable {

    @Id
    @TableGenerator(
        name = "seqTable",
        table = "seq_table",
        pkColumnName = "seq_name",
        valueColumnName = "seq_value",
        pkColumnValue = "payment_history")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seqTable")
    private Long id;

    @JsonIgnore
    @OneToOne(cascade = {CascadeType.ALL})
    private WalletHistory walletHistory;

    private String txHash;

    private String blockHash;

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
