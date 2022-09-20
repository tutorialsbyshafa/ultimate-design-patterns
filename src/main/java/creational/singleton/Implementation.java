package creational.singleton;

public class Implementation {
    public static void main(String[] args) {
        ConfigManager instance = ConfigManager.getInstance();
        instance.set("one", "one");


        var instance2 = ConfigManager.getInstance();
        instance2.get("one");
    }
}
