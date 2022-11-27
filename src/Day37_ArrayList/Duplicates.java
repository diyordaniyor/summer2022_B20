package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8));
        list.removeIf(p-> Collections.frequency(list,p)==1);
        System.out.println(list);
        System.out.println("======================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Canada","Bob","David","Lan","Abida","Farida"));
        names.removeIf(p->p.toLowerCase().charAt(0)==p.charAt(p.length()-1));
        System.out.println(names);
        System.out.println("==================");
        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,75,85,65,55,85,55,45,73,35,47,10));
        ArrayList<Integer> gradeA=new ArrayList<>() ;
        gradeA.addAll(grades);
        gradeA.removeIf(p->p<90);
        System.out.println("A "+gradeA);


        ArrayList<Integer> gradeB=new ArrayList<>() ;
        gradeB.addAll(grades);
        gradeB.removeIf(p->p>89||p<80);
        System.out.println("B "+gradeB);
        ArrayList<Integer> gradeC=new ArrayList<>() ;
        gradeC.addAll(grades);
        gradeC.removeIf(p->p>79||p<70);
        System.out.println("C "+gradeC);
        ArrayList<Integer> gradeD=new ArrayList<>() ;
        gradeD.addAll(grades);
        gradeD.removeIf(p->p>69||p<60);
        System.out.println("D "+gradeD);
        ArrayList<Integer> gradeE=new ArrayList<>() ;
        gradeE.addAll(grades);
        gradeE.removeIf(p->p>59);
        System.out.println("E "+gradeE);
        System.out.println("=======================");
        System.out.println(gradeA.size()+" students made A");
        System.out.println(gradeB.size()+" students made B");
        System.out.println(gradeC.size()+" students made C");
        System.out.println(gradeD.size()+" students made D");
        System.out.println(gradeE.size()+" students failed");

    }
}
