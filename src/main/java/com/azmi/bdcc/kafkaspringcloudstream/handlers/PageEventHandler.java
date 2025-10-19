package com.azmi.bdcc.kafkaspringcloudstream.handlers;

import com.azmi.bdcc.kafkaspringcloudstream.events.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class PageEventHandler {
    @Bean
    public Consumer<PageEvent> pageEventConsumer() {
        return (input)->{
            System.out.println("************");
            System.out.println(input.name()+" "+input.date());
            System.out.println("************");
        };
    }
}
