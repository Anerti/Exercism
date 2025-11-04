import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class HighScores {
    private final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return this.highScores.getLast();
    }

    Integer personalBest() {
        return Collections.max(this.highScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> stdout = this.highScores.stream()
            .sorted(Comparator.reverseOrder())
            .toList();
        
        if (this.highScores.size() > 3)
            return stdout.subList(0, 3);
        
        return stdout;
    }

}
