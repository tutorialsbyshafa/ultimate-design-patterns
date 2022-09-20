package creational.factorymethod;

import java.util.Map;

public class MatchViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View by Matcha";
    }
}
