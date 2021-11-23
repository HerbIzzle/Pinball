package designpattern.singelton;



public class Pinball {

    private static Pinball pinball;


    private Pinball() {}

    public static Pinball getInstanceOfPinball(){
        if (pinball == null) {
            pinball = new Pinball();
        }
      return pinball;
    }

    public void ballMovement(){
        System.out.println("ball is shoooooting");
    }

    public void hitElement(){

    }

}
