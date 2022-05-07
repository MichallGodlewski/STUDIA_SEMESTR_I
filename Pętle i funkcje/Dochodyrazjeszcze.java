
package dochodyrazjeszcze;
import java.util.Arrays;
import java.util.Scanner; 



public class Dochodyrazjeszcze {

    public static void main(String[] args) {
      
       double[] dochody = new double[12];
          int wybor; Scanner sc = new Scanner(System.in);
     
          do {
              System.out.println();
            System.out.println("Program statystyczny dochodów");
            System.out.println();
            menu();
            
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1:                  
                    wczytaj_dochody(dochody);
                
                    break;

                case 2: 
                 
                   wyswietl_dochody(dochody);
                    break;
                    
                case 3: 
                  srednia_suma_dochodow(dochody);
                    break;
                case 4: 
                   maksymalny_minimalny_dochod(dochody);
                     
                    break;
                case 5: 
                   sortuj(dochody);
                 
                    break;
                case 6: 
                   pod_nad_srednim_dochodem(dochody);
                    break;
                
                case 7: 
                    System.out.println("Do widzenia");
                    break;
                default : System.out.println("Błąd przy wyborze");
            }
        } while (wybor != 7);
          
    
          
          
          
 /*Wyswietlanie zawartosci tablicy */    
    /*      for (int i = 0; i < 12; i++){
 	System.out.println("Kolejna komórka to: " + tablica[i]);
 }  */ 
    
}
        public static void menu(){
        System.out.println("1 - Wczytaj dochód");
        System.out.println("2 - Wyświetl dochód");
        System.out.println("3 - Średnia suma dochodów");
        System.out.println("4 - Maksymalny oraz minimalny dochód");
        System.out.println("5 - Sortuj dochody");
        System.out.println("6 - Oddzielnie dochody większe oraz dochody mniejsze od średniego dochodu");
        System.out.println("7 - koniec");
    }
     public static void wczytaj_dochody(double[] dochody){
      double b;
      
          for(int i = 0; i<12 ; i++) {
              b =  Math.floor(Math.random()*10000+1);
    dochody[i]= b;
          }
          
     
     }
       public static void wyswietl_dochody(double[] dochody){
           
           for (int i = 0; i < 12; i++){
              
 	System.out.println("[Dochód " +  (i+1)+ "]" + " " + dochody[i]);
     
     }
       }
        public static void srednia_suma_dochodow(double[] dochody){
            double suma=0;
            
            for (int i = 0; i < 12; i++){
              
 	
     suma+=dochody[i];
     
     }
           
         suma/=12;
           System.out.println("Średnia suma dochodów wynosi: " + suma);
         
           
       }
    public static void maksymalny_minimalny_dochod(double[] dochody){
    double min = 10000;
    double max = 0;
     for (int i = 0; i < 12; i++){
    if(max<dochody[i]){
                max = dochody[i];
               
            }   
            else if(dochody[i]<min){
                    min = dochody[i];
                        }
     }
    System.out.println("Maksymalny dochód: " + max);
    System.out.println("Minimalny dochód: " + min);
    }
    public static void sortuj(double[] dochody){
         System.out.println("Dochody posortowane: ");
        for (int i = 0; i < 12; i++){
            
    Arrays.sort(dochody);
    System.out.println(dochody[i]);
        }
        
    }
     public static void pod_nad_srednim_dochodem(double[] dochody){
         
    srednia_suma_dochodow(dochody);
    double suma=0;
    
    double[] a = new double[12];
    double[] b = new double[12];
       for (int i = 0; i < 12; i++){
               suma+=dochody[i];
               
               
      }
           suma/=12;
           
           for (int i = 0; i < 12; i++){
               
          if(dochody[i]>suma){
              
         a[i]=dochody[i];
          
          
          }else if(dochody[i]<suma){
          
           
          b[i]=dochody[i];
          }
           
       }
           System.out.println("Dochody wieksze od średniej sumy dochodu ");
    for (int i = 0; i < 12 ;i++){
        if(a[i]!=0){
         System.out.println(a[i]);
        
        }
           }
     System.out.println();
     System.out.println("Dochody mniejsze od średniej sumy dochodu ");
     for (int i = 0; i < 12 ;i++){
    
     if(b[i]!=0){
        
        System.out.println(b[i]);
        }
     }
     }
        }

