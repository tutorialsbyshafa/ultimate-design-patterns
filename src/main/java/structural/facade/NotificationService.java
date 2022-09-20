package structural.facade;

public class NotificationService {
    void send(String message, String target) {
        var server = new NotificationServer();
        var connect = server.connect("ip");
        var token = server.authenticate("ID", "key");
        var messageObj = new Message(message);
        server.send(token, messageObj, target);
        connect.disconnect();
    }
}
