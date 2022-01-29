package com.application.start;

public class Main {

    public static void main(String[] args) {

        PinballMachine pm = new PinballMachine();

        // pm.initializeGame();  // cant do - wrong state;
        // pm.startButtonPressed();

        pm.insertCoin(); // adds 1 coin = 3 turns to play

        //------- Turn 1 ------//
        pm.setToReady();
        pm.playButtonPressed();

        //------ Turn 2 -------//
        pm.setToReady();
        pm.playButtonPressed();

        //------ Turn 3 -------//
        pm.setToReady();
        pm.playButtonPressed();


        //---- Game Over -----// add more coins!

    }
}
