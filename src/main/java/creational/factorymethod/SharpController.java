package creational.factorymethod;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
