package com.devocean.designpattern.v3;

import com.devocean.designpattern.common.Message;
import com.devocean.designpattern.common.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AlarmServiceV3 {

    public void sendAlarm(Message message, Notification notification) {
        // 특정 작업 수행 ( DB 저장 등 ... )
        notification.send(message.getTarget(), message.getBody());
    }

}
