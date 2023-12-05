import java.math.BigInteger;

class Grains {
    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        } else {
            return BigInteger.TWO.pow(square-1);
        }
    }
    BigInteger grainsOnBoard() {
        return grainsOnBoardRecursive(64, BigInteger.ZERO);
    }
    private BigInteger grainsOnBoardRecursive(int square, BigInteger totalGrains) {
        if (square == 0) {
            return totalGrains;
        } else {
            return grainsOnBoardRecursive(square - 1, totalGrains.add(grainsOnSquare(square)));
        }
    }
}
//Inna wersja
//import java.math.BigInteger;
//class Grains {
//    BigInteger grainsOnSquare(final int square) {
//        if ((square <= 0) || (square >= 65)) {
//            throw new IllegalArgumentException("square must be between 1 and 64");
//        }
//        return BigInteger.valueOf(2).pow(square - 1);
//    }
//    BigInteger grainsOnBoard() {
//        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
//    }
//}