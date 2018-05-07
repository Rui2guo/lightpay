package lightpay.history.wallet;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WalletHistoryRepository extends JpaRepository<WalletHistory, Long> {

    @Query("select w from WalletHistory w "
        + "left outer join fetch w.paymentHistory ph "
        + "left outer join fetch w.transactionHistory th "
        + "where w.timeStamp is not null")
    List<WalletHistory> findWalletHistoryByTimeStampIsNotNull(Sort sort);

    @Query("select w from WalletHistory w "
        + "left outer join fetch w.paymentHistory ph "
        + "left outer join fetch w.transactionHistory th "
        + "where th.txHash = :txHash")
    WalletHistory findWalletHistoryByTxHash(@Param("txHash") String txHash);

}
