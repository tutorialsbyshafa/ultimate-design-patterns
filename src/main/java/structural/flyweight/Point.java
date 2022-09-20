package structural.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Point {
    PointIcon icon;
    private int x;
    private int y;

    public void draw() {
        System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
    }
}
