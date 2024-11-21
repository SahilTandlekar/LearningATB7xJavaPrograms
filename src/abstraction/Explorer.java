package abstraction;

public class Explorer extends baseclass{
    @Override
    String Openbrowser(String Browser) {
        System.out.println("Open the Explorer browser");
        return "Browser is opened";
    }

    @Override
    String Closebrowser(String Browser) {
        System.out.println("Close the Explorer browser");
        return "";
    }
}
