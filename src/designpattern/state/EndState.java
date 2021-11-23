


package designpattern.state;
import designpattern.singelton.Pinball;

import com.start.PinballMachine;

public class EndState implements State{

    PinballMachine pinballMachine;

    public EndState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    public void insertCoin(){}
    public void pullLauncher(){}
}
