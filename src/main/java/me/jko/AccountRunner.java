package me.jko;

import me.jko.account.Account;
import me.jko.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account jko = accountService.createAccount("jko", "1234");
        System.out.println(jko.getUsername()+ " password : " + jko.getPassword());


    }
}
