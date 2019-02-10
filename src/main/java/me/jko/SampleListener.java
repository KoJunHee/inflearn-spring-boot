package me.jko;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// ApplicationStartingEvent가 발생하면 이 리스너를 실행함
// 그런데 ApplicationStartingEvent는 application context가 생성되기 전에 생성됨.. 그래서 실행이 안됨..
// 그래서 springApplication.addListeners(new SampleListener()); 를 해야함
@Component
public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("-------------------------");
        System.out.println("Starting");
        System.out.println("-------------------------");
    }
}
