class NaturalNumber {
    private final int number;
    NaturalNumber(int number) {
        this.number = number;

        if (this.number < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }

    private int getAliquotSum(){
        int sum = 0;
        for (int index = 1; index < this.number; index++)
            if (this.number % index == 0) sum += index;

        return sum;
    }

    Classification getClassification() {
        return getAliquotSum() > this.number ? Classification.ABUNDANT :
                getAliquotSum() < this.number ? Classification.DEFICIENT : Classification.PERFECT;
    }
}
