package testencasulation;

public class labtest {
    public static void main(String[] args){

        Bank sahil = new Bank("Sahil", 100);
        //set balance
        sahil.setBal( 20000,false);
        System.out.println(sahil.getBal());
        System.out.println(sahil.getName());

        Bank admin = new Bank("admin", 2500);
        admin.setBal(50000,true);
        System.out.println(sahil.getBal());
        System.out.println(sahil.getName());

        System.out.println(admin.getBal());


    }
}
