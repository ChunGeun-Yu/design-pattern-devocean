package com.devocean.designpattern.v4;

import com.devocean.designpattern.common.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SlackNotification implements Notification {
    public void send(String target, String body) {
        log.info("send slack notification. target: {}, body: {}", target, body);
    }
}
