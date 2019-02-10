package me.jko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// 1. Component Scan
// 2. Auto Configuration
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }

    // 이게 우선시 되어야 하는데, 두 번째 Scan 인 Auto Configuration 때문에 이게 적용이 안됨.
    @Bean
    public Holoman holoman(){
        Holoman holoman = new Holoman();
        holoman.setHowLong(10000);
        holoman.setName("Junhee Ko");
        return holoman;
    }
}
