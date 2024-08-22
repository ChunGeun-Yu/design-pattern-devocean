package com.devocean.designpattern.v5;

import com.devocean.designpattern.common.Message;
import com.devocean.designpattern.common.Notification;

public interface AlarmService {
    void sendAlarm(Message message, Notification notification);
}
