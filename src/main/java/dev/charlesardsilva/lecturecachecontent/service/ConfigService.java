package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.model.Config;

public interface ConfigService {

    Config byKey(String key);
}
