package duvu.github.securitytoken.domain;

import duvu.github.securitytoken.TableName;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

/**
 * @author beou on 8/20/17 00:59
 * @version 1.0
 */
@Entity
@Table(name = TableName.ACCOUNT)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "accountId")
    String accountId;

    @Column(name = "password")
    String password;

    @Column(name = "firstName")
    String firstName;

    @Column(name = "lastName")
    String lastName;
}
