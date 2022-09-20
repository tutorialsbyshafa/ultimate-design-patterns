package creational.singleton;

import java.util.HashMap;
import java.util.Map;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfigManager {
    private final Map<String, Object> settings = new HashMap<>();

    private static ConfigManager instance = new ConfigManager();

    public static ConfigManager getInstance() {
        return instance;
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }

}
