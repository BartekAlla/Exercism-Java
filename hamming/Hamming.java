public class Hamming {
    private String leftStrand;
    private String rightStrand;
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length()){
            this.leftStrand = leftStrand;
            this.rightStrand = rightStrand;
        } else {
            throw new IllegalArgumentException("strands must be of equal length");
        }
    }

    public int getHammingDistance() {
        int result = 0;
        for (int i = 0; i < this.leftStrand.length(); i++) {
            if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
