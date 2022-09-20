package structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ImageView {
    private Image image;

    public void apply(Filter filter) {
        filter.apply(image);
    }
}
