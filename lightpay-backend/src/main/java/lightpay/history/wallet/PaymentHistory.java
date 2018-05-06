package lightpay.history.wallet;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(indexes = @Index(columnList = "destination"))
public class PaymentHistory extends WalletHistory {

    @Id
    @TableGenerator(
        name = "seqTable",
        table = "seq_table",
        pkColumnName = "seq_name",
        valueColumnName = "seq_value",
        pkColumnValue = "payment_history")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seqTable")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Direction direction;

    private String destination;

    private Long totalAmountMsat;

    private Long totalFeesMsat;


    public static enum Direction {

        Send,

        Receive;

    }

}
