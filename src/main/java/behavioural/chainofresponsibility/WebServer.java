package behavioural.chainofresponsibility;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WebServer {
    private Handler handler;

    public void handle(HttpRequest request) {
        handler.handle(request);
    }
}
