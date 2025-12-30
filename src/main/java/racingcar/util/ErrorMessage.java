package racingcar.util;

public enum ErrorMessage {
    INVALID_CARNAME_LENGTH("자동차 이름은 5자 이하만 가능합니다."),
    INVALID_CARNAME_DUPLICATION("자동차 이름은 중복될 수 없습니다."),
    INVALID_CARNAME_FORMAT("자동차 이름에는 영어만 가능합니다."),
    INVALID_BLANK("자동차 이름에는 공백이 있으면 안됩니다."),
    INVALID_TRYCOUNT_RANGE("시도횟수는 최소 1번이어야 합니다."),
    INVALID_TRYCOUNT_NUMBER_FORMAT("시도횟수는 숫자이어야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
