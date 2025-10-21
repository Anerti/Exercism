import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hamming {
    private final String leftStrand;
    private final String rightStrand;
    private static final Pattern pattern = Pattern.compile("^[AGCT]*$");
    private int hammingDistance = 0;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        
        if (this.leftStrand.length() != this.rightStrand.length())
            throw new IllegalArgumentException("strands must be of equal length");
        
        final Matcher validStrand = pattern.matcher(this.leftStrand + this.rightStrand);
        if (!validStrand.find())
            throw new IllegalArgumentException("Strand contains an invalid character");
    }

    public int getHammingDistance() {
        for (int i = 0; i < leftStrand.length(); i++)
            if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) hammingDistance++;
        return hammingDistance;
    }
}
