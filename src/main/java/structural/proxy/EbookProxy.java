package structural.proxy;

import lombok.Data;

@Data
public class EbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    public void show() {
        if (ebook == null) {
            ebook = new RealEbook(fileName);
        }
        ebook.show();
    }

}
