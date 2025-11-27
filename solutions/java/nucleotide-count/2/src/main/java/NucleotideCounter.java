import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NucleotideCounter {
    private final String sequence;
    private final Map<Character, Integer> count = new HashMap<>();

    {
        count.put('A', 0);
        count.put('C', 0);
        count.put('G', 0);
        count.put('T', 0);
    }

    private static final Pattern pattern = Pattern.compile("^[ATCG]*$");
    NucleotideCounter(String sequence) {
        this.sequence = sequence;
        Matcher matcher = pattern.matcher(sequence);
        
        if (!matcher.find()) throw new IllegalArgumentException("Invalid sequence");
        for (Character nucleotide : this.sequence.toCharArray()) {
            count.put(nucleotide, count.get(nucleotide) + 1);
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        return count;
    }
}
