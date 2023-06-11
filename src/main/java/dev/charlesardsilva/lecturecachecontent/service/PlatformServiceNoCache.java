package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.gateway.PlatformGateway;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
class PlatformServiceNoCache implements PlatformService {

    private final PlatformGateway platformGateway;

    public PlatformServiceNoCache(PlatformGateway platformGateway) {
        this.platformGateway = platformGateway;
    }

    public boolean status(long productId) {
        return platformGateway.status(productId);
    }
}
