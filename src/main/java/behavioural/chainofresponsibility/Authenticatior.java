package behavioural.chainofresponsibility;

public class Authenticatior extends Handler {
    public Authenticatior(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authenticating...");
        return !(request.getUsername().equals("admin") && request.getPassword().equals("admin"));
    }
}
