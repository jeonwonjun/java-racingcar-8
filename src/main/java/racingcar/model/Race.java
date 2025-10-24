package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class Race {
    private final List<Car> cars;
    private final int tryCount;

    public Race(List<String> carNames, int tryCount) {
        this.cars = carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
        this.tryCount = tryCount;
    }
}
