package lightpay.history.wallet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, String> {

    List<TransactionHistory> findByTotalFeesIsNotNull();

}
