package Day20_whileLoops;

public class BranchingStatements {
    public static void main(String[] args) {
        char ch = 'A';
        while(ch<='E'){
            if(ch=='C'||ch=='D'){
                ch++;
                continue;
            }
            System.out.println(ch);
            ch++;
        }
    }
}
