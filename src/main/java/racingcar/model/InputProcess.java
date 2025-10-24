package racingcar.model;

import java.util.Arrays;
import java.util.List;

public class InputParse {
    private final List<String> carNames;

    public InputParse(String input) {
        this.carNames = parse(input);
    }

    private List<String> parse(String input) {
        List<String> splitInput = Arrays.asList(input.split(","));
        return splitInput;
    }

    public List<String> getCarNames() {
        return carNames;
    }
}
