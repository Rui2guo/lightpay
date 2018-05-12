package lightpay.history.wallet;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(exclude = { "walletHistory" })
@ToString(exclude = { "walletHistory" })
public class PaymentHistory implements Serializable {

    @Id
    @TableGenerator(
        name = "seqTable",
        table = "seq_table",
        pkColumnName = "seq_name",
        valueColumnName = "seq_value",
        pkColumnValue = "wallet_history")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seqTable")
    private Long id;

    @JsonIgnore
    @OneToOne(cascade = {CascadeType.ALL})
    private WalletHistory walletHistory;

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
