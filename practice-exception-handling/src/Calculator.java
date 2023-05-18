public class Calculator {
    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number needs to be 0 or greater.");
        }
        int factorialNum = 1;
        for (int i = 1; i <= num; i++) {
            factorialNum *= i;
        }

        return factorialNum;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || subsetSize > setSize ) {
            throw new IllegalArgumentException("Subset size and set size must be non-negative and subset size cannot exceed size set.");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
