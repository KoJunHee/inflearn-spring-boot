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

        logger.info("===============================");
        logger.info(hello);
        logger.info(jkoProperties.getFullName());
        logger.info(jkoProperties.getName());
        logger.info("===============================");


        System.out.println("=========================");
        System.out.println(hello);
        System.out.println(jkoProperties.getName());
        System.out.println("=========================");

    }
}
