package Day45_Constructor;

public class SalaryCalculator {

    double hourlyRate;
    int weeklyhours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyhours, double stateTaxRate, double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyhours=weeklyhours;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
    }

    public double salary(){
        return hourlyRate*weeklyhours*48;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString(){
        return "Hourly rate: "+hourlyRate+", Weekly Hours: "+weeklyhours+", Salary: "+salary();
    }
}
