class RaindropConverter {

    public boolean isFactor(int number, int factor) {
        return number % factor == 0;
    }
    String convert(int number) {
       String result = "";
       if (isFactor(number, 3)) {
           result += "Pling";
       }
       if (isFactor(number, 5)) {
           result += "Plang";
       }
       if (isFactor(number, 7)) {
           result += "Plong";
       }
        if (!isFactor(number, 3) && !isFactor(number, 5) && !isFactor(number, 7)) {
            result = String.valueOf(number);
        }
       return result;
    }

}
