
package programsedziowski;

import java.util.Scanner;


public class Programsedziowski {

   
    public static void main(String[] args) {
        double suma = 0;
        
        double sr = 0;
        double min = 10000;
       double max = 0;
         int i = 1;
        System.out.println("Program wczytuje kolejno oceny sędziów po czym wylicza ich średnią");
         Scanner sedzia = new Scanner(System.in);
         
        System.out.println("Wpisz liczbe sędziów");
        double s = sedzia.nextDouble();
           if(s>=3 && s <=10){    
               System.out.println("Podałeś prawidłową liczbę sędziów");
        for(i = 1; i<=s ; i++) {
            System.out.println("Wpisz ocene " + i);
              Scanner ocena = new Scanner(System.in);
              int o = ocena.nextInt();
          
             if(o<0){
             
                 System.out.println("Ocena za niska, uruchom ponownie program wpisująć poprawne wartości od 0 do 10");
                System.exit(0);
             }
             else if(o>10){
                 System.out.println("Ocena za wysoka, uruchom ponownie program wpisująć poprawne wartości od 0 do 10" );
                  System.exit(0);
             }
             else
             suma+=o;    
                 
            if(max<o){
                max = o;
               
            }   
            else if(o<min){
                    min = o;
                        }
        }
         
         sr = (suma - min - max)/s;
       
         System.out.println("Średnia ocena: " + sr);
         
        }
           else 
                System.out.println("Przykro mi , podałeś błedną liczbę sędziów! Spróbuj ponownie wpisując ilość sędziów od 3 do 10" );
    }
    }
        

