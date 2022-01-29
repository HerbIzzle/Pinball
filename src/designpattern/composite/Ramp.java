package designpattern.composite;


public class Ramp implements GameElement {

    private boolean isClosed;

    public Ramp(){
        this.isClosed = true;
    }

    public void openRamp(){this.isClosed = false;}
    public void closeRamp(){this.isClosed = true;}


    @Override
    public void hitSlingshot() {}
    @Override
    public void hitTarget() {}
    @Override
    public void hitBumper() {}

}
