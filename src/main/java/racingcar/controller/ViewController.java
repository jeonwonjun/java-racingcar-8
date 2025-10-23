package racingcar.controller;

import racingcar.model.Information;
import racingcar.view.InputView;

public class ViewController {
    private static Information information;

    public static String readCarNames() {
        information = Information.INPUT_CAR_NAME;
        System.out.println(information.toString());
        return InputView.readInput();
    }

    public static String readTryCount() {
        information = Information.INPUT_TRY_COUNT;
        System.out.println(information.toString());
        return InputView.readInput();
    }
}
