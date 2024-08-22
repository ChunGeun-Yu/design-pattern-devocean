package com.devocean.designpattern.v2;

import com.devocean.designpattern.common.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestMain implements ApplicationRunner {


    private final AlarmServiceV2 alarmService;


    public TestMain(AlarmServiceV2 alarmService) {
        this.alarmService = alarmService;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Message message = new Message();
        message.setTarget("수신자정보");
        message.setBody("알림 메시지");
        alarmService.sendAlarm(message);
    }
}
