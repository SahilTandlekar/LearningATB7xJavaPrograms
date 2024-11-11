package ex_07072024;

public class labencap {
    public static void main(String[] args){
        login dlogin = new login("admin","hello123");
        System.out.println(dlogin.password);
        dlogin.password = "123";
        System.out.println(dlogin.password);
    }
}
class login{
    public String username;
    public String password;

    public login(String username, String password){
        this.username = username;
        this.password = password;
    }

}
