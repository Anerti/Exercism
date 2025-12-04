import java.math.BigInteger;

class Grains {
    BigInteger grainsOnSquare(final int square) {
        if (!(square > 0 && square < 65))
            throw new IllegalArgumentException("square must be between 1 and 64");

        return BigInteger.TWO.pow(square - 1);
    }

    BigInteger grainsOnBoard() { return  BigInteger.TWO.pow(64).subtract(BigInteger.ONE); }

}
