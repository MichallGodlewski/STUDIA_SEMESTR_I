
package programsprintera;

import java.util.Scanner;


public class Programsprintera {

    
    public static void main(String[] args) {
          double sr = 0;
        
          double min = Double.MAX_VALUE;
       double max = 0;
       
       double suma = 0;
        System.out.println("Program wczytuje czasy sprintera, następnie wyznacza najgorszy, najlepszy oraz srednią wszystkich podanych czasów");
        
       
        
              int i;
    
            for(i = 0;;i++){
          
           
             System.out.println("Wpisz czas akceptując przyciskiem Enter");
        Scanner czas = new Scanner(System.in);      
              double c = czas.nextDouble();
             suma += c;                             
           sr = suma/i;
         
         if(c<0){
             System.out.println("Podałeś błedny czas");
              System.exit(0);
         }
         if(c==0){
         
              break;
         }
         
       if(c<min){
                min = c;
               
               
            }   
       
       if(max<c){
                    
                     max = c;
                        }
    System.out.println("Aby wyświetlić wyniki wpisz 0 lub kontynuj wpisywanie czasów");
            }
             
            
        
           
                
                 System.out.println("Twój najgorszy czas: " + max);
        System.out.println("Twój najlepszy czas: " + min);
        System.out.println("Średnia twoich czasów: " + sr);
        
        
           
                 
      
        
    }
    
}
