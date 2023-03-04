package Professions.Accountant;

import Professions.Position.Position;

public class Accountant implements Position {
    @Override
    public void getPositionInfo() {
        System.out.println("Position: Accountant");
    }
}
