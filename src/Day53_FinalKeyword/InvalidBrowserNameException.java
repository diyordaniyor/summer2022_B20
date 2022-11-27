package Day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException{

    public InvalidBrowserNameException(){
        super("Invalid browser name");
    }

    public InvalidBrowserNameException(String str){
        super(str);
        System.err.println("Ar u kidding");
    }

}

class Test2{
    public static void main(String[] args) {
        String name = "Cybertek";

        switch (name){
            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "fireox":
                System.out.println("Firefox is selected");
                break;
            case "Safari":
                System.out.println("Safari is selected");
                break;
            default:
                throw new InvalidBrowserNameException("Please enter a valid browser name");
        }
        //throw new InvalidBrowserNameException();
    }
}
