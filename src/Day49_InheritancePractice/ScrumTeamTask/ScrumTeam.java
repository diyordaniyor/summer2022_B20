package Day49_InheritancePractice.ScrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ArrayList<Tester> testers= new ArrayList<>();
    public ArrayList<Developer> developers=new ArrayList<>();

    public ScrumTeam(Tester[] testers, Developer[] developers){
        addTesters(testers);
        addDevelopers(developers);
    }


    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(long id){
        testers.removeIf(p->p.id==id);
    }

    public void removeDeveloper(long id){
        developers.removeIf(p->p.id==id);
    }

    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);
        removeDeveloper(developerID);
    }

    public String toString(){
        return "==============================="+
                "\nDevelopers: "+developers.size()+
                "\nTesters: "+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+" point"+
                "\nVelocity: "+((developers.size()+ testers.size())*8)+" point"+
                "\n===============================";
    }

}
