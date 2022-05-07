
package przeliczaniejednostekdlugosci1_2;

import java.util.Scanner;


public class PrzeliczanieJednostekDługości1_2 {

   
    public static void main(String[] args) {
       System.out.println("Program przelicza odległość podaną w metrach na rózne miary");
        
    
        int m = 0;
        //Stałe 
        double c = 39.37008;
        double s = 3.28084;
        double j = 1.09361;
        double ml = 0.00062;
        
        double wc = 0;
         double ws = 0;
          double wj = 0;
           double wml = 0;
        
         while(m<100) {
         m = m + 5;
        wc = m * c;
        System.out.format(m+ " m "+ "(wartość podana w calach) = " + "%.4f%n", wc);
        ws = m * s;
        System.out.format(m+ " m "+ "(wartość podana w stopach) = " + "%.4f%n", ws);
        wj = m * j;
         System.out.format(m+ " m "+ "(wartość podana w jardach) = " + "%.4f%n", wj);
        wml = m * ml;
         System.out.format(m+ " m "+ "(wartość podana w milach) = " + "%.4f%n", wml);
        
       
      
      
         }
        
        
        
       
       
       
    }
    
}
