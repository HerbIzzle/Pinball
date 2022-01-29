package designpattern.state;

import com.application.start.PinballMachine;

public class PlayingState implements State {


    PinballMachine pinballMachine;

    public PlayingState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;

    }

    public void insertCoin() {  pinballMachine.addCredit();
    }


    public void setToReady() {
        pinballMachine.startTheGame();

    }

    public void PlayButtonPressed() {

        pinballMachine.setState(pinballMachine.getEndState());
        pinballMachine.startTheGame();
    }

}
