
package designpattern.state;

import com.application.start.PinballMachine;

public class EndState implements State {

    PinballMachine pinballMachine;

    public EndState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    public void insertCoin() {
        pinballMachine.addCredit();
    }


    public void setToReady() {  if (pinballMachine.getTurnsTotal() > 0){
        pinballMachine.setState(pinballMachine.getReadyState());
        pinballMachine.startTheGame();
    }
    }

    public void PlayButtonPressed() {

        if (pinballMachine.getTurnsTotal() > 0){
            pinballMachine.setState(pinballMachine.getReadyState());
        }
        else{
            System.out.println("""
                ###########################################
                Game has Ended --- Enter Coin for new Game
                ###########################################""");
    }

    }
}
