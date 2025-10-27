package racingcar.controller;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.InputProcess;
import racingcar.model.Race;
import racingcar.model.RaceProcess;
import racingcar.view.OutputView;

public class RaceController {
    String input = ViewController.readCarNames();
    String tryCount = ViewController.readTryCount();
    InputProcess inputProcess = new InputProcess(input, tryCount);

    Race race = new Race(inputProcess.getCarNames());

    RaceProcess raceProcess = new RaceProcess(race);

    public void start() {
        raceProcess.startRace(inputProcess.getTryCount());
        ViewController.printWinner(race.getWinner());
    }
}
