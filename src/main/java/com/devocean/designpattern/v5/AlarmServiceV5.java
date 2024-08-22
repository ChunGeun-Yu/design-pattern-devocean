package com.devocean.designpattern.v5;

import com.devocean.designpattern.common.Message;
import com.devocean.designpattern.common.Notification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AlarmServiceV5 implements AlarmService {

    @Override
    public void sendAlarm(Message message, Notification notification) {
        // 특정 작업 수행 ( DB 저장 등 ... )
        notification.send(message.getTarget(), message.getBody());
    }

}
