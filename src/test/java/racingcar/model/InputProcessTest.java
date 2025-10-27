package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputProcessTest {

    @Test
    void 입력_테스트() {
        assertDoesNotThrow(() -> new InputProcess("pobi,woun,crong,robi", "5"));
    }

    @Test
    void 예외_테스트_공백() {
        assertThrows(IllegalAccessError.class, () -> new InputProcess("pobi, woun,crong", "2"));
    }

}
