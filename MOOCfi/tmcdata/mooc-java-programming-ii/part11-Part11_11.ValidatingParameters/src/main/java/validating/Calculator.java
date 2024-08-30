package validating;

public class Calculator {

    public int factorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Input should be equal or greater than 0.");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if (setSize < subsetSize) {
            throw new IllegalArgumentException("Subset can't be bigger than set!");
        }

        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Polinomials can't be negative");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
