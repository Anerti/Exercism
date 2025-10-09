import java.util.List;
import java.util.TreeSet;

public class PangramChecker {   
    public boolean isPangram(String input) {
        return new TreeSet<>(List.of(input.replaceAll("[^a-zA-Z]", "").toLowerCase().split("")))
            .size() == 26;
    }
}
