public class EliudsEggs {
    public int eggCount(int number) {
        if (number < 0)
            throw new IllegalArgumentException("Invalid input");

        int output = 0;
        while (number > 0) {
            if (number % 2 != 0) output++;
            number /= 2;
        }
        return output;
    }
}
