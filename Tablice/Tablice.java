
package tablice;

import java.util.Random;
import java.util.Scanner;


public class Tablice 
{

    public static void main(String[] args) 
    {
        System.out.println(Czerwony+"Witaj w programie obliczającym wyznaczniki 2x2 lub 3x3 z wygenerowanej wcześniej macierzy oraz rozwiązującym układ równań");
        System.out.println(Zielony+"Twoja wygenerowana macierz"+Reset);
        Random random = new Random();
        int k = 3;
        int w = 3;
        double[][] tab = new double[w][k];
       
        
        for(int i = 0; i < w; i++)
        {
            for(int j = 0; j < k; j++)
            {
                tab[i][j]= random.nextInt(10);
                
                System.out.print(tab[i][j] + " ");
               
            }
                
                 System.out.println();
                 
        }
       
       
       
       
        int wybor; 
        
     do {
            System.out.println();
            System.out.println("Wybierz z poniższego menu, jaką operacje chcesz wykonać");
            menu();
            Scanner sc = new Scanner(System.in);
            wybor = sc.nextInt();sc.nextLine();
        switch (wybor)
        {
            
                
            case 1:
                
                    System.out.println("wyznacznik macierzy 2x2 wynosi: " + det2(tab));
                    break;
            case 2:
                     System.out.println("wyznacznik macierzy 3x3 wynosi: " + det3(tab));
                    break;
            

            case 3:  
                  uklad();
               
                  break;
            case 4:
                macierz(tab);
            
        }
            
        } while (wybor != 5); 
        
     
     
            
   }
    public static void menu(){
  
  System.out.println("1 - Wyznacznik macierzy 2x2");
  System.out.println("2 - Wyznacznik macierzy 3x3");
  System.out.println("3 - Podając zielone wartości rozwiąż układ równań: " + Zielony  +"A1"+ Czerwony  +"x + " + Zielony  +"B1" + Czerwony  +"y = "+Zielony  +"C1");
  System.out.print("                                                   ");
  System.out.println(Zielony  +"A2"+ Czerwony  +"x + " + Zielony  +"B2" + Czerwony  +"y = "+Zielony  +"C1"  + Reset);
  System.out.println("4 - Pokaż macierz");
  } 
    
    
    public static void macierz(double [][] tab) {
        
         for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
              
                
                System.out.print(tab[i][j] + " ");
               
            }
                
                 System.out.println();
                 
        }
       
    
    }
    
    public static double det2(double [][] tab) {
         
        double wyznacznik = tab[0][0] * tab[1][1] - tab[1][0]* tab[0][1];
    
    return wyznacznik;
    }
    
    public static double det3(double [][] tab) {
         
        double wyznacznik = 
                ((tab[0][0] * tab[1][1] * tab[2][2]) + 
                (tab[0][1] * tab[1][2] * tab[2][0]) + 
                (tab[0][2] * tab[1][0] * tab[2][1])) -
                ((tab[0][2] * tab[1][1] * tab[2][0])+
                (tab[0][0] * tab[1][2] * tab[2][1])+
               (tab[0][1] * tab[1][0] * tab[2][2]));
    
        return wyznacznik;
    }
    public static void uklad(){
    double wartosci[][]= new double[2][3];
                Scanner s = new Scanner(System.in);
    
                for(int i = 0; i < 2; i++)
                {
           
            
                for(int j = 0; j < 3; j++)
                {
                if(i==0 && j==0){
                    System.out.print("Wpisz twoje A1 ");              
                }else if(i==0 && j==1){
                    System.out.print("Wpisz twoje B1 ");
                
                }else if(i==0 && j==2){
                    System.out.print("Wpisz twoje C1 ");
                
                }else if(i==1 && j==0){
                    System.out.print("Wpisz twoje A2 ");
                
                }else if(i==1 && j==1){
                    System.out.print("Wpisz twoje B2 ");
                
                }else if(i==1 && j==2){
                    System.out.print("Wpisz twoje C2 ");
                
                }
                
                 double l = s.nextDouble();
                wartosci[i][j]= l;
                
               
            }
             System.out.println();
                
                
        }
                    
                 System.out.println("Twoje równanie wygląda następująco: " + Zielony + wartosci[0][0] + Czerwony + "x + " +Zielony + wartosci[0][1]+ Czerwony +"y = "+Zielony +wartosci[0][2]);
                 System.out.print(Reset + "                                    ");
                  System.out.println(Zielony + wartosci[1][0] + Czerwony + "x + " + Zielony + wartosci[1][1]+ Czerwony +"y = "+ Zielony +wartosci[1][2]);
              int wybor1;
                  do{
                   
                   System.out.println("1 - Rozwiąż równanie");
                   System.out.println("2 - wyjście do głównego menu");
                   Scanner sc1 = new Scanner(System.in);
            wybor1 = sc1.nextInt();sc1.nextLine();
                  switch(wybor1){
                      case 1:
                          obliczanie(wartosci);
                      case 2: 
                          break;
                  }
            }while(wybor1 != 2);
    }
    public static void obliczanie(double [][] wartosci){
    double W[][] = {{wartosci[0][0],wartosci[0][1]},{wartosci[1][0],wartosci[1][1]}};
    double Wx[][] = {{wartosci[0][2],wartosci[0][1]},{wartosci[1][2],wartosci[1][1]}};
    double Wy[][] = {{wartosci[0][0],wartosci[0][2]},{wartosci[1][0],wartosci[1][2]}};
    
    double w = det2(W);
    double wx = det2(Wx);
    double wy = det2(Wy);
    
    double x = wx/w;
    double y = wy/w;
    System.out.println(Czerwony+"X "+ Reset +"wynosi: "+ Zielony +x);
    System.out.println(Czerwony+"Y "+ Reset +"wynosi: "+ Zielony +y);
    }
    
    public static final String Czerwony = "\u001B[31m";
    public static final String Zielony = "\u001B[32m";
    public static final String Reset = "\u001B[0m";
    
}
