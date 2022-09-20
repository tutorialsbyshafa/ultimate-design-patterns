package behavioural.chainofresponsibility;

public class Implementation {
    public static void main(String[] args) {
//        var compressor = new Compressor(null);
        var encryptor = new Encryptor(null);
        var logger = new Logger(encryptor);
        var authenticatior = new Authenticatior(logger);
        var server = new WebServer(authenticatior);

        server.handle(new HttpRequest("admin", "admin"));
    }
}
