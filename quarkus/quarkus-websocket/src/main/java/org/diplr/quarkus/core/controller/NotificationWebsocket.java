package org.diplr.quarkus.core.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint("/notifications")
@ApplicationScoped
public class NotificationWebsocket {

    final Map<String, Session> activeSessions = new ConcurrentHashMap<>();

    @OnOpen
    public void connectionOpened(final Session session) {
        activeSessions.put(session.getId(), session);
        activeSessions.values()
                      .forEach(s -> s.getAsyncRemote()
                                                 .sendObject("someone just joined this page", sendResult ->
                                                 {
                                                     if (!sendResult.isOK()) {
                                                         System.out.println(sendResult.getException().getMessage());
                                                     }
                                                 }));
    }

    @OnClose
    public void onClosed(final Session session) {
        activeSessions.remove(session.getId());
    }

    @OnMessage
    public void onMessage(final String message) {
        activeSessions.values()
                      .forEach(session -> session.getAsyncRemote()
                                                 .sendObject(message, sendResult ->
                                                 {
                                                     if (!sendResult.isOK()) {
                                                         System.out.println(sendResult.getException().getMessage());
                                                     }
                                                 }));
    }
}
