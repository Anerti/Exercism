class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier
                .replace(" ", "_")
                .replace("4", "a")
                .replace("3", "e")
                .replace("0", "o")
                .replace("1", "l")
                .replace("7", "t");

        StringBuilder output = new StringBuilder(identifier);
        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == '-' && i + 1 < output.length()) {
                output.setCharAt(i + 1, Character.toUpperCase(output.charAt(i + 1)));
            }
            if (!Character.isLetter(output.charAt(i)) && output.charAt(i) != '_') {
                output.deleteCharAt(i);
                i--;
            }
        }
        
        return output.toString();
    }
}
