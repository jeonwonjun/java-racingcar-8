package racingcar.controller;

import java.util.List;
import racingcar.model.Information;
import racingcar.view.InputView;
import racingcar.view.OutputView;

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

    public static void printStartRace() {
        information = Information.RACE_RESULT;
        System.out.println("\n" + information.toString());
    }

    public static void printWinner(List<String> winner) {
        information = Information.WINNER;
        OutputView.winner(information.toString(), winner);
    }
}
