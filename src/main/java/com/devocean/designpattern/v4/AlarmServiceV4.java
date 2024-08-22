package com.devocean.designpattern.v4;

import com.devocean.designpattern.common.Message;
import com.devocean.designpattern.common.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AlarmServiceV4 {

    public void sendAlarm(Message message, Notification notification) {
        // 특정 작업 수행 ( DB 저장 등 ... )

        boolean allowed = isAllowed(message);
        if (allowed==false)
            return;

        notification.send(message.getTarget(), message.getBody());
    }

    boolean isAllowed(Message message) {
        log.info("message 를 검사하여 pass, drop 여부를 결정");
        return true;
    }

}
