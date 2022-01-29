package designpattern.command;

import designpattern.composite.Ball;
import designpattern.composite.Slingshot;

import java.util.ArrayList;
import java.util.List;

public class HitSlingshot implements Execute {

    private List<Integer> pointsList = new ArrayList<>();

    Slingshot slingshot;

    public HitSlingshot(Slingshot slingshot){
        this.slingshot = slingshot;
    }

    public void execute(Ball ball){
        slingshot.hitSlingshot();
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
