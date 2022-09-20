package structural.composite;

public class Implementation {
    public static void main(String[] args) {
        var square1 = new Shape();
        var square2 = new Shape();
        var circle1 = new Shape();

        var group1 = new Group();
        var group2 = new Group();

        group1.add(square1);
        group1.add(square2);
        group1.add(circle1);

        group2.add(group1);

        group2.render();
        group1.move();
    }
}
