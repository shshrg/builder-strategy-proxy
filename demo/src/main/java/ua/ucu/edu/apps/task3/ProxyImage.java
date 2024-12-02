package ua.ucu.edu.apps.task3;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
    
}
