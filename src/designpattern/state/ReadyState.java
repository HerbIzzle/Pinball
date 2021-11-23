package designpattern.state;
import designpattern.singelton.Pinball;

import com.start.PinballMachine;

public class ReadyState implements State {

    PinballMachine pinballMachine;

    public ReadyState(PinballMachine pinballMachine){
        this.pinballMachine = pinballMachine;
    }

    public void insertCoin(){
        pinballMachine.addCredit();

    }
    public void pullLauncher(){
       // pinballMachine.setState(pinballMachine.getEndState());
        pinballMachine.pinball.ballMovement();
        pinballMachine.removeCredit();
        pinballMachine.setState(pinballMachine.getPlayingState());


        //System.out.println("you pull launcher now");
    }

}
