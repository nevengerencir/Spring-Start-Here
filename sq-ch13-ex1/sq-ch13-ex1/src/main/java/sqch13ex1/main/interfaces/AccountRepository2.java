package sqch13ex1.main.interfaces;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import sqch13ex1.main.models.Account;

import java.util.List;

public interface AccountRepository2 extends CrudRepository<Account, Long> {
    @Query("SELECT * FROM account")
    public List<Account>findAccounts();
}
