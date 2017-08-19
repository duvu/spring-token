package duvu.github.securitytoken;

import duvu.github.securitytoken.domain.Account;
import duvu.github.securitytoken.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author beou on 8/20/17 00:58
 * @version 1.0
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService{

    private final AccountRepository accountRepository;

    @Autowired
    public UserDetailsServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Account account = this.accountRepository.findByAccountId(s);
        return new UserDetailsImpl(account);
    }
}
