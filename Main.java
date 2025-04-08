import java.util.*;

public class Main {
    public static void main(String[] args) {
        Image image = new displayFullImage(" ll.txt", false);
        image.display();

        MarkerStyle hospitalStyle = MarkerFactory.getMarkerStyle("hospital.png", "red", "Arial");
        List<Marker> markers = new ArrayList<>();
        markers.add(new Marker(5, 6, hospitalStyle));
        markers.add(new Marker(4, 2, hospitalStyle));
        markers.add(new Marker(2, 3, hospitalStyle));
        markers.add(new Marker(1, 6, hospitalStyle));
        markers.add(new Marker(5, 1, hospitalStyle));

        for (Marker marker : markers) {
            marker.draw();
        }







    }
}
