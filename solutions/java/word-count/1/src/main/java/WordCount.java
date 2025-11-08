import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> count = new TreeMap<>();

        List<String> words = List.of(input.toLowerCase().split("[^a-zA-Z0-9']"));

        for (String word : words) {
            if (word.endsWith("'"))
                word = word.substring(0, word.length() - 1);
            if (word.startsWith("'"))
                word = word.substring(1);
            if (!word.isEmpty())
                count.merge(word, 1, Integer::sum);
        }
        return count;
    }
}
