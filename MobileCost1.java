//THis program calculates the amount of IMs that can be send for the price of one SMS.

import java.util.Scanner;
public class MobileCost1 {
        public static void main(String args[]){
                double a,b,c,e;
                int d;
                
                Scanner bruce=new Scanner(System.in);
                System.out.println("Cents per SMS, e.g. .80:");
                
                a=bruce.nextDouble();  //stores the sms
                
                System.out.println("Rands per MB:");
                
                b=bruce.nextDouble(); //stores the data 
                a=(a/b);
                c=(1024*1024)*a;
                e=c/140;
                d= (int) e;
                
                System.out.println("IMs for the price of one SMS:"+d);

        }
}
