package Day49_InheritancePractice.ScrumTeamTask;

public class AppleInc {

    public static void main(String[] args) {
        Tester tester1 = new Tester("Diyor", 21, 'M', 100000, 12345, "QA");
        Tester tester2 = new Tester("Abbos", 24, 'M', 125000, 54321, "QA");
        Tester tester3 = new Tester("Rasul", 20, 'M', 130000, 3456, "QA");
        Tester[] testers = {tester1, tester2, tester3};
        Developer developer1 = new Developer("Ahmad", 22, 'M', 100000, 2223, "SQAT");
        Developer developer2 = new Developer("Bruno", 24, 'M', 105000, 223, "SQAT");
        Developer developer3 = new Developer("Max", 20, 'M', 100090, 222, "SQAT");
        Developer developer4 = new Developer("Mike", 32, 'M', 90000, 3, "SQAT");

        Developer[] developers = {developer1, developer2, developer3, developer4};
        ScrumTeam scrum1 = new ScrumTeam(testers, developers);
        System.out.println(scrum1);

        Tester[] testers2 = {
                new Tester("Frank", 24, 'M', 124444, 12, "QA"),
                new Tester("Bro", 26, 'M', 122222, 22, "QA")
        };

        Developer[] developers2 = {
                new Developer("Ramil", 22, 'F', 222222, 1, "QA"),
                new Developer("Bibi", 19, 'F', 121212, 2222222, "QA")
        };

        ScrumTeam scrum2 = new ScrumTeam(testers2, developers2);
        System.out.println(scrum2);

        scrum2.removeDeveloper(1);
        scrum1.removeTester(12345);

        ScrumTeam[] allScrumTeam = {scrum1, scrum2};
        for (ScrumTeam each : allScrumTeam) {
            for (Tester eachTester : each.testers) {
                System.out.println(eachTester.name + " " + eachTester.salary);
            }

        }

        System.out.println("=======================");
        for (ScrumTeam each : allScrumTeam) {
            for (Developer eachDeveloper : each.developers) {
                System.out.println(eachDeveloper.name + " " + eachDeveloper.salary);
            }
        }
    }

}
