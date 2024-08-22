package com.devocean.designpattern.v0;

import com.devocean.designpattern.common.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AlarmServiceV0 {

    public void sendAlarm(Message message) {
        // something to do
        sendEmail(message.getTarget(), message.getBody());
    }

    void sendEmail(String target, String body) {
        // something to do
        log.info("send email notification. target: {}, body: {}", target, body);
    }
}
