package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Diyor",'M', LocalDate.of(2001,4,16), "QA", 100000);

        System.out.println(tester1.gender);
        System.out.println(tester1.DofB);

        Developer developer1 = new Developer("Abbos",'M',LocalDate.of(1997,12,12),"SDET",125000);


        System.out.println(developer1);


    }
}
