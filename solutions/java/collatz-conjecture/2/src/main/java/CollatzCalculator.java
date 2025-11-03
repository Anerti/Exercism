class CollatzCalculator {
    private int count = -1;

    int computeStepCount(int start) {
        if (start <= 0) throw new IllegalArgumentException("Only positive integers are allowed");
        count++;

        return start == 1 ? count : computeStepCount((start % 2 == 0) ? start / 2 : (start * 3) + 1);
    }

}
