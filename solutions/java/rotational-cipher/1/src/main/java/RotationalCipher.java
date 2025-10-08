import java.util.List;

class RotationalCipher {
    private final int shiftKey;
    private final List<String> alphabet = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                int index = (Character.toLowerCase(c) + shiftKey - 97) % 26;
                result.append(alphabet.get(index));
            }
            if (Character.isLetter(c) && Character.isUpperCase(c)) {
                int index = (Character.toUpperCase(c) + shiftKey - 65) % 26;
                result.append(alphabet.get(index).toUpperCase());
            }
            if (!Character.isLetter(c)) result.append(c);
        }
        return result.toString();
    }
}
