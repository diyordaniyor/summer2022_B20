package day33_LocalDateTime;

public class Uniques {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};

        for (int element:arr){
            int count = 0;
            for(int each: arr){
                if(element==each){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }

        }
        System.out.println();

        System.out.println("==========================");
        double[] n2 ={10,20,20,40,50,50};
        UniqueElements(n2);
        System.out.println("=====================");
        String[] n3= {"A","A","B","C","C"};
        UniqueElements(n3);
        System.out.println();
        System.out.println("===============");
        char[] n4 = {'A','B','B','C'};
        UniqueElements(n4);

    }


    public static void UniqueElements(int[] arr){
        for (int element:arr){
            int count = 0;
            for(int each: arr){
                if(element==each){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }

        }
        System.out.println();
    }

    public static void UniqueElements(char[] arr){
        for (char element:arr){
            int count = 0;
            for(char each: arr){
                if(element==each){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }

        }
        System.out.println();
    }

    public static void UniqueElements(double[] arr){
        for (double element:arr){
            int count = 0;
            for(double each: arr){
                if(element==each){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }

        }
        System.out.println();
    }

    public static void UniqueElements(String[] arr){
        for (String element:arr){
            int count = 0;
            for(String each: arr){
                if(element.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }

        }
        System.out.println();
    }
}
