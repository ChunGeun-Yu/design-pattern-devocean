package com.devocean.designpattern.v5;

import com.devocean.designpattern.common.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestMain implements ApplicationRunner {


    private final AlarmService alarmService;

    private final EmailNotification emailNotification;

    private final SlackNotification slackNotification;



    public TestMain(AlarmService alarmService, EmailNotification emailNotification, SlackNotification slackNotification) {
        this.alarmService = alarmService;
        this.emailNotification = emailNotification;
        this.slackNotification = slackNotification;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Message message = new Message();
        message.setTarget("수신자정보");
        message.setBody("알림 메시지");
        alarmService.sendAlarm(message, emailNotification);

        Message message2 = new Message();
        message2.setTarget("수신자정보2");
        message2.setBody("알림 메시지2");
        alarmService.sendAlarm(message2, slackNotification);
    }
}
