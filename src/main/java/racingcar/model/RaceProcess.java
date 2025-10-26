package racingcar.model;

import java.util.List;
import racingcar.controller.ViewController;
import racingcar.view.OutputView;

public class RaceProcess {
    private final Race race;

    public RaceProcess(Race race) {
        this.race = race;
    }

    public void startRace(int moveCount) {
        ViewController.printStartRace();
        for (int i = 0; i < moveCount; i++) {
            race.racing();
            OutputView.raceProcess(race.getCars());
        }
    }
}
