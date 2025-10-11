import java.util.ArrayList;
import java.util.List;

public class RnaTranscription {
    private final List<String> transcription = new ArrayList<>();

    String transcript(String character) {
        String output;
        switch (character) {
            case "A" -> output = "U";
            case "C" -> output = "G";
            case "G" -> output = "C";
            case "T" -> output = "A";
            default -> output = character;
        }
        return output;
    }

    String transcribe(String dnaStrand) {
        for (char nucleotide: dnaStrand.toCharArray()) {
            transcription.add(transcript(String.valueOf(nucleotide)));
        }
        return String.join("", transcription);
    }
}
