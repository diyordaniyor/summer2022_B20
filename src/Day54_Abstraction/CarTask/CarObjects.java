package Day54_Abstraction.CarTask;

import Day54_Abstraction.EmployeeTask.Tester;

public class CarObjects {
    public static void main(String[] args) {
        BMW bmw =new BMW();
        Tesla tesla = new Tesla();
        Toyota toyota = new Toyota();
        Jeep jeep= new Jeep();

        bmw.start();
        tesla.start();
        jeep.start();
        toyota.start();
    }
}
