package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InputProcessTest {

    @Test
    void 입력_테스트() {
        assertDoesNotThrow(() -> new InputProcess("pobi,woun,crong,robi", "5"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"popopo,won,ni", ",s,d", "a,s,,d"})
    void 예외_테스트_글자수(String input) {
        assertThrows(IllegalArgumentException.class, () -> new InputProcess(input, "1"));
    }

    @ParameterizedTest
    @ValueSource(strings = {" pobi,woni,crong", "pobi, woni,crong", "pobi,woni,crong "})
    void 예외_테스트_공백(String input) {
        assertThrows(IllegalArgumentException.class, () -> new InputProcess(input, "2"));
    }

    @Test
    void 예외_테스트_중복() {
        assertThrows(IllegalArgumentException.class, () -> new InputProcess("pobi,pobi,jun", "5"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1", "a"})
    void 예외_테스트_시도횟수(String tryCount) {
        assertThrows(IllegalArgumentException.class, () -> new InputProcess("pobi,woni,jun", tryCount));
    }

}
