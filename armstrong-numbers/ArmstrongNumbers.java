class ArmstrongNumbers {
    public int getIntDigitLength(int number) {
        return String.valueOf(number).length();
    }

    public int getLastDigitFromInt(int number) {
        return Math.abs(number) % 10;
    }

    boolean isArmstrongNumber(int numberToCheck) {
        int result = 0;
        int number = numberToCheck;
        while (number > 0) {
            result += Math.pow(getLastDigitFromInt(number), getIntDigitLength(numberToCheck));
            number /= 10;
        }
        return numberToCheck == result;
    }

}
