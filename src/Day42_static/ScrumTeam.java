package Day42_static;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    ArrayList<Tester> testers= new ArrayList<>();
    ArrayList<Developer> developers= new ArrayList<>();

    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA,String SM){
        this.PO=PO;
        this.BA=BA;
        this.SM=SM;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(long employeeID){
        testers.removeIf(p->p.employeeID==employeeID);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper( long employeeID){
        developers.removeIf(p->p.employeeID==employeeID);
    }

    public String toString(){
        return testers.size()+" testers, "+developers.size()+" developers, PO: "+PO+", BA: "+BA+", SM: "+SM;
    }

}
