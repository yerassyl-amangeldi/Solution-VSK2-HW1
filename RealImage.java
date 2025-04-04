public class RealImage implements Image{
    private String filename;
    private boolean isZoomed;

    public RealImage(String filename, boolean isZoomed) {
        this.filename = filename;
        this.isZoomed = isZoomed;
    }

    public String getFilename() {
        return filename;
    }

    public boolean isZoomed() {
        return isZoomed;
    }

    public void loadImage() {
        System.out.println("Скачиваем изображение" + filename);
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения" + filename);
    }


}
