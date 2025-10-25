package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Collection;
import java.util.Collections;

public class Car {
    private final String name;
    private int location;

    public Car(String name) {
        this.name = name;
        this.location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void go() {
        location++;
    }

    public boolean goOrStop() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}
