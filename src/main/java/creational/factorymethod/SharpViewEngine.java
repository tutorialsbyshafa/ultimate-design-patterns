package creational.factorymethod;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View by sharp";
    }
}
