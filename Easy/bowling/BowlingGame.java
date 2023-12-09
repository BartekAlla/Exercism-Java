import java.util.ArrayList;

class BowlingGame {
    private ArrayList<Integer> rolls = new ArrayList<>();

    void roll(int pins) {
        this.rolls.add(pins);
    }

    int score() {
        int totalScore = 0;
        int currentRoll = 0;
        for (int frame = 1; frame < 11; frame++) {
            if (isStrike(currentRoll)) {
                totalScore += 10 + strikeBonus(currentRoll);
                currentRoll++;

            } else if (isSpare(currentRoll)) {
                totalScore += 10 + spareBonus(currentRoll);
                currentRoll += 2;
            } else {
                totalScore += sumOfPinsInFrame(currentRoll);
                currentRoll += 2;
            }
        }
        return totalScore;
    }

    private int spareBonus(int currentRoll) {
        return this.rolls.get(currentRoll + 2);
    }

    private boolean isSpare(int currentRoll) {
        return sumOfPinsInFrame(currentRoll) == 10;
    }

    private int sumOfPinsInFrame(int currentRoll) {
        return this.rolls.get(currentRoll) + this.rolls.get(currentRoll + 1);
    }

    private int strikeBonus(int currentRoll) {
        return this.rolls.get(currentRoll + 1) + this.rolls.get(currentRoll + 2);
    }


    private boolean isStrike(int roll) {
        return this.rolls.get(roll) == 10;
    }



}