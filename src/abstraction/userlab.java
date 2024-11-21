package abstraction;

public class userlab {
    public static void main (String[] args){
        CHROME c = new CHROME();
        c.Openbrowser("Chrome");
        c.Closebrowser("Chrome");

        Explorer e = new Explorer();
        e.Openbrowser("ff");
        e.Closebrowser("ff");
    }
}
