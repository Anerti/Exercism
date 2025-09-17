import java.util.*;
import java.util.stream.*;


class ResistorColor {
    int colorCode(String color) {
        List<String> colorList = List.of(colors());
        return colorList.indexOf(color);
    }

    String[] colors() {
        return "black, brown, red, orange, yellow, green, blue, violet, grey, white".split(", ");
    }
}
