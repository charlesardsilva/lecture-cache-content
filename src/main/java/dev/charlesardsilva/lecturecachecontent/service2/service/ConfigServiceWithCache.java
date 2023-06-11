package dev.charlesardsilva.lecturecachecontent.service2.service;

import dev.charlesardsilva.lecturecachecontent.model.Config;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
class ConfigServiceWithCache implements ConfigService {

    private final ConfigServiceNoCache configServiceNoCache;

    public ConfigServiceWithCache(ConfigServiceNoCache configServiceNoCache) {
        this.configServiceNoCache = configServiceNoCache;
    }

    @Cacheable
    public Config byKey(String key) {
        return configServiceNoCache.byKey(key);
    }
}
