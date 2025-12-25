import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Anagram {
    private final String word;

    public Anagram(String word) {
        this.word = word;
    }

    private Map<Character, Integer> frequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (char letter : word.toLowerCase().toCharArray())
            map.merge(letter, 1, Integer::sum);
        return map;
    }
    
    public List<String> match(List<String> candidates) {
        List<String> output = new ArrayList<>();
        Map<Character, Integer> initialFrequency = frequency(this.word);

        for(String candidate: candidates)
            if (!this.word.equalsIgnoreCase(candidate) && initialFrequency.equals(frequency(candidate)))
                output.add(candidate);
        return output;
    }
}