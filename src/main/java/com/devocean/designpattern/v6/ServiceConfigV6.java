package com.devocean.designpattern.v6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfigV6 {

    @Bean
    public AlarmService alarmService() {
        AlarmService originalTarget = new AlarmServiceV6();
        AlarmService filterTarget = new FilterProxyAlarmService(originalTarget);
        AlarmService alarmService = new HistoryProxyAlarmService(filterTarget);
        return alarmService;
    }
}
