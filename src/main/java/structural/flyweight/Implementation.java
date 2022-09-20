package structural.flyweight;

public class Implementation {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        service.getPoints().forEach(Point::draw);
    }
}
