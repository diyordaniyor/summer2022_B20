package Day28_JavaRecapContinue;

public class Frequency2 {
    public static void main(String[] args) {
        String sentence ="CatcatcatdogdogDog";
        String word = "cat";
        String word1= "dog";
        int count1 = 0;
        int count =0;
        for(int i = 0;i<=sentence.length()-3;i++){
            String s = sentence.substring(i,i+3);
            if(s.toLowerCase().equals(word)){
                count++;
            }
            if(s.toLowerCase().equals(word1)){
                count1++;
            }

        }
        System.out.println(word+count);
        System.out.println(word1+count1);
    }
}
