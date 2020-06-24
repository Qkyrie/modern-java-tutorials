package com.deswaef.netflixexamples.notifications.model;

import java.time.LocalDateTime;

public class Notification {
    private String id;
    private String message;
    private LocalDateTime timestamp;

    public String getId() {
        return id;
    }

    public Notification setId(String id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Notification setMessage(String message) {
        this.message = message;
        return this;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Notification setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
