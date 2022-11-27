package Day28_JavaRecapContinue;

public class Frequency3 {
    public static void main(String[] args) {
        String[] arr={"Java","C++","Python","JAVA"};
        String word = "java";
        int count = 0;
        for(String each: arr){
            String s = each;
            if(s.toLowerCase().equals(word)){
                count++;
            }
        }
        System.out.println(count);

    }
}
