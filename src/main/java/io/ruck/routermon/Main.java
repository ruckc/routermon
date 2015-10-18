package io.ruck.routermon;

import io.ruck.microservice.Server;

/**
 *
 * @author ruckc
 */
public class Main {

    public static void main(String... args) {
        Server s = new Server();
        s.start();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                s.stop();
            }
        });
    }
}
