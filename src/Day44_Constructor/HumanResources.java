package Day44_Constructor;

public class HumanResources {
    static Employee employee1;
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static {

        employee1=new Employee();
        employee2=new Employee();
        employee3=new Employee();
        employee4=new Employee();
        employee5=new Employee();

        employee1.setInfo("Diyor",12345,456789,"SDET",100000,'M');
        employee2.setInfo("Ferra",12335,456712,"SA",120000,'M');
        employee3.setInfo("Lambo",12375,456734,"ET",130000,'M');
        employee4.setInfo("MB",12349,456756,"SDT",100400,'M');
        employee5.setInfo("BMW",12315,456700,"DET",105000,'M');


    }



    /*public static void main(String[] args) {
        employee1=new Employee();
        employee2=new Employee();
        employee3=new Employee();
        employee4=new Employee();
        employee5=new Employee();

        employee1.setInfo("Diyor",12345,456789,"SDET",100000,'M');
        employee2.setInfo("Ferra",12335,456712,"SA",120000,'M');
        employee3.setInfo("Lambo",12375,456734,"ET",130000,'M');
        employee4.setInfo("MB",12349,456756,"SDT",100400,'M');
        employee5.setInfo("BMW",12315,456700,"DET",105000,'M');
    }

     */

}
