package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle implements Component {
    private int radius;

    @Override
    public void render() {
        System.out.println("Rendering circle");
    }

    @Override
    public Component clone() {
        var newCircle = new Circle();
        newCircle.setRadius(radius);
        return newCircle;
    }
}
