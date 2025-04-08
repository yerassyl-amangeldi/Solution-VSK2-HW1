public class MarkerStyle {
    private String icon;
    private String iconColor;
    private String textStyle;

    public MarkerStyle(String icon, String iconColor, String textStyle) {
        this.icon = icon;
        this.iconColor = iconColor;
        this.textStyle = textStyle;
    }

    public void draw(int x, int y) {
        System.out.println("Marker at " + x + " " + y + " Icon: " + icon + " Icon Color " + iconColor + " Text Style " + textStyle );
    }
}
