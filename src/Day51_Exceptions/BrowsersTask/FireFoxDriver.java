package Day51_Exceptions.BrowsersTask;

public class FireFoxDriver extends WebDriver{

    public void get(String url){
        System.out.println("Opening the "+url+ " in firefox browser");
    }

    public void close(){
        System.out.println("closing the firefox browser");
    }

}
