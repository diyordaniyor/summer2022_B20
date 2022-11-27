package Day29_CustomMethods;

public class Eligibility {
    public static void main(String[] args) {
        Eligible("usa", 20);
        Alcohol(20);
        Grade(89);
        Reverse("Diyor");
        Calculate(24,6,'/');
        Unique("aabbc");
    }
    public static void Eligible(String a, int b){
        if(a.equalsIgnoreCase("USA")&&b>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

    }
    public static void Alcohol(int c){
        if(c>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }

    public static void Grade(int score){
        if(score<0||score>100){
            System.out.println("Invalid score");
            return;
        }
        String result = (score>=90&&score<100)?"A":(score>=80&&score<90)?"B":(score>=70&&score<80)?"C":(score>=60&&score<70)?"D":"F";
        System.out.println(result);
    }
    public static void Reverse(String word){
        String r ="";
        int index = word.length()-1;
        while(index>=0){
            r+=word.charAt(index);
            index--;
        }
        System.out.println(r);
    }

    public static void Calculate (double num1, double num2, char operator){
        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            case'%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid operator");



        }
    }



    public static void Unique(String word2){
        String result ="";
        for(int i = 0;i<=word2.length()-1;i++){
            char s = word2.charAt(i);
            int first = word2.indexOf(s);
            int last = word2.lastIndexOf(s);
            if(first==last){
                result+=s;
            }



        }
        System.out.println(result);

    }
}
