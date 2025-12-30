package racingcar.util;

import java.util.List;
import java.util.regex.Pattern;

public class CarNameValidation {
    private static final int CAR_LENGTH = 5;

    public static void validate(String carName) {
        validateLength(carName);
        validateBlank(carName);
        validateFormat(carName);
    }

    private static void validateLength(String carName) {
        if (carName.length() > CAR_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CARNAME_LENGTH.getMessage());
        }
    }

    private static void validateBlank(String carName) {
        if (carName.contains(" ")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_BLANK.getMessage());
        }
    }

    private static void validateFormat(String carName) {
        if (Pattern.matches("^[a-zA-Z]", carName));
    }

    private static void validateDuplicate(List<String> cars) {
        if (cars.size() != cars.stream().distinct().count()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CARNAME_DUPLICATION.getMessage());
        }
    }
}