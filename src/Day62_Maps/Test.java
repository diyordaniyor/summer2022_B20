package Day62_Maps;

public class Test {

    public static void main(String[] args) {

        Color favoriteColor = Color.Red;

        System.out.println(favoriteColor);

        Browser browserName = Browser.Chrome;

       switch (browserName){
           case Chrome:
               System.out.println("Chrome is set");
               break;
           case Edge:
               System.out.println("Edge is set");
               break;
           case Safari:
               System.out.println("Safari is set");
               break;
           case FireFox:
               System.out.println("FireFox is set");
               break;
       }


    }

}
