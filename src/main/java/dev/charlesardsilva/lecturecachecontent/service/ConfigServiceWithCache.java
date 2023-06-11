package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.model.Config;
import org.springframework.stereotype.Service;

@Service
class ConfigServiceWithCache {

    private final ConfigServiceNoCache configServiceNoCache;

    public ConfigServiceWithCache(ConfigServiceNoCache configServiceNoCache) {
        this.configServiceNoCache = configServiceNoCache;
    }

    public Config byKey(String key) {
        return configServiceNoCache.byKey(key);
    }
}
