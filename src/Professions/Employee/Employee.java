package Professions.Employee;

import Professions.Position.Position;

public class Employee implements Position {
    @Override
    public void getPositionInfo() {
        System.out.println("Position: Employee");
    }
}
