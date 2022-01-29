package designpattern.composite;

public class Bumper implements GameElement{


    public Bumper() {
    }


    @Override
    public void hitSlingshot() {

    }

    @Override
    public void hitTarget() {

    }

    public void hitBumper(){
        System.out.println("You hit a Bumper!");
    }

    @Override
    public void openRamp() {

    }

    @Override
    public void closeRamp() {

    }


}
