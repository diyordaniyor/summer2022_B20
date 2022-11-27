package Day53_FinalKeyword;

public class BreakTimeException extends RuntimeException{


    public BreakTimeException(){
        super(("It's time for a brake"));
        System.err.println("Time to go home");

    }

    public BreakTimeException(String str){
        super(str);
        System.out.println("Take 15 minute brake");
    }


}

class Test{
    public static void main(String[] args) {
        //throw new RuntimeException("Runtime exception");
        throw new BreakTimeException("Give a brake");
    }
}
