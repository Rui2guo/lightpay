package lightpay.history.wallet;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(exclude = { "paymentHistory", "transactionHistory" })
@ToString(exclude = { "paymentHistory", "transactionHistory" })
public class WalletHistory implements Serializable {

    @Id
    @TableGenerator(
        name = "seqTable",
        table = "seq_table",
        pkColumnName = "seq_name",
        valueColumnName = "seq_value",
        pkColumnValue = "wallet_history")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seqTable")
    private Long id;

    private Date timeStamp;

    @OneToOne(cascade = {CascadeType.ALL})
    private PaymentHistory paymentHistory;

    @OneToOne(cascade = {CascadeType.ALL})
    private TransactionHistory transactionHistory;

}
