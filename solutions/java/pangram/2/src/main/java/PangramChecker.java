import java.util.List;
import java.util.TreeSet;

public class PangramChecker {
    private static final TreeSet<String> alphabet = new TreeSet<>(List.of(
        "abcdefghijklmnopqrstuvwxyz"
        .split("")
    ));
    
    public boolean isPangram(String input) {
        return new TreeSet<>(List.of(input.replaceAll("[^a-zA-Z]", "").toLowerCase().split("")))
            .equals(alphabet);
    }
}
