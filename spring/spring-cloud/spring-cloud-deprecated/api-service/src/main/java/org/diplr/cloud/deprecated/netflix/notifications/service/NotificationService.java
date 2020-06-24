package org.diplr.cloud.deprecated.netflix.notifications.service;

import org.diplr.cloud.deprecated.netflix.infrastructure.Collaborators;
import org.diplr.cloud.deprecated.netflix.notifications.client.NotificationResource;
import org.diplr.cloud.deprecated.netflix.notifications.client.NotificationVersionResource;
import org.diplr.cloud.deprecated.netflix.notifications.model.Notification;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import rx.Observable;

import java.util.List;

@Service
public class NotificationService {

    private final Log LOG = LogFactory.getLog(this.getClass());

    @Autowired
    @Lazy
    private EurekaClient discoveryClient;
    @Autowired
    private NotificationResource notificationResource;
    @Autowired
    private NotificationVersionResource notificationVersionResource;

    @HystrixCommand(groupKey = "tp-notification-service", fallbackMethod = "statusNotFound")
    public InstanceStatus notificationsStatus() {
        return discoveryClient.getNextServerFromEureka(Collaborators.NOTIFICATIONS, false)
                .getStatus();
    }

    public InstanceStatus statusNotFound() {
        return InstanceStatus.DOWN;
    }

    @HystrixCommand(groupKey = "tp-notification-service", fallbackMethod = "notificationsAreDown")
    public Observable<String> statusPageUrl() {
        return Observable.just(
                discoveryClient.getNextServerFromEureka(Collaborators.NOTIFICATIONS, false)
                        .getStatusPageUrl()
        );
    }

    @HystrixCommand(groupKey = "tp-notification-service", fallbackMethod = "notificationsAreDown")
    public String version() {
        return notificationVersionResource.version();
    }

    public String notificationsAreDown() {
        return "notificaton service is down";
    }

    public List<Notification> notifications() {
        return notificationResource.findAll();
    }

}
