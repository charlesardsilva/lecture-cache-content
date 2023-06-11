package dev.charlesardsilva.lecturecachecontent.service;

import org.springframework.stereotype.Service;

@Service
class PlatformServiceWithCache {

    private final PlatformServiceNoCache platformServiceNoCache;

    public PlatformServiceWithCache(PlatformServiceNoCache platformServiceNoCache) {
        this.platformServiceNoCache = platformServiceNoCache;
    }

    public boolean status(long productId) {
        return platformServiceNoCache.status(productId);
    }
}
