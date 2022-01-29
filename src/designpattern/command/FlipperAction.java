package designpattern.command;

import designpattern.composite.Ball;
import designpattern.composite.Flipper;

public class FlipperAction implements Execute{

    Flipper flipper;

    public FlipperAction(Flipper flipper) {
        this.flipper = flipper;
    }

    @Override
    public void execute(Ball ball) {flipper.hitBall();
    }
}
