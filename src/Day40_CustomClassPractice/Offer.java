package Day40_CustomClassPractice;

public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFulltime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String state, boolean hasPTO, boolean isFulltime, boolean isWFH, String jobTitle, boolean hasBenefit){
        this.salary=salary;
        this.state=state;
        this.hasPTO=hasPTO;
        this.isFulltime=isFulltime;
        this.isWFH=isWFH;
        this.jobTitle=jobTitle;
        this.hasBenefit=hasBenefit;
    }

    public void getOfferInfo(){

        System.out.println("========================");
        System.out.println("Salary: "+salary);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Location: "+state);
        System.out.println("========================");
    }



}
