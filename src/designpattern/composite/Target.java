package designpattern.composite;

public class Target implements GameElement{

    public Target() {}

    @Override
    public void hitSlingshot() {}
   @Override
    public void hitTarget(){
    }
    @Override
    public void hitBumper() {}
    @Override
    public void openRamp() {}
    @Override
    public void closeRamp() {}

}
