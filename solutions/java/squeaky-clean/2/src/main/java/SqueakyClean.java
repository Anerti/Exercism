import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {
    static String replace(String str) {
        Pattern pattern = Pattern.compile("[^\\w-]");
        Matcher matcher = pattern.matcher(str);

        return str.equals(" ") ? "_"
                : str.equals("4") ? "a"
                : str.equals("3") ? "e"
                : str.equals("0") ? "o"
                : str.equals("1") ? "l"
                : str.equals("7") ? "t"
                : matcher.find() ? ""
                : str;
    }

    static String clean(String identifier) {
        StringBuilder output = new StringBuilder();
        
        for (String letter : identifier.split("")) {
            output.append(replace(letter));
        }
        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == '-' && i + 1 < output.length())
                output.setCharAt(i + 1, Character.toUpperCase(output.charAt(i + 1)));
        }
        return output.toString().replace("-", "");
    }
}