package structural.proxy;

import lombok.Data;

@Data
public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the ebook " + fileName);
    }


}
