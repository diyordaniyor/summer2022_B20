package Day51_Exceptions.BrowsersTask;

public class BrowserObjects {

    public static void main(String[] args) {
        ChromeBrowser chrome =new ChromeBrowser();
        chrome.get("google.com");
        chrome.close();

        FireFoxDriver firefox = new FireFoxDriver();
        firefox.get("apple.com");
        firefox.close();

        OperaBrowser opera = new OperaBrowser();
        opera.get("samsung.com");
        opera.close();
    }

}
