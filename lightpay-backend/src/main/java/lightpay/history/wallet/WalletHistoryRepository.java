package lightpay.history.wallet;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WalletHistoryRepository extends JpaRepository<WalletHistory, Long> {

    @Query(value = "select w from WalletHistory w "
        + "left outer join fetch w.paymentHistory ph "
        + "left outer join fetch w.transactionHistory th "
        + "where w.timeStamp is not null",
        countQuery = "select count(w) from WalletHistory w where w.timeStamp is not null")
    Page<WalletHistory> findWalletHistory(Pageable pageable);

    @Query(value = "select w from WalletHistory w "
        + "left outer join fetch w.paymentHistory ph "
        + "left outer join fetch w.transactionHistory th "
        + "where w.id <= :id and w.timeStamp is not null",
        countQuery = "select count(w) from WalletHistory w where w.id <= :id and w.timeStamp is not null")
    Page<WalletHistory> findWalletHistoryByIdLessThanEqual(@Param("id") Long id, Pageable pageable);

    @Query("select w from WalletHistory w "
        + "left outer join fetch w.paymentHistory ph "
        + "left outer join fetch w.transactionHistory th "
        + "where th.txHash = :txHash")
    WalletHistory findWalletHistoryByTxHash(@Param("txHash") String txHash);

}
