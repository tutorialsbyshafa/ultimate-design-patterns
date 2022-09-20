package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        eventHandlers.forEach(EventHandler::handle);
    }
}
