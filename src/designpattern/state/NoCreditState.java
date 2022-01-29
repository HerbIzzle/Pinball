package designpattern.state;

import com.application.start.PinballMachine;

public class NoCreditState implements State {

    PinballMachine pinballMachine;

    public NoCreditState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    public void insertCoin() {
        pinballMachine.addCredit();
        pinballMachine.setState(pinballMachine.getReadyState());
    }


    public void setToReady() {
        System.out.println("cant do, wrong state");
    }

    public void PlayButtonPressed() {

        System.out.println("""
                ###########################################
                No credit has been entered -- You Cant Play
                ###########################################""");
    }


}
