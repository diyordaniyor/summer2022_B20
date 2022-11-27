package Day28_JavaRecapContinue;

import java.util.Arrays;

public class Arr2D {
    public static void main(String[] args) {
        int arr2D[][] = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        for (int[] each : arr2D) {
            System.out.println(Arrays.toString(each));
        }

        }


    }

