package racingcar.validation;

import java.util.Arrays;
import java.util.List;

public class Validation {

    public static void validateLength(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() > 5 || carName.isEmpty()) {
                throw new IllegalArgumentException("자동차 이름은 1글자 이상, 5글자 이하여야 합니다.");
            }
        }
    }

    public static void validateBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException("자동차 이름에는 공백이 들어오면 안됩니다.");
        }
    }

    public static int validateToInt(String trycount) {
        try {
            return Integer.parseInt(trycount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도회수는 숫자여야합니다.");
        }
    }

    public static void validateCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("시도횟수는 0번 이상이어야합니다.");
        }
    }

    public static void validateCarNameDuplication(List<String> carNames) {
        if (carNames.size() != carNames.stream().distinct().count()) {
            throw new IllegalArgumentException("자동자 이름은 중복되면 안됩니다.");
        }
    }
}
