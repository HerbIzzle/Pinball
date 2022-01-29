package designpattern.command;

import designpattern.composite.Ball;
import designpattern.composite.GameElement;
import designpattern.composite.Target;

import java.util.ArrayList;
import java.util.List;

public class HitTarget implements Execute {

    private List<Integer>pointsList = new ArrayList<>();

    Target target;

    public HitTarget(Target target) {
        this.target = target;
    }

    @Override
    public void execute(Ball ball) {
      target.hitTarget();
        System.out.println("You hit a target!");
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
