package figurypłaskie;

import java.math.MathContext;
import java.util.Scanner;

public class FiguryPlaskie {

    public static void main(String[] args) {
         System.out.println("Witam w programie obliczającym pole oraz obwód dla kwadratu,prostokąta,koła,trójkąta lub trapezu");
          
        int wybor; Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Proszę wybrać figure dla której mają zostać wykonane obliczenia");
            menu();
            
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: obliczeniaDlaKwadratu();
                    break;
                case 2: obliczeniaDlaProstokata();
                    break;
                case 3: obliczeniaDlaKola();
                    break;
                case 4: obliczeniaDlaTrojkata();
                    break;
                case 5: obliczeniaDlaTrapezu();
                    break;
                case 6: System.out.println("Do widzenia");
                    break;
                default : System.out.println("Nie ma takiej figury");
            }
        } while (wybor != 6);
    }
    public static void menu(){
        System.out.println("1 - kwadrat");
        System.out.println("2 - prostokąt");
        System.out.println("3 - koło");
        System.out.println("4 - trójkąt");
        System.out.println("5 - trapez");
        System.out.println("6 - koniec");
    }
     public static void menu2(){
        System.out.println("1 -  Obliczenie Pola");
        System.out.println("2 - Obliczenie Obwodu");
        System.out.println("3 - Powrót do menu");
        System.out.println("4 - Zakończenie programu");
        
    }
    public static void obliczeniaDlaKwadratu(){  
        int wybor; Scanner sc = new Scanner(System.in); 
         double a; 
                      System.out.println("Podaj długość boku dla kwadratu");
                     Scanner ww = new Scanner(System.in);  
                    a = ww.nextInt(); 
                    sprawdzanie(a);
            do {
                
               System.out.println("Wbierz jedną z poniższych opcji");
            menu2();
            
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: 
                    System.out.println("Pole kwadratu wynosi: "+ poleKwadratu(a)+"\n");
                    break;
                case 2: 
                    System.out.println("Obwód kwadratu wynosi: "+ obwodKwadratu(a)+"\n");
                    break;
                case 3: 
                    wybor = 4;
                    break;
                   
                case 4: System.out.println("Do widzenia");
                    System.exit(0);
                
            }
        } while (wybor != 4);
        
              
        
        
              }
       
   
    
    public static double poleKwadratu(double bok){     
        return bok * bok;
       
    }
    public static double obwodKwadratu(double bok){
        return 4 * bok;
    }
    public static void obliczeniaDlaProstokata(){
       
        int wybor; Scanner sc = new Scanner(System.in); 
         double a;
         double b;
         System.out.println("Podaj długość pierwszego boku: ");
         Scanner ww = new Scanner(System.in);  
         a = ww.nextInt(); 
         sprawdzanie(a);
         System.out.println("Podaj długość drugiego boku: ");
         b = ww.nextInt();
         sprawdzanie(b);
            do {
                
               System.out.println("Wbierz jedną z poniższych opcji");
            menu2();
            
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: 
                    System.out.println("Pole prostokąta wynosi: "+ poleProstokata(a,b)+"\n");
                    break;
                case 2: 
                    System.out.println("Obwód prostokąta wynosi: "+ obwodProstokata(a,b)+"\n");
                    break;
                case 3: 
                    wybor = 4;
                    break;
                   
                case 4: System.out.println("Do widzenia");
                    System.exit(0);
                
            }
        } while (wybor != 4);
        }
    
    public static double poleProstokata(double krotki,double dlugi){   
             
        return krotki * dlugi;
       
    }
       
    public static double obwodProstokata(double krotki,double dlugi){
        return 2 * krotki + 2 * dlugi;
    }
        
    public static void obliczeniaDlaKola(){
         int wybor; Scanner sc = new Scanner(System.in); 
         double a;
         
         System.out.println("Podaj długość promienia");
         Scanner ww = new Scanner(System.in);  
         a = ww.nextInt(); 
         sprawdzanie(a);
        
            do {
                
               System.out.println("Wbierz jedną z poniższych opcji");
            menu2();
            
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: 
                    System.out.println("Pole Koła wynosi: "+ poleKola(a)+"\n");
                    break;
                case 2: 
                    System.out.println("Obwód Koła wynosi: "+ obwodKola(a)+"\n");
                    break;
                case 3: 
                    wybor = 4;
                    break;
                   
                case 4: System.out.println("Do widzenia");
                    System.exit(0);
                
            }
        } while (wybor != 4);
        
        
        
    }
      public static double poleKola(double promien){   
             
        return Math.PI * (promien * promien);
       
    }
       
    public static double obwodKola(double promien){
        return 2 * Math.PI * promien;
    }
    public static void obliczeniaDlaTrojkata(){
        int wybor; Scanner sc = new Scanner(System.in); 
         double a;
         double b;
         System.out.println("Podaj długość podstawy");
         Scanner ww = new Scanner(System.in);  
         a = ww.nextInt(); 
         sprawdzanie(a);
         System.out.println("Podaj wysokość trójkąta");
         b = ww.nextInt(); 
         sprawdzanie(b);
            do {
                
               System.out.println("Wbierz jedną z poniższych opcji");
            menu2();
            
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: 
                    System.out.println("Pole trójkąta wynosi: "+ poleTrojkata(a,b)+"\n");
                    break;
                case 2: 
                    System.out.println("Obwód trójkąta równobocznego wynosi: "+ obwodTrojkata(a)+"\n");
                    break;
                case 3: 
                    wybor = 4;
                    break;
                   
                case 4: System.out.println("Do widzenia");
                    System.exit(0);
                
            }
        } while (wybor != 4);               
    }
       public static double poleTrojkata(double podstawa, double wysokosc){   
             
        return (podstawa * wysokosc)/2;
       
    }
       
    public static double obwodTrojkata(double podstawa){
        return podstawa * podstawa * podstawa;
    }
    public static void obliczeniaDlaTrapezu(){
       
        int wybor; Scanner sc = new Scanner(System.in); 
         double a;
         double b;
         double h;
          double c;
           double d;
         System.out.println("Podaj długość górnej podstawy");
         Scanner ww = new Scanner(System.in);  
         a = ww.nextInt(); 
         sprawdzanie(a);
         System.out.println("Podaj długość dolnej podstawy");
         b = ww.nextInt(); 
         sprawdzanie(b);
         System.out.println("Podaj długość pierwszego boku");
         c = ww.nextInt(); 
         sprawdzanie(c);
         System.out.println("Podaj długość drugiego boku");
         d = ww.nextInt(); 
         sprawdzanie(d);
          System.out.println("Podaj wysokość trapezu");
         h = ww.nextInt(); 
         sprawdzanie(h);
            do {
                
               System.out.println("Wbierz jedną z poniższych opcji");
            menu2();
            
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: 
                    System.out.println("Pole trapezu wynosi: "+ poleTrapezu(a,b,h)+"\n");
                    break;
                case 2: 
                    System.out.println("Obwód trapezu "+ obwodTrapezu(a,b,c,d)+"\n");
                    break;
                case 3: 
                    wybor = 4;
                    break;
                   
                case 4: System.out.println("Do widzenia");
                    System.exit(0);
                
            }
        } while (wybor != 4);  
    }
    public static double poleTrapezu(double gorna, double dolna,double wysokosc){   
             
        return ((gorna+dolna)*wysokosc)/2;
       
    }
       
    public static double obwodTrapezu(double gorna,double dolna,double pierwszy, double drugi ){
        return gorna + dolna + pierwszy + drugi;
    }
     public static void sprawdzanie(double sprawdz){
        
     
            if(sprawdz == 0){
            
                System.out.println("Podana wartość nie może być zerem");
                System.exit(0);
            
            }else if(sprawdz < 0){
                
                 System.out.println("Podana wartość nie może być wartością ujemną");
                  System.exit(0);
            }
            
            
         
         
     }
}
