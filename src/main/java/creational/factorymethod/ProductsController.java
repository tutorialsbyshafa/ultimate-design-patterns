package creational.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
