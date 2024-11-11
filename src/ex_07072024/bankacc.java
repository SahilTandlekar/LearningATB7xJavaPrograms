package ex_07072024;

import java.lang.constant.DynamicCallSiteDesc;

public class bankacc {
    String bankname;
    int balance;
    String bankcode;
 // DC
    bankacc(){
        bankname = "SBI";
        balance = 0;
        bankcode = "ifsc";
    }

    void printDetails(){
        System.out.println("bank Name -->"+bankname);
        System.out.println("bank Code -->"+bankcode);
        System.out.println("balance -->"+balance);
    }
}
