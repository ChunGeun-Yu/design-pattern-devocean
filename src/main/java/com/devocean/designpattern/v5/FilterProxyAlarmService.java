package com.devocean.designpattern.v5;


import com.devocean.designpattern.common.Message;
import com.devocean.designpattern.common.Notification;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class FilterProxyAlarmService implements AlarmService {
    private final AlarmService target;

    public FilterProxyAlarmService(AlarmService target) {
        this.target = target;
    }


    @Override
    public void sendAlarm(Message message, Notification notification) {
        boolean allowed = isAllowed(message);
        if (allowed==false)
            return;

        target.sendAlarm(message, notification);
    }

    boolean isAllowed(Message message) {
        log.info("message 를 검사하여 pass, drop 여부를 결정");
        return true;
    }
}
