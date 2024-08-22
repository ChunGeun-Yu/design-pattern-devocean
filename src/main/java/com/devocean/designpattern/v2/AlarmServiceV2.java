package com.devocean.designpattern.v2;

import com.devocean.designpattern.common.Message;
import com.devocean.designpattern.common.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AlarmServiceV2 {

    private final List<Notification> notifications;

    public AlarmServiceV2(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public void sendAlarm(Message message) {
        // something to do
        notifications.forEach(notification -> {
            notification.send(message.getTarget(), message.getBody());
        });
    }
}
