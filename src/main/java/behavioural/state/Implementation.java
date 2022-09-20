package behavioural.state;

public class Implementation {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());

        canvas.mouseDown();
        canvas.mouseUp();
    }
}
