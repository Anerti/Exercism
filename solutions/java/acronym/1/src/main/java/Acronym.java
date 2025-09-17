import java.util.Arrays;
import java.util.stream.*;

class Acronym {

    private final String acronym;
    Acronym(String phrase) {
        this.acronym = Arrays.asList(phrase.split("[ _-]+")).stream()
            .map(e -> e.toUpperCase().substring(0, 1))
            .collect(Collectors.joining(""));
    }

    String get() {
        return acronym;
    }

}
