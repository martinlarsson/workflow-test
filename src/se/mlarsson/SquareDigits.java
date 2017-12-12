package se.mlarsson;

/**
 * Class for squaring individual digits in a number.
 */
public class SquareDigits {
    /**
     * Calculations made in base 10.
     */
    private final int base = 10;

    /**
     * Returns a number with individual squares of each digit in input number.
     * @param digitsToBeSquared input value
     * @return squared digits
     * @throws IllegalArgumentException value must be positive
     */
    public final int square(final int digitsToBeSquared)
            throws IllegalArgumentException {
        if (digitsToBeSquared < 0) {
            throw new IllegalArgumentException(""
                    + "Value must be positive.");
        }
        int remainingDigits = digitsToBeSquared;
        int result = 0;
        int length = 0;
        while (remainingDigits > 0) {
            result += (Math.pow(remainingDigits % base, 2)
                    * Math.pow(base, length));
            remainingDigits = remainingDigits / base;
            length = (int) Math.log10(result) + 1;
        }
        return result;
    }
}

