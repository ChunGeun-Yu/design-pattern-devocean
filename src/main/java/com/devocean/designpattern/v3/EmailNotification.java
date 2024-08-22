package com.devocean.designpattern.v3;

import com.devocean.designpattern.common.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailNotification implements Notification {
    public void send(String target, String body) {
        log.info("send email notification. target: {}, body: {}", target, body);
    }
}
