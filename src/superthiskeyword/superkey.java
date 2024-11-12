package superthiskeyword;

import java.sql.SQLOutput;

public class superkey {
    public static void main(String[] args) {
        car s = new car();
        s.msg();
    }
    }
      class car extends vehicle{
          private int maxspeed = 200;
          public void msg(){
              System.out.println("My car speed is "+ this.maxspeed);
              System.out.println("All cars speed is "+ super.maxspeed);
          }
      }
        class vehicle{
          public int maxspeed = 100;

          void display(){
              System.out.println(maxspeed);
          }
      }



