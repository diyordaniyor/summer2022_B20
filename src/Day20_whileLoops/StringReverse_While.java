package Day20_whileLoops;

public class StringReverse_While {
    public static void main(String[] args) {
        String str = "Cybertek";
        String r="";
        int index = str.length()-1;
        while(index>=0){
            r+=str.charAt(index);
            index--;
        }
        System.out.println(r);
    }
}
