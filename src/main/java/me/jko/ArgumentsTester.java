package me.jko;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentsTester {

    public ArgumentsTester(ApplicationArguments ApplicationArguments) {
        System.out.println("foo : " + ApplicationArguments.containsOption("foo"));
        System.out.println("bar: " + ApplicationArguments.containsOption("bar"));
    }
}
