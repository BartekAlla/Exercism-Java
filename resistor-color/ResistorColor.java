import java.util.HashMap;
import java.util.Map;

class ResistorColor {
    private static final String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    private static final Map<String, Integer> colorMap = new HashMap<>();
    static {
        for (int i = 0; i < colors.length; i++) {
            colorMap.put(colors[i], i);
        }
    }
    int colorCode(String color) {
        String colorConverted = color.toLowerCase();
        return colorMap.getOrDefault(colorConverted, -1);
    }

    String[] colors() {
        return colors.clone();
    }
}
