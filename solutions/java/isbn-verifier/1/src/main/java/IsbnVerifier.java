import java.util.ArrayList;
import java.util.List;

class IsbnVerifier {
    boolean isValid(String stringToVerify) {
        List<String> data = new ArrayList<>(
                List.of(stringToVerify.replaceAll("-", "").split(""))
        );

        if (data.size() != 10)
            return false;

        if (data.getLast().equals("X"))
            data.set(data.size() - 1, "10");

        int sum = 0;
        for (int index = 0; index < 10; index++) {
            if (Character.isLetter(data.get(index).charAt(0)))
                return false;
            sum += Integer.parseInt(data.get(index)) * (10 - index);
        }
        return sum % 11 == 0;
    }

}
