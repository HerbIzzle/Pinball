package designpattern.command;

import designpattern.composite.Ball;
import designpattern.composite.Ramp;

import java.util.ArrayList;
import java.util.List;

public class OpenRamp implements Execute {

    private List<Integer> pointsList = new ArrayList<>();

private Ramp ramp;

   public OpenRamp(Ramp ramp) {
        this.ramp = ramp;
    }

    @Override
    public void execute(Ball ball) {
       ramp.openRamp();
        System.out.println("Ramp is now open ");
        displayScore();

    }

    public void addScore(int points){
        pointsList.add(points);
    }

    public void displayScore(){
        for (Integer i:pointsList) {
            System.out.println(" new total : " + i);

        }
    }
}
