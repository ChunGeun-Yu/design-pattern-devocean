package com.devocean.designpattern.v6;

import com.devocean.designpattern.common.Message;
import com.devocean.designpattern.common.Notification;

public interface AlarmService {
    void sendAlarm(Message message, Notification notification);
}
