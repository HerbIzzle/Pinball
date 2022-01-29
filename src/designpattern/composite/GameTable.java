package designpattern.composite;

import designpattern.command.Execute;

import java.util.ArrayList;
import java.util.List;

public class GameTable {


    public GameTable() {

    }

    private List<GameElement> gameTableList = new ArrayList<>();


    public void add(GameElement e) {
        gameTableList.add(e);
    }


}
