package com.devocean.designpattern.v1;

import com.devocean.designpattern.common.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AlarmServiceV1 {

    public void sendAlarm(Message message) {
        // something to do
        sendEmail(message.getTarget(), message.getBody());
        sendSlack(message.getTarget(), message.getBody());
    }

    void sendEmail(String target, String body) {
        // something to do
        log.info("send email notification. target: {}, body: {}", target, body);
    }

    public void sendSlack(String target, String body) {
        log.info("send slack notification. target: {}, body: {}", target, body);
    }
}
