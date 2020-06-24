package org.diplr.cloud.deprecated.netflix.notifications.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient("http://notification-service")
public interface NotificationVersionResource {

    @RequestMapping(value = "/version", method = GET)
    String version();

}
