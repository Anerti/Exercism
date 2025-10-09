import java.util.Arrays;
import java.util.stream.Collectors;

public class PangramChecker {
    public boolean isPangram(String input) {
        return Arrays.stream(input.replaceAll("[^a-zA-Z]", "").toLowerCase().split(""))
                     .sorted()
                     .distinct()
                     .collect(Collectors.joining(""))
                     .equals("abcdefghijklmnopqrstuvwxyz");
    }
}
