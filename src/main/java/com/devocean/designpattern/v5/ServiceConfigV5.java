package com.devocean.designpattern.v5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfigV5 {

    @Bean
    public AlarmService alarmService() {
        AlarmService target = new AlarmServiceV5();
        AlarmService alarmService = new FilterProxyAlarmService(target);
        return alarmService;
    }
}
