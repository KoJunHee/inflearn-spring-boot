package me.jko;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class SampleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    String hello;

    @Autowired
    JkoProperties jkoProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.debug("===============================");
        logger.debug(hello);
        logger.debug(jkoProperties.getFullName());
        logger.debug(jkoProperties.getName());
        logger.debug("===============================");


        System.out.println("=========================");
        System.out.println(hello);
        System.out.println(jkoProperties.getName());
        System.out.println("=========================");

    }
}
