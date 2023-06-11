package dev.charlesardsilva.lecturecachecontent.service2.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
class PlatformServiceWithCache implements PlatformService {

    private final PlatformServiceNoCache platformServiceNoCache;

    public PlatformServiceWithCache(PlatformServiceNoCache platformServiceNoCache) {
        this.platformServiceNoCache = platformServiceNoCache;
    }

    @Cacheable
    public boolean status(long productId) {
        return platformServiceNoCache.status(productId);
    }
}
