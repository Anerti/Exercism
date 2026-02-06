class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        String value = Integer.toString(numberToCheck);
        int power = value.length();
        int sum = 0;

        for (char number : value.toCharArray())
            sum += (int) Math.pow(Integer.parseInt(String.valueOf(number)), power);
        return sum == numberToCheck;
    }
}
