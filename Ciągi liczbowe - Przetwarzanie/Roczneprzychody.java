
package GrupaA2;

import java.util.Scanner;


public class Roczneprzychody {

    public static void main(String[] args) {
      double suma = 0;
        double a = 0;
        double sr = 0;
        double min = 10000;
       double max = 0;
         int i = 1;
        System.out.println("Program wczytuje kolejno przychody osiągnięte przez podatnika w kolejnych miesiącach roku podatkowego");
         Scanner miesiac = new Scanner(System.in);
        System.out.println("Wpisz liczbe miesięcy");
        double m = miesiac.nextDouble();
               
        for(i = 1; i<=m ; i++) {
             a = Math.floor(Math.random()*10000+1);
            System.out.println("Przychód za " +i + " miesiąc " + a + "zł");
           suma += a;
            if(max<=a){
                max = a;
               
            }   
            else if(min>=a){
                    min = a;
                        }
        }
         
         sr = suma/m;
         System.out.println("Suma przychodów: " + suma);
         System.out.println("Średnia przychodów: " + sr);
         System.out.println("Minimalny przychód: " + min);
         System.out.println("Maksymalny przychód: " + max);
        }
 
 
{
}
        
              
 
    
}


