package Day60_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueInteface {

    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(q1);
        int firstObj= q1.poll();
        System.out.println(q1);
    }

}
