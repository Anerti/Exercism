import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Anagram {
    private String word;
    public Anagram(String word) {
        this.word = word;
    }

    private List<Integer> transform(String data) {
        List<Integer> list = new ArrayList<>();
        for (String letter : data.split(""))
            list.add(letter.toLowerCase().codePointAt(0));
        Collections.sort(list);
        return list;
    }

    public List<String> match(List<String> candidates) {
        List<String> stdout = new ArrayList<>();

        for(String candidate: candidates)
            if (!this.word.equalsIgnoreCase(candidate) && transform(candidate).equals(transform(this.word)))
                stdout.add(candidate);
        return stdout;
    }

}