package me.jko;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// ApplicationStartedEvent 발생하면 이 리스너를 실행함
@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("======================");
        System.out.println("applicationStartedEvent");
        System.out.println("======================");
    }
}
