package com.deswaef.netflixexamples.notifications.service;

import com.deswaef.netflixexamples.notifications.model.Notification;
import com.deswaef.netflixexamples.notifications.repository.StubNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import rx.Observable;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class NotificationService {

    @Autowired
    private StubNotificationRepository stubNotificationRepository;

    public Observable<Notification> findAll() {
        return Observable.defer(() -> stubNotificationRepository.findAll());
    }

    @Async
    public void create(String message) {
        stubNotificationRepository
                .save(
                        new Notification()
                                .setId(UUID.randomUUID().toString())
                                .setMessage(message)
                                .setTimestamp(LocalDateTime.now())
                );
    }
}
