package lightpay.history.wallet;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class WalletHistory implements Serializable {

    private LocalDateTime timeStamp;

}
