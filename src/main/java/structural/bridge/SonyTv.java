package structural.bridge;

public class SonyTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony turn off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony set channel to " + number);
    }
}
