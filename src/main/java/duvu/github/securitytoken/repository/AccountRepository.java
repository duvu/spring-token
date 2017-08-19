package duvu.github.securitytoken.repository;

import duvu.github.securitytoken.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author beou on 8/20/17 01:04
 * @version 1.0
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByAccountId(String accountId);
}
