package structural.bridge;

public class Implementation {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTv());
        remoteControl.turnOn();
    }
}
