import java.util.List;

class RotationalCipher {
    private final int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (c >= 'a' && c <= 'z') result.append((char) (((c + shiftKey - 97) % 26) + 97));
            if (c >= 'A' && c <= 'Z') result.append((char) (((c + shiftKey - 65) % 26) + 65));
            if (!Character.isLetter(c)) result.append(c);
        }
        return result.toString();
    }
}
