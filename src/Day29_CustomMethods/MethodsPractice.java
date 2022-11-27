package Day29_CustomMethods;

public class MethodsPractice {
    public static void main(String[] args) {
        Plaindrome("madam");
        Duplicates("aabbccd");
        int[] arr = {2,3,4,7,8,9,10,0};
        MaxNum(arr);
    }





    public static void Plaindrome (String word){
        String r = "";
        int index = word.length()-1;
        while (index>=0) {
            r += word.charAt(index);
            index--;
        }
            if(word.equals(r)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }


        public static void Duplicates(String word2){
        String nonDup = "";
        for(int i=0;i<=word2.length()-1;i++){
            String s = ""+word2.charAt(i);
            if(!nonDup.contains(s)){
                nonDup+=s;
            }
        }
            System.out.println(nonDup);
        }

        public static void MaxNum(int[] arr){
        int max =arr[0];
        int min =arr[1];
        for(int each:arr){
            if(each>=max){
                max=each;
            }
            if(each<=min){
                min =each;
            }
        }
            System.out.println("Max number is "+max);
            System.out.println("Min number is "+min);

        }

    }

