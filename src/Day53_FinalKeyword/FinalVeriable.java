package Day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVeriable {
    public static void main(String[] args) {
        final LocalDate dateOfBirth = LocalDate.of(2000,5,7);
        System.out.println(dateOfBirth);

        final long ssn=1234567;
        System.out.println(ssn);
    }
}
