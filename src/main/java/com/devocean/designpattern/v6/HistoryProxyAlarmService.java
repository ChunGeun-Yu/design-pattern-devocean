package com.devocean.designpattern.v6;


import com.devocean.designpattern.common.Message;
import com.devocean.designpattern.common.Notification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HistoryProxyAlarmService implements AlarmService {
    private final AlarmService target;

    public HistoryProxyAlarmService(AlarmService target) {
        this.target = target;
    }

    @Override
    public void sendAlarm(Message message, Notification notification) {
        target.sendAlarm(message, notification);
        writeHistory(message);
    }

    void writeHistory(Message message) {
        log.info("message 전송 이력을 저장");
    }
}
