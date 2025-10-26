package racingcar.validation;

import java.util.List;

public class Validation {

    public static void validateCarName(String carName) {
        validateLength(carName);
        validateBlank(carName);
    }

    private static void validateLength(String carName) {
        if (carName.length() > 5 || carName.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 1글자 이상, 5글자 이하여야 합니다.");
        }
    }

    private static void validateBlank(String carName) {
        if (carName.isBlank()) {
            throw new IllegalArgumentException("자동차 이름에는 공백이 들어오면 안됩니다.");
        }
    }

    public static void validateCarNameDuplication(List<String> carNames) {
        if (carNames.size() != carNames.stream().distinct().count()) {
            throw new IllegalArgumentException("자동자 이름은 중복되면 안됩니다.");
        }
    }

    public static void validateTryCount(int trycount) {
        if (trycount < 0) {
            throw new IllegalArgumentException("시도횟수는 최소 0번 이어야합니다.");
        }
    }
}
