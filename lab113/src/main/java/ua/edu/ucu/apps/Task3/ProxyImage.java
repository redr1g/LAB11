package ua.edu.ucu.apps.Task3;

public class ProxyImage implements MyImage {
    private String filename;
    private RealImage realImg;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImg == null) realImg = new RealImage(filename); 
        realImg.display();
    }
}
