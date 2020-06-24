package org.diplr.cloud.deprecated.netflix.notifications.client;

import org.diplr.cloud.deprecated.netflix.notifications.model.Notification;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NotificationResourceImpl implements NotificationResource {
    
    @Override
    public List<Notification> findAll() {
        return new ArrayList<>();
    }
}
