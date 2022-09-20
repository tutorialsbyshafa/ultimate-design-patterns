package structural.adapter;

import lombok.AllArgsConstructor;
import structural.adapter.thirdparty.Caramel;

@AllArgsConstructor
public class CaramelFilter implements Filter {
    private Caramel caramel;

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
