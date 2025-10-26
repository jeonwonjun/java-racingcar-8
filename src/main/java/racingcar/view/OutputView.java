package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView {

    // 최종 우승자 출력
    public static void winner(String format, List<String> output) {
        System.out.printf(format, String.join(", ", output));
    }

    // 실행 과정 출력
    public static void raceProcess(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getLocation()));
        }
        System.out.println();
    }
}
