package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class Race {
    private final List<Car> cars;

    public Race(List<String> carNames) {
        this.cars = carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void racing() {
        for (Car car : cars) {
            move(car);
        }
    }

    public List<String> getWinner() {
        int maxLocation = cars.stream().mapToInt(Car::getLocation).max().orElse(0);
        return cars.stream().filter(car -> car.getLocation() == maxLocation)
                .map(Car::getName)
                .toList();
    }

    private void move(Car car) {
        if (car.goOrStop())
            car.go();
    }

    public List<Car> getCars() {
        return cars;
    }
}
