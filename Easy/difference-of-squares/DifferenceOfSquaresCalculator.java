class DifferenceOfSquaresCalculator {
    public int squareOfValue(int input) {
        return input*input;
    }
    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return squareOfValue(sum);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += squareOfValue(i);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
