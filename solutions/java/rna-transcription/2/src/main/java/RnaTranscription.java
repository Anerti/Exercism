import java.util.ArrayList;
import java.util.List;

public class RnaTranscription {
    private final List<String> transcription = new ArrayList<>();

    String transcript(String character) {
        return character.equals("A") ? "U"
                : character.equals("T") ? "A"
                : character.equals("C") ? "G"
                : character.equals("G") ? "C"
                : "";
    }

    String transcribe(String dnaStrand) {
        for (char nucleotide: dnaStrand.toCharArray()) {
            transcription.add(transcript(String.valueOf(nucleotide)));
        }
        return String.join("", transcription);
    }
}
