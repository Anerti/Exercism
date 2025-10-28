import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneNumber {
    private String numberString;
    private static final Pattern alphabetPattern = Pattern.compile("[a-zA-Z]+");
    private static final Pattern punctuationPattern = Pattern.compile("[^\\d\\s.\\-()+]+");

    PhoneNumber(String numberString) {
        this.numberString = numberString;

        final Matcher matchAlphabet = alphabetPattern.matcher(this.numberString);
        if (matchAlphabet.find()) throw new IllegalArgumentException("letters not permitted");

        final Matcher matchPunctuation = punctuationPattern.matcher(this.numberString);
        if (matchPunctuation.find())
            throw new IllegalArgumentException("punctuations not permitted");

        this.numberString = this.numberString.replaceAll("\\D", "");
        if (this.numberString.length() < 10)
            throw new IllegalArgumentException("must not be fewer than 10 digits");

        if (this.numberString.length() > 11)
            throw new IllegalArgumentException("must not be greater than 11 digits");

        if (this.numberString.length() == 11){
            if (!(this.numberString.startsWith("1")))
                throw new IllegalArgumentException("11 digits must start with 1");
            this.numberString = this.numberString.substring(1);
        }

        if (this.numberString.startsWith("0"))
            throw new IllegalArgumentException("area code cannot start with zero");
        if (this.numberString.startsWith("1"))
            throw new IllegalArgumentException("area code cannot start with one");
        if (this.numberString.charAt(3) == '0')
            throw new IllegalArgumentException("exchange code cannot start with zero");
        if (this.numberString.charAt(3) == '1')
            throw new IllegalArgumentException("exchange code cannot start with one");
    }

    String getNumber() { return this.numberString; }
}