package structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PointService {
    private PointIconFactory iconFactory;

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point = new Point(iconFactory.getPointIcon(PointType.CAFE), 1, 2);
        points.add(point);

        return points;
    }
}
