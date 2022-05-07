
package zaduzozamalo;


import java.util.Random;
import java.util.Scanner;


public class ZaDuzoZaMalo {

   
    public static void main(String[] args) {
        System.out.println("Gra polegająca na odgadywaniu liczby wylosowanej przez program z przedziału od 0 do wartości podanej przez użytkownika");
        System.out.println("Wpisz maksymalną liczb, która może zostać wylosowana");
        Scanner przedzial = new Scanner(System.in);      
        int a = przedzial.nextInt();
      int c = 0;
      int t = 0;
        Random generator = new Random();

for(int i=0; i<1; i++) {

            
           c = generator.nextInt(a);

}
        int b = 0;

         System.out.println("liczba " + c);
        
        
            
           
        
            
           
        
        for(int i=1; i<100; i++){
            System.out.println("Odgadnij liczbe:");
           Scanner odgadywanie = new Scanner(System.in);      
        b = odgadywanie.nextInt();
        
            
        if(c == b){
            
            System.out.println("Gratulacje odgadłeś prawidłowo wylosowaną liczbę");
            System.out.println("Twoja liczba prób: " + i);
            break;
        }
        else if(c != b){
            
            System.out.println("Spróbuj jeszcze raz");
            System.out.println("Liczba prób " + i );
         
              
            
            
                    }
        
        if(i % 3 == 0 ){
            
             System.out.println("Wpisz 1 jeśli chcesz kontynuować grę lub inną aby zakończyć");
             
           Scanner tak = new Scanner(System.in);      
            t = tak.nextInt();
            if(t!=1){
                break;
            }
            
        }
       
                
        }
      
        
              
      
        }
      
        }   
        
    
    

