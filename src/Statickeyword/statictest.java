package Statickeyword;

public class statictest {
    public static void main (String [] args){
    ATB a1 = new ATB("Sahil");
    System.out.println(a1.getName());
        ATB a2 = new ATB("Sunil");
        System.out.println(a2.getName());

    System.out.println(ATB.coursename);
    ATB.doAssignments();
    }

}
 class ATB{
    private String name;
    static String coursename = "ATB";

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public ATB(String name) {
         this.name = name;
         //generated constructor using right click//
     }
     static void doAssignments(){
         System.out.println("Do Assignements plz");
     }

    }

