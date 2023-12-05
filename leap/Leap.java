class Leap {
    public boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    public boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }

    public boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    boolean isLeapYear(int year) {
        return isDivisibleBy4(year) && (!isDivisibleBy100(year) || isDivisibleBy400(year));
    }

}
