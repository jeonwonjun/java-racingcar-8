package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import racingcar.model.Information;
import racingcar.view.OutputView;

public class OutputVieTest {

    static Stream<Arguments> winner() {
        return Stream.of(
                Arguments.of(Arrays.asList("pobi", "won", "jun")),
                Arguments.of(List.of("jun"))
        );
    }

    @ParameterizedTest
    @MethodSource("winner")
    void 최종_우승자(List<String> carNames) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        // given
        String result = String.format(Information.WINNER.toString(), String.join(", ", carNames));
        // when
        OutputView.winner(Information.WINNER.toString(), carNames);
        // then
        assertThat(output.toString()).isEqualTo(result);
    }
}
