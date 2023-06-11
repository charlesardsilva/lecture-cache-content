package dev.charlesardsilva.lecturecachecontent.service2.service;

import dev.charlesardsilva.lecturecachecontent.model.Config;
import dev.charlesardsilva.lecturecachecontent.repository.ConfigRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
class ConfigServiceNoCache implements ConfigService {

    private final ConfigRepository configRepository;

    public ConfigServiceNoCache(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public Config byKey(String key) {
        return configRepository.findByKey(key);
    }

    public Config byKeyWithCache(String key) {
        return configRepository.findByKey(key);
    }
}
