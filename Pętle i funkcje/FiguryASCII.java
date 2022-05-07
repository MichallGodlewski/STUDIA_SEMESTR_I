
package figuryascii;

import java.util.Scanner;


public class FiguryASCII {

    
    public static void main(String[] args) {
         System.out.println("Witam w programie rysującym wybrane przez użytkownika figury");
          
        int wybor; Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Proszę wybrać figure która ma zostać narysowana");
            menu();
            
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: 
                   int a;
                      System.out.println("Podaj wielkośc rysowaniej figury");
                    Scanner ww = new Scanner(System.in);  
                    a = ww.nextInt(); 
                  
                    kwadrat(a);
                    break;
                case 2: 
                    int b; 
                      System.out.println("Podaj wielkośc rysowaniej figury");
                     Scanner bb = new Scanner(System.in);  
                    b = bb.nextInt(); 
                    
                    trojkat1(b);
                    break;
                case 3: 
                    int c; 
                      System.out.println("Podaj wielkośc rysowaniej figury");
                     Scanner cc = new Scanner(System.in);  
                    c = cc.nextInt(); 
                    trojkat2(c);
                    break;
                case 4: 
                     int d; 
                      System.out.println("Podaj wielkośc rysowaniej figury");
                     Scanner dd = new Scanner(System.in);  
                    d = dd.nextInt(); 
                    ramka(d);
                    break;
                case 5: 
                     int e; 
                      System.out.println("Podaj wielkośc rysowaniej figury");
                     Scanner ee = new Scanner(System.in);  
                    e = ee.nextInt(); 
                    ramkaPrzekatne(e);
                    break;
                case 6: 
                     int f; 
                      System.out.println("Podaj wielkośc rysowaniej figury");
                     Scanner ff = new Scanner(System.in);  
                    f = ff.nextInt(); 
                   
                    
                    piramidka(f);
                    break;
                
                case 7: 
                    System.out.println("Do widzenia");
                    break;
                default : System.out.println("Nie ma takiej figury");
            }
        } while (wybor != 7);
    }
    public static void menu(){
        System.out.println("1 - kwadrat");
        System.out.println("2 - trójkąt 1");
        System.out.println("3 - trójkąt 2");
        System.out.println("4 - ramka");
        System.out.println("5 - ramka z przekątnymi");
        System.out.println("6 - piramidka");
        System.out.println("7 - koniec");
    }
    
     public static void wielkosc(){
     
                        int a; 
                      System.out.println("Podaj wielkośc rysowaniej figury");
                     Scanner aa = new Scanner(System.in);  
                    a = aa.nextInt(); 
     
     
     }
    
    public static void kwadrat(int a){
        int i = 0;
        int b = 0;
   while(b<a){
          
          
      for(i=0;i<a;i++){    
          
        System.out.print("*");
        
      }
      System.out.println();
      b++;
   }
     

    }
    public static void trojkat1(int a){
       int i;
       int b =0;
       int c = 1;
       while(b<a){
           
       
          
           for(i=0;i<c;i++){
               
        System.out.print("*");
           
        
       }
           System.out.println();
        b++;
        c++;
       }
    }

  
    public static void trojkat2(int a){
      int i;
       int b =0;
       int c = 1;
       int d = a;
       while(b<a){
           
                 for(i=0;i<d;i++){
               
        System.out.print(" ");
                   
        
      }
                  --d;
                   
           for(i=0;i<c;i++){
              
        System.out.print("*");
           
        
       }
           System.out.println();
        b++;
        c++;
       
    
    }
    }
    public static void ramka(int a){
        
    int i;
       int b =2;
      
       
       
          for(i=0;i<a;i++){
               
        System.out.print("*");
                   
        
      }
       System.out.println();
       while(b<a){
           
           System.out.print("*");
                 for(i=2;i<a;i++){
               
        
        System.out.print(" ");
       
       
        
      }
                  
                   
          
            System.out.print("*");
           System.out.println();
        b++;
      
       
    
    }
         for(i=0;i<a;i++){
               
        System.out.print("*");
                   
        
      }
        
         System.out.println();
    
    }
    public static void ramkaPrzekatne(int a){
          int i;
       int b =0;
      
    
       System.out.println();
       while(b<a){
           
           System.out.print("*");
           
                for(i=2;i<a;i++){
                    if(b+1==i || a-i==b || b==0 || b==a-1){
                    
                    System.out.print("*");
                    }else{
                         System.out.print(" ");
               
                    }
                }
            
             
            
           
         
          
          
     
          
          
          
     
                     
                  
                 
               
                
          
          System.out.print("*");
            
           System.out.println();
        b++;
      
            
    
    }
       
        
         System.out.println();
    
    }
    
    
    
    public static void piramidka(int a){
           int i;
       int b =0;
       int c = 1;
       int d = a;
       while(b<a){
           
                 for(i=0;i<d;i++){
               
        System.out.print(" ");
                   
        
      }
                  --d;
                   
           for(i=0;i<c;i++){
               
        System.out.print("*");
           
        
       }
           if(c%2==0 && c !=1){
               for(i=1;i<c;i++){
           System.out.print("*");
               }
                   
           }else if(c%2==1 && c!=1){
               
            for(i=1;i<c;i++){
           System.out.print("*");
               }
           
           }
           
           System.out.println();
        b++;
        c++;
       
    
    }
    }
    }


        
