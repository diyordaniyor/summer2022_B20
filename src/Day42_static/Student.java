package Day42_static;

public class Student {
    String name;
    int age;
    int groupNumber;
    char gender;
    static String schoolName = "Cybertek School";
    static String favoriteTeacher= "Muhtar";

    public void setInfo(String name, int age, int groupNumber, char gender){
        this.name=name;
        this.age=age;
        this.groupNumber=groupNumber;
        this.gender=gender;
    }

    public String toString(){
        return "School Name: "+schoolName+"\nStudent name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nGroup number: "+groupNumber+"\nFavorite teacher: "+favoriteTeacher;
    }


}
