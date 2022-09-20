package behavioural.chainofresponsibility;

public class Encryptor extends Handler {

    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encrypting...");
        return false;
    }
}
