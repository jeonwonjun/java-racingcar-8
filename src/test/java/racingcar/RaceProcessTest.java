package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.model.InputProcess;
import racingcar.model.Race;
import racingcar.model.RaceProcess;

public class RaceProcessTest {

    @Test
    void 레이스과정() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // given
        Race race = new Race(List.of("pobi", "won", "jun"));
        RaceProcess raceProcess = new RaceProcess(race);
        // when
        raceProcess.startRace(5);
        // then
        String result = outputStream.toString();
        assertThat(result).contains("실행 결과");

        race.getCars().forEach(car -> assertThat(result).contains(car.getName()));
    }
}
