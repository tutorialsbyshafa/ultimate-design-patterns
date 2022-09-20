package creational.factorymethod;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        System.out.println(createViewEngine().render(viewName, context));
    }

    protected ViewEngine createViewEngine() {
        return new MatchViewEngine();
    }
}
