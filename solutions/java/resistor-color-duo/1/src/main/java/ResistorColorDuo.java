import java.util.List;

class ResistorColorDuo {
    private final List<String> bandColors = List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
    
    int value(String[] colors) {
        return Integer.parseInt(
            String.format("%s%s", this.bandColors.indexOf(colors[0]), this.bandColors.indexOf(colors[1]))
        );
    }
}
