package racingcar.model;

import java.util.Arrays;
import java.util.List;
import racingcar.validation.Validation;

public class InputProcess {
    private final List<String> carNames;
    private final int tryCount;

    public InputProcess(String input, String tryCount) {
        this.carNames = parseInput(input);
        this.tryCount = parseTryCount(tryCount);
    }

    private static List<String> parseInput(String input) {
        Validation.validateBlank(input);
        List<String> parseInput = Arrays.asList(input.split(","));
        Validation.validateCarNameDuplication(parseInput);
        Validation.validateLength(parseInput);
        return parseInput;
    }

    private static int parseTryCount(String tryCount) {
        int count = Validation.validateToInt(tryCount);
        Validation.validateCount(count);
        return count;
    }

    public List<String> getCarNames() {
        return carNames;
    }

    public int getTryCount() {
        return tryCount;
    }
}
