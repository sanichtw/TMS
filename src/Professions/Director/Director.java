package Professions.Director;

import Professions.Position.Position;

public class Director implements Position {
    @Override
    public void getPositionInfo() {
        System.out.println("Position: Director");
    }
}
