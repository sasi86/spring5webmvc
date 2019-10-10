package com.nerd.java.spring5webmvc.bootstrap;

import com.nerd.java.spring5webmvc.model.Author;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //initData();
    }


}
