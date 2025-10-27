package racingcar.controller;

import racingcar.model.InputProcess;
import racingcar.model.Race;

public class RaceInit {
    public Race init() {
        String input = ViewController.readCarNames();
        String tryCount = ViewController.readTryCount();

        InputProcess inputProcess = new InputProcess(input, tryCount);

        return new Race(inputProcess.getCarNames(), inputProcess.getTryCount());
    }
}
