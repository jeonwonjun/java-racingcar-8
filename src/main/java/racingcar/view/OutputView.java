package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView {

    public void result(String format, List<String> output) {
        System.out.printf(format, String.join(",", output));
    }

    public static void process(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getLocation()));
        }
    }
}
