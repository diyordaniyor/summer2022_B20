package Day24_Array;

public class UniqueWords {
    public static void main(String[] args) {
        String[]words = {"C","C", "Java","Python","Python","C++"};
        for(int j = 0;j<= words.length-1;j++){
            String word1 = words[j];
            int count = 0;
            for(int i = 0;i<= words.length-1;i++){
                String each = words[i];
                if(each==word1){
                    count+=1;
                }
            }
            if(count==1){
                System.out.println(word1);
            }
        }
    }
}
