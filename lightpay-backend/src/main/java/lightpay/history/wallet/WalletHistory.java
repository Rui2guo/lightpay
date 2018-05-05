package lightpay.history.wallet;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(indexes = @Index(columnList = "destination"))
public class WalletHistory {

    @Id
    @TableGenerator(
        name = "seqTable",
        table = "seq_table",
        pkColumnName = "seq_name",
        valueColumnName = "seq_value",
        pkColumnValue = "wallet_history")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "seqTable")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Direction direction;

    private String destination;

    private Long value;

    private LocalDateTime settleDatetime;


    public static enum Direction {

        LightningSend,

        LightningReceive,

        SendCoins;

    }

}
