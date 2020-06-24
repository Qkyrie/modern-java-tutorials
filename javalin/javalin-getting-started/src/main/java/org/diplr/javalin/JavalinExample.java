package org.diplr.javalin;

import io.javalin.Javalin;

public class JavalinExample {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", (context -> context.result("Hello world")));
    }
}
