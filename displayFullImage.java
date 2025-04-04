public class displayFullImage implements Image{
    private RealImage realImage;

    public displayFullImage(String filename, boolean isZoomed) {
        this.realImage = new RealImage(filename, isZoomed);  //get data from RealImage
    }


    @Override
    public void display() {
        realImage.loadImage();  //Download image before show
        if (realImage.isZoomed()) {
            System.out.println("Вот ваше увеличенное изображение" + realImage.getFilename());
        }else {
            realImage.display();
        }
    }
}
