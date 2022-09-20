package structural.adapter;

import structural.adapter.thirdparty.Caramel;

public class Implementation {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());

        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
