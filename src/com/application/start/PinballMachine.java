package com.application.start;

import designpattern.command.*;
import designpattern.composite.*;
import designpattern.state.*;
import designpattern.singelton.*;


public class PinballMachine {

    private final NoCreditState noCreditState;
    private final ReadyState readyState;
    private final PlayingState playingState;
    private final EndState endState;

    private final Score score = Score.getInstanceOfScore();

    private State aktuellerState;

    private int credit = 0;
    private int turnsTotal = 0;


    public PinballMachine() {
        noCreditState = new NoCreditState(this);
        readyState = new ReadyState(this);
        playingState = new PlayingState(this);
        endState = new EndState(this);


        if (credit > 0) {
            aktuellerState = readyState;
        } else {
            aktuellerState = noCreditState;
        }
    }


    public void insertCoin() {
        aktuellerState.insertCoin();
    }

    public void playButtonPressed() {
        aktuellerState.PlayButtonPressed();
    }

    public void startTheGame() {

        System.out.println("""
                #####################################
                """);
        System.out.println("    CREDIT :   " + credit);
        System.out.println("    TURNS  :   " + turnsTotal);
        System.out.println("    Pinball Game has started");
        System.out.println("""
                                
                -------------- Action ---------------
                """);

        //-------------------------------------------//
        GameTable gameTable = new GameTable();
        //-------------------------------------------//
        Ball playBall = new Ball();
        Flipper leftFlipper = new Flipper();
        Flipper rightFlipper = new Flipper();
        Bumper bumper = new Bumper();
        Ramp gameRamp = new Ramp();
        Slingshot slingshot = new Slingshot();
        Target target = new Target();
        //-------------------------------------------//
        gameTable.add(playBall);
        gameTable.add(leftFlipper);
        gameTable.add(rightFlipper);
        gameTable.add(bumper);
        gameTable.add(gameRamp);
        gameTable.add(slingshot);
        gameTable.add(target);
        //-------------------------------------------//

        HitBumper hitBumper = new HitBumper(bumper);
        HitSlingshot hitSlingshot = new HitSlingshot(slingshot);
        HitTarget hitTarget = new HitTarget(target);
        CloseRamp closeRamp = new CloseRamp(gameRamp);
        OpenRamp openRamp = new OpenRamp(gameRamp);

        //-------------------------------------------//

        hitBumper.addScore(score.hitBumperPoints());
        hitTarget.addScore(score.hitTargetPoints());
        hitSlingshot.addScore(score.hitSlingShotPoints());
        openRamp.addScore(score.runRampPoints());
        //-------------------------------------------//

        hitBumper.execute(playBall);
        hitSlingshot.execute(playBall);
        hitTarget.execute(playBall);
        openRamp.execute(playBall);
        closeRamp.execute(playBall);

        //
        //------------------------------------------//
        System.out.println("""
                                
                --------------Total Score -----------
                                                       """);
        System.out.println("Game has ended. Your score : " + score.points);

        if (score.points > 3500) {
            System.out.println("you scored over 3500 points , you recieve a superball! (extra turn) ");

            score.resetScore();
            turnsTotal += 1;
        }

        System.out.println("""
                                
                #####################################""");



    }

    public void addCredit() {
        credit += 1;
        turnsTotal += 3;
    }

    public void removeTurn() {

        turnsTotal -= 1;
        if (turnsTotal <= 0) {
            credit = 0;
            score.resetScore();
        }
    }
    public Score getScore() {
        return score;
    }

    public int getTurnsTotal() {
        return turnsTotal;
    }

    public int getCredit() {
        return credit;
    }

    public void setToReady() {
        aktuellerState.setToReady();
    }

    public State getAktuellerState() {
        return aktuellerState;
    }

    public void setState(State aktuellerState) {
        this.aktuellerState = aktuellerState;
    }

    public NoCreditState getNoCreditState() {
        return noCreditState;
    }

    public ReadyState getReadyState() {
        return readyState;
    }

    public PlayingState getPlayingState() {
        return playingState;
    }

    public EndState getEndState() {
        return endState;
    }

}
