package abstraction;

public class CHROME extends baseclass{

    @Override
    String Openbrowser(String Browser) {
        System.out.println("Open the Chrome browser");
        return "Browser is opened";
    }

    @Override
    String Closebrowser(String Browser) {
        System.out.println("Close the Chrome browser");
        return "";
    }
}
