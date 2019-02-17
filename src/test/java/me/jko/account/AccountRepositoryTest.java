package me.jko.account;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJpaTest // slicing test
public class AccountRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di() throws SQLException {

        Account account = new Account();
        account.setPassword("pass");
        account.setUsername("jko");

        Account newAccount = accountRepository.save(account);
        assertThat(newAccount).isNotNull();

        Account existingAccount = accountRepository.findByUsername(newAccount.getUsername());
        assertThat(existingAccount).isNotNull();

        Account nonExistingAccount = accountRepository.findByUsername("test");
        assertThat(nonExistingAccount).isNull();



    }

}