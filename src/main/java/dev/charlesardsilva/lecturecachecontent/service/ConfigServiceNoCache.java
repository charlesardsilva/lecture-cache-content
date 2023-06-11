package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.model.Config;
import dev.charlesardsilva.lecturecachecontent.repository.ConfigRepository;
import org.springframework.stereotype.Service;

@Service
class ConfigServiceNoCache {

    private final ConfigRepository configRepository;

    public ConfigServiceNoCache(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public Config byKey(String key) {
        return configRepository.findByKey(key);
    }
}
