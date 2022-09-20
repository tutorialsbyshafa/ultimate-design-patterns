package behavioural.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SpreadSheet implements Observer {
    private DataSource dataSource;

    @Override
    public void update() {
        System.out.println("Spreadsheet got notified: " + dataSource.getValue());
    }
}
