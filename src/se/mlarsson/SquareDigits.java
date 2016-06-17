package se.mlarsson;

/**
 * Class for squaring individual digits in a number.
 */
public class SquareDigits {

    /**
     * Returns a number with individual squares of each digit in input number.
     * @param value input value
     * @return squared digits
     * @throws IllegalArgumentException
     */
    public final int square(int value) throws IllegalArgumentException {
        if (value < 0) throw new IllegalArgumentException("" +
                "Value must be positive.");
        int squared = 0;
        int length = 0;
        while (value > 0) {
            squared += (Math.pow(value%10,2) * Math.pow(10,length));
            value = value/10;
            length = (int)Math.log10(squared)+1;
        }
        return squared;
    }
}
