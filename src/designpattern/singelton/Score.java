package designpattern.singelton;

import com.application.start.PinballMachine;
import designpattern.command.Execute;

import java.util.ArrayList;
import java.util.List;

public class Score {

    private List<Score>pointsList = new ArrayList<>();

    private static Score score = null;
    public int points = 0;

    private Score() {

    }

    public static Score getInstanceOfScore(){
        if (score == null) {
            score = new Score();
        }
      return score;
    }

    public int hitTargetPoints() { return  points += 300; }

    public int hitBumperPoints() { return points += 150; }

    public int runRampPoints() {
        return points += 500;
    }

    public int hitSlingShotPoints() {
        return points += 250;
    }


    public void resetScore(){points = 0;}

    public void displayScore(){
        for (Score s:pointsList
             ) {
            System.out.println(s);

        }
    }
}
