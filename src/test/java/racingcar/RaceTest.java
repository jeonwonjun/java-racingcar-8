package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.Race;

public class RaceTest {

    @Test
    void 우승자_구하기() {
        // given
        Race race = new Race(List.of("pobi", "won", "jun"));
        List<Car> cars = race.getCars();
        // when
        cars.get(0).go();
        cars.get(1).go();
        cars.get(1).go();
        cars.get(2).go();
        cars.get(2).go();

        // then
        List<String> winners = race.getWinner();
        assertThat(winners).isEqualTo(List.of("won", "jun"));
    }
}
