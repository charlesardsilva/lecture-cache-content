package dev.charlesardsilva.lecturecachecontent.service2.service;

import dev.charlesardsilva.lecturecachecontent.gateway.PlatformGateway;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
class PlatformService {

    private final PlatformGateway platformGateway;

    public PlatformService(PlatformGateway platformGateway) {
        this.platformGateway = platformGateway;
    }

    public boolean status(long productId) {
        return platformGateway.status(productId);
    }

    @Cacheable
    public boolean statusWithCache(long productId) {
        return status(productId);
    }
}
