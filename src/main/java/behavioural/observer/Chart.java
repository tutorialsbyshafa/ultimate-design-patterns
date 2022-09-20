package behavioural.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Chart implements Observer {
    private DataSource dataSource;

    @Override
    public void update() {
        System.out.println("Chart got updated " + dataSource.getValue());
    }
}
