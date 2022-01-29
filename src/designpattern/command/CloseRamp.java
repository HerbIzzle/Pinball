package designpattern.command;

import designpattern.composite.Ball;
import designpattern.composite.Ramp;

public class CloseRamp implements Execute {



    private Ramp ramp;

    public CloseRamp(Ramp ramp) {
        this.ramp = ramp;
    }


    @Override
    public void execute(Ball ball) {
        ramp.closeRamp();
        System.out.println("Ramp has been closed");
    }
}
