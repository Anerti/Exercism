import java.util.Map;
import java.util.TreeMap;

class ParallelLetterFrequency {
    private final String[] texts;

    ParallelLetterFrequency(String[] texts) {
        this.texts = texts;
    }

    Map<Character, Integer> countLetters() {
        Map<Character, Integer> count = new TreeMap<>();
        String data = String.join("", this.texts);

        for (Character character : data.toLowerCase().toCharArray())
            if (Character.isLetter(character))
                count.merge(character, 1, Integer::sum);

        return count;
    }

}
