import java.math.BigInteger;

class Grains {
    BigInteger grainsOnSquare(final int square) {
        if (!(square > 0 && square < 65))
            throw new IllegalArgumentException("square must be between 1 and 64");

        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= square; i++) 
            result = result.multiply(BigInteger.valueOf(2));
        return result;
    }

    BigInteger grainsOnBoard() {
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= 64; i++) 
            result = result.add(grainsOnSquare(i));
        return result;
    }

}
