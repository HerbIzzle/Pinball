package designpattern.state;
import designpattern.singelton.Pinball;
import com.start.PinballMachine;

public class NoCreditState implements State {


    PinballMachine pinballMachine;

    public NoCreditState(PinballMachine pinballMachine){
        this.pinballMachine = pinballMachine;
    }

    public void insertCoin(){
        pinballMachine.addCredit();
        pinballMachine.setState(pinballMachine.getReadyState());

    }
    public void pullLauncher(){
        System.out.println("no Credit has been added yet");
        System.out.println("ball cant be shooooot");
    }


}
