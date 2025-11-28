class Scrabble {

    private int countPoint(String letter){
        return switch (letter.toUpperCase()){
            case "A", "E", "I", "O", "U", "L", "N", "R", "S", "T" -> 1;
            case "D", "G" -> 2;
            case "B", "C", "M", "P" -> 3;
            case "F", "H", "V", "W", "Y" -> 4;
            case "K" -> 5;
            case "J", "X" -> 8;
            case "Q", "Z" -> 10;
            case "" -> 0;
            default -> throw new IllegalArgumentException("The word contains Invalid characters");
        };
    }

    private int points = 0;
    Scrabble(String word) {
        for (String letter : word.split("")) points += countPoint(letter);
    }

    public int getScore() { return points; }

}
