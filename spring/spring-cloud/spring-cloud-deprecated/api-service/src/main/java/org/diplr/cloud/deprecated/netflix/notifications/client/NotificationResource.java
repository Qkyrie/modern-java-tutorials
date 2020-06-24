package org.diplr.cloud.deprecated.netflix.notifications.client;

import org.diplr.cloud.deprecated.netflix.notifications.model.Notification;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(value = "http://notification-service", fallback = NotificationResourceImpl.class)
public interface NotificationResource {

    @RequestMapping(value = "/notifications", method = GET)
    List<Notification> findAll();
}
