package Library;

import java.util.Arrays;

public class Util {

    //import Library.Util;


    public static String Duplicates(String word2) {
        String nonDup = "";
        for (int i = 0; i <= word2.length() - 1; i++) {
            String s = "" + word2.charAt(i);
            if (!nonDup.contains(s)) {
                nonDup += s;
            }
        }
        return nonDup;
    }

    public static String Reverse(String word) {
        String r = "";
        int index = word.length() - 1;
        while (index >= 0) {
            r += word.charAt(index);
            index--;
        }
        return r;
    }

    public static Integer MaxNum(Integer[] arr) {

        Integer max = arr[0];
        for (Integer each : arr) {
            if (each >= max) {
                max = each;
            }


        }
        return max;
    }

    public static int MaxNum(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each >= max) {
                max = each;
            }


        }
        return max;
    }

    public static double MaxNum(double[] arr) {
        double max = arr[0];

        for (double each : arr) {
            if (each >= max) {
                max = each;
            }


        }
        return max;
    }

    public static Double MaxNum(Double[] arr) {
        Double max = arr[0];
        for (Double each : arr) {
            if (each >= max) {
                max = each;
            }


        }
        return max;
    }

    public static int MinNum(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each <= min) {
                min = each;
            }
        }

        return min;
    }

    public static double MinNum(double[] arr) {
        double min = arr[0];
        for (double each : arr) {
            if (each <= min) {
                min = each;
            }
        }

        return min;
    }

    public static Integer MinNum(Integer[] arr) {
        Integer min = arr[0];
        for (Integer each : arr) {
            if (each <= min) {
                min = each;
            }
        }

        return min;
    }

    public static Double MinNum(Double[] arr) {
        Double min = arr[0];
        for (Double each : arr) {
            if (each <= min) {
                min = each;
            }
        }

        return min;
    }

    public static String Unique(String word2) {
        String result = "";
        for (int i = 0; i <= word2.length() - 1; i++) {
            char s = word2.charAt(i);
            int first = word2.indexOf(s);
            int last = word2.lastIndexOf(s);
            if (first == last) {
                result += s;
            }
        }
        return result;
    }

    public static String Frequency(String word) {
        String result = "";
        for (int j = 0; j <= word.length() - 1; j++) {

            char s = word.charAt(j);
            int count = 0;
            for (int i = 0; i <= word.length() - 1; i++) {
                if (word.charAt(i) == s) {
                    count += 1;
                }
            }
            result += "" + s + count;


        }
        return result;
    }
    public static int Frequency(String word, char ch){
        int count=0;
        for(int i =0;i<=word.length()-1;i++){
            char s =word.charAt(i);
            if(s==ch){
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str){
        String uniques = "";

        for(char each: str.toLowerCase().toCharArray()){
            int count = Frequency(str,each);
            if(count==1){
                uniques+=each;
            }

        }
        return uniques;

    }

    public static int[] Combination2(int[] comb1, int[] comb2) {
        int size = comb1.length + comb2.length;
        int[] comb = new int[size];
        int index = 0;
        for (int each : comb1) {
            comb[index] = each;
            index += 1;
        }
        for (int each : comb2) {
            comb[index] = each;
            index++;
        }
        return comb;
    }

    public static String[] Combination2(String[] comb1, String[] comb2) {
        int size = comb1.length + comb2.length;
        String[] comb = new String[size];
        int index = 0;
        for (String each : comb1) {
            comb[index] = each;
            index += 1;
        }
        for (String each : comb2) {
            comb[index] = each;
            index++;
        }
        return comb;
    }

    public static double[] Combination2(double[] comb1, double[] comb2) {
        int size = comb1.length + comb2.length;
        double[] comb = new double[size];
        int index = 0;
        for (double each : comb1) {
            comb[index] = each;
            index += 1;
        }
        for (double each : comb2) {
            comb[index] = each;
            index++;
        }
        return comb;
    }

    public static char[] Combination2(char[] comb1, char[] comb2) {
        int size = comb1.length + comb2.length;
        char[] comb = new char[size];
        int index = 0;
        for (char each : comb1) {
            comb[index] = each;
            index += 1;
        }
        for (char each : comb2) {
            comb[index] = each;
            index++;
        }
        return comb;
    }

    public static Integer[] Combination2(Integer[] comb1, Integer[] comb2) {
        int size = comb1.length + comb2.length;
        Integer[] comb = new Integer[size];
        int index = 0;
        for (Integer each : comb1) {
            comb[index] = each;
            index += 1;
        }
        for (Integer each : comb2) {
            comb[index] = each;
            index++;
        }
        return comb;
    }

    public static Double[] Combination2(Double[] comb1, Double[] comb2) {
        int size = comb1.length + comb2.length;
        Double[] comb = new Double[size];
        int index = 0;
        for (Double each : comb1) {
            comb[index] = each;
            index += 1;
        }
        for (Double each : comb2) {
            comb[index] = each;
            index++;
        }
        return comb;
    }

    public static String FrequencyOfChars(String str){
        String expectedresult = "";
        String nonDup = Util.Duplicates(str);

        for (char each : nonDup.toCharArray()) {
            int count = Util.Frequency(str, each);
            expectedresult += "" + each + count;
        }
        return expectedresult;

    }

    public static String Fullname(String first, String second){
        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        second=second.substring(0,1).toUpperCase()+second.substring(1).toLowerCase();
        String fullname = first+" "+second;

        return fullname;
    }

    public static int[] addElement(int[] arr, int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]= num;
        int i =0;
        for(int each:arr){
            arr2[i]= each;
            i++;
        }
        return arr2;

    }

    public static int[] Descending (int[] arr){
        Arrays.sort(arr);
        int[] desc = new int[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }

    public static double[] Descending (double[] arr){
        Arrays.sort(arr);
        double[] desc = new double[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }

    public static String[] Descending(String[] arr){
        Arrays.sort(arr);
        String[] desc = new String[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }

    public static char[] Descending(char[] arr){
        Arrays.sort(arr);
        char[] desc = new char[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }

    public static Integer[] Descending (Integer[] arr){
        Arrays.sort(arr);
        Integer[] desc = new Integer[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }

    public static Double[] Descending (Double[] arr){
        Arrays.sort(arr);
        Double[] desc = new Double[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }

    public static Character[] Descending (Character[] arr){
        Arrays.sort(arr);
        Character[] desc = new Character[arr.length];
        int k= desc.length-1;
        for(int i=0;i<= desc.length-1;i++){
            desc[i]=arr[k];

            k--;

        }
        return desc;
    }


    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){

        }

    }

}

