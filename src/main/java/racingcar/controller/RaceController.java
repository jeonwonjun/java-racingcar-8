package racingcar.controller;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.InputProcess;
import racingcar.model.Race;
import racingcar.model.RaceProcess;
import racingcar.view.OutputView;

public class RaceController {

    private final Race race;
    private final RaceProcess raceProcess;

    public RaceController() {
        RaceInit raceInit = new RaceInit();
        this.race = raceInit.init();
        this.raceProcess = new RaceProcess(race);
    }


    public void start() {
        raceProcess.startRace(race.getTryCount());
        ViewController.printWinner(race.getWinner());
    }
}
