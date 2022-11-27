package Day28_JavaRecapContinue;

public class Frequency {
    public static void main(String[] args) {
        String sentence ="JavajavaJAVA";
        String word = "java";
        int count =0;
        for(int i = 0;i<=sentence.length()-4;i++){
            String s = sentence.substring(i,i+4);
            if(s.toLowerCase().equals(word)){
                count++;
            }

        }
        System.out.println(word+count);

    }
}
