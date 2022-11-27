package Day42_static;

public class CapitalOne {
    public static void main(String[] args) {
        Tester[] testers = { new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Diyor", 'M',15111,"Lead tester",150000);
        testers[1].setInfo("Abbos", 'M',15101,"Tester",120000);
        testers[2].setInfo("Rasul", 'M',15112,"Tester",100000);

        Developer[] developers={ new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Frank",'M',15000, "Lead Dev",200000);
        developers[1].setInfo("Mike",'M',15001, "Dev",190000);
        developers[2].setInfo("Mila",'F',15002, "Dev",180000);
        developers[3].setInfo("Chris",'F',15003, "Dev",170000);
        developers[4].setInfo("Fara",'M',15004, "Dev",160000);




        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan", "Hamit","Israil");
        team1.addTester(testers);
        team1.addDeveloper(developers);
        System.out.println(team1);
        System.out.println("=======================");
        for (Tester each: team1.testers){
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("=========================");

        for (Developer each1: team1.developers){
            System.out.println(each1.name+" : $"+each1.salary);
        }
        System.out.println("=====================");
        team1.removeTester(15112);
        team1.removeDeveloper(15002);
        System.out.println(team1);
        System.out.println("========================");
        Developer dev1= new Developer();
        dev1.setInfo("Luisa",'F',15015,"Dev",150000);
        team1.addDeveloper(dev1);
        System.out.println(team1);

        ScrumTeam[] scrumTeams = {team1, new ScrumTeam(), new ScrumTeam()};


    }
}
