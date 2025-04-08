import java.util.*;

public class MarkerFactory {
    private static final Map<String, MarkerStyle> styleCache = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String icon, String iconColor, String textStyle) {
        String key = icon + "-" + iconColor + "-" + textStyle;

        if (styleCache.containsKey(key)) {
            return styleCache.get(key);
        }

        MarkerStyle newStyle = new MarkerStyle(icon, iconColor, textStyle);
        styleCache.put(key, newStyle);
        return newStyle;
    }
}
