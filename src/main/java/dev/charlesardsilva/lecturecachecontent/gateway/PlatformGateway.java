package dev.charlesardsilva.lecturecachecontent.gateway;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class PlatformGateway {

    public boolean status(long productId) {
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}