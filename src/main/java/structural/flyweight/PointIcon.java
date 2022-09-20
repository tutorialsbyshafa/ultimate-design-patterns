package structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PointIcon {
    private final PointType type;
    private final byte[] icon;
}
