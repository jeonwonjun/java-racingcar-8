package racingcar.model;

import java.util.Arrays;
import java.util.List;

public class InputProcess {
    private final List<String> carNames;
    private final int tryCount;

    public InputProcess(String input, String tryCount) {
        this.carNames = parse(input);
        this.tryCount = Integer.parseInt(tryCount);
    }

    private List<String> parse(String input) {
        return Arrays.asList(input.split(","));
    }

    public List<String> getCarNames() {
        return carNames;
    }
}
