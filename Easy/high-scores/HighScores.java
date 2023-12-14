import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class HighScores {
    private List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        Integer bestScore = 0;
        for (int i = 0; i < this.highScores.size() - 1; i++) {
            if (this.highScores.get(i) > bestScore) {
                bestScore = highScores.get(i);
            }
        }
        return bestScore;
    }

    List<Integer> personalTopThree() {
        return highScores.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

    }

}
