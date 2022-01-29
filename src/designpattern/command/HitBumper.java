package designpattern.command;

import designpattern.composite.Ball;
import designpattern.composite.Bumper;

import java.util.ArrayList;
import java.util.List;

public class HitBumper implements Execute {

    private List<Integer>pointsList = new ArrayList<>();

    Bumper bumper;

    public HitBumper(Bumper bumper) {
        this.bumper = bumper;
    }

    @Override
    public void execute(Ball ball) {
        bumper.hitBumper();
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
