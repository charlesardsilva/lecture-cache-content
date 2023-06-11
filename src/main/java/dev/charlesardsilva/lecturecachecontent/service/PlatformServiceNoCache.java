package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.gateway.PlatformGateway;
import org.springframework.stereotype.Service;

@Service
class PlatformServiceNoCache {

    private final PlatformGateway platformGateway;

    public PlatformServiceNoCache(PlatformGateway platformGateway) {
        this.platformGateway = platformGateway;
    }

    public boolean status(long productId) {
        return platformGateway.status(productId);
    }
}
