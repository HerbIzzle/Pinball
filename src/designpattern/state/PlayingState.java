package designpattern.state;
import designpattern.singelton.Pinball;

import com.start.PinballMachine;

public class PlayingState implements State{


    PinballMachine pinballMachine;

    public PlayingState(PinballMachine pinballMachine){
        this.pinballMachine = pinballMachine;
    }

    public void insertCoin(){}
    public void pullLauncher(){
        System.out.println("already launched");
    }

}
