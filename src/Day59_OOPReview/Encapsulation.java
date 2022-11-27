package Day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn;

    private final LocalDate Published = LocalDate.of(2022,10,25);


    public int getSSN(){
        return ssn;
    }

    public void setSsn(int ssn){
        this.ssn=ssn;
    }

    public LocalDate getPublished(){
        return Published;
    }


}
