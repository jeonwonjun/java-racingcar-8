package racingcar.util;

public class TryCountValidation {
    private static final int MIN_TRY_COUNT = 1;

    public static void validateRange(int tryCount) {
        if (tryCount < MIN_TRY_COUNT) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_TRYCOUNT_RANGE.getMessage());
        }
    }

    public static int validateFormat(String tryCountInput) {
        try {
            return Integer.parseInt(tryCountInput);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_TRYCOUNT_NUMBER_FORMAT.getMessage());
        }
    }
}
