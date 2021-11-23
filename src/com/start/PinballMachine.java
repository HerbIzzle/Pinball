package com.start;

import designpattern.state.*;
import designpattern.singelton.*;


public class PinballMachine {


        NoCreditState noCreditState;
        ReadyState readyState;
        PlayingState playingState;
        EndState endState;

       public Pinball pinball = Pinball.getInstanceOfPinball();

        State aktuellerState;

    public String toString() {
       // System.out.println(aktuellerState);
        System.out.println("---PinballMachine{" +
                "aktuellerState= " + aktuellerState +
                "Credit :" + credit +
                "Turns : " + turnsLeft +
                "----}");
        return null;
    }

        int credit = 0;
        int turnsLeft = 0;


    public PinballMachine() {
        noCreditState = new NoCreditState(this);
        readyState = new ReadyState(this);
        playingState = new PlayingState(this);
        endState = new EndState(this);


        if (credit > 0){
            aktuellerState = readyState;
        } else {
            aktuellerState = noCreditState;
        }

    }

    public void setState(State aktuellerState){
        this.aktuellerState = aktuellerState;
    }

    public void insertCoin(){
        aktuellerState.insertCoin();
    }

    public void pullLauncher(){
        aktuellerState.pullLauncher();
    }


    public void addCredit(){
        credit += 1;
        turnsLeft += 3;
      //  System.out.println("Credit : " + credit + " Turns left : " + turnsLeft);
    }
    public void removeCredit(){
        turnsLeft -= 1;
    }
    public void addBall(){}
    public void removeBall(){}



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
