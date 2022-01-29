package designpattern.state;

import com.application.start.PinballMachine;

public class ReadyState implements State {

    PinballMachine pinballMachine;

    public ReadyState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    public void insertCoin() {
        pinballMachine.addCredit();

    }

    public void setToReady() {

        if (pinballMachine.getTurnsTotal() > 0) {
            pinballMachine.setState(pinballMachine.getEndState());

            pinballMachine.startTheGame();
            pinballMachine.removeTurn();
        }else{
            pinballMachine.setState(pinballMachine.getEndState());
        }
    }

    public void PlayButtonPressed() {

    }

}
