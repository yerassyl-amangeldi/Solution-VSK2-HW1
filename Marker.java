public class Marker {
    private final int x;
    private final int y;
    private MarkerStyle markerStyle;

    public Marker(int x, int y, MarkerStyle markerStyle) {
        this.x = x;
        this.y = y;
        this.markerStyle = markerStyle;
    }

    public void draw () {
        markerStyle.draw(x, y);
    }

}
