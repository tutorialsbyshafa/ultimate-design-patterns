package behavioural.chainofresponsibility;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Handler {
    private Handler next;

    public void handle(HttpRequest request) {
        if (doHandle(request)) {
            return;
        }

        if (next != null) {
            next.handle(request);
        }
    }

    public abstract boolean doHandle(HttpRequest request);
}
