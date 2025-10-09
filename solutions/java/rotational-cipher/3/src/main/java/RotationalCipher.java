import java.util.List;

class RotationalCipher {
    private final int shiftKey;
    private static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (!Character.isLetter(c)) result.append(c);
            else {
                final char offset = Character.isLowerCase(c) ? 'a' : 'A';
                int index = (c + shiftKey - offset) % 26;

                char insert = Character.isLowerCase(c) ? alphabet[index] 
                            : Character.toUpperCase(alphabet[index]);
                result.append(insert);
            }
        }
        return result.toString();
    }
}