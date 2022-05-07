
package tablice2;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Tablice2 {

   
    public static void main(String[] args) {
       
         Scanner tab = new Scanner(System.in);
        System.out.println(Zielony+"Witaj w programie wykonującym różne zadania z Tablicami. Na początek proszę stworzyć swoją tablice podając jej wielkość"+Reset);
                  
                    System.out.println("Podaj liczbe wierszy");
                    int sw = tab.nextInt();
                    System.out.println("Podaj liczbe kolumn");
                    int sk = tab.nextInt();
                    int w = sw;
                    int k = sk;
                     int [][] t = new int[w][k];
        
        
      
         
        
        
       
       
       
       int wybor;
       do {
           menu();
          Scanner sc = new Scanner(System.in);
            wybor = sc.nextInt();sc.nextLine();
          
       switch (wybor)
       {
           case 1:
                    
                     System.out.println("Podaj przedział minimalny");
                    int min = tab.nextInt();
                    System.out.println("Podaj przedział maksymalny");
         int max = tab.nextInt();
                   
                    wypelnijtablice(t,min,max);
                    break;
           case 2:
                int [][] pusta = new int [w][k];   
               
                wypelnijtablicejedynkami(pusta);
                
                
                break;
           case 3: 
                System.out.println("Tablica została skopiowana! Kopia: ");
                pokazkopie(t);
                break;
            case 4: 
                if(w==k){
                System.out.println("Tablica została przestawiona!: ");
                pokazkopie(t);
                }else 
                    System.out.println("Tablica nie jest kwadratowa!");
                break;
                case 5: 
                    
                      int [][] t2 = new int[w][k];
                        System.out.println("Pierwsza wygenerowana macierz");
                        generator(t);
                        generator(t2);
                          wyswietl(t);
                    System.out.println("Druga wygenerowana macierz");
                 wyswietl(t2);
                 
                 if(w!=k){
                 System.out.println(Czerwony+"Liczba kolumn w pierwszej macierzy jest inna niz liczba wierszy w drugiej macierzy!"+Reset);
                 break;
                 }else
                  System.out.println("Wynik mnożenia macierzy: ");
                 mnozenieMaciezy(t,t2);
                  
  
    
    
                    break;
       }
       
       }while(wybor !=6);
       
       
       
       }
    
    public static void menu(){
        System.out.println("1 - Wypełnij tablice podając przedział liczbowy do wygenerowania losowych wartości");
        System.out.println("2 - Wypełnij tablice jedynkami po przekątnych");
        System.out.println("3 - Wykonaj transpozycje tablicy po przez skopiowanie");
         System.out.println("4 - Wykonaj transpozycje tablicy po przes przestawienie");
         System.out.println("5 - Przykładowy program mnożący macierze(tylko jeśli na początku liczba kolumn i wierszy jest jednakowa)");
    
    
    
    }
    
   public static void wypelnijtablice(int[][]t, int min, int max){
        Random random = new Random();
       for(int i = 0; i < t.length; i++)
       {    
           for(int j = 0; j < t[i].length; j++)
           {
                int a1 = random.nextInt(max - min+1);
                int a2 = a1 + min;
                t[i][j]= a2;
               
                System.out.print( Zielony + t[i][j] + " " + Reset);
           
           }
        System.out.println();
       }
      
       
}
    public static int[][] generator(int[][]t){
     Random random = new Random();
      for(int i = 0; i < t.length; i++)
        
                    for(int j = 0; j < t[i].length; j++)
                    
                        t[i][j]= random.nextInt(10);
                
         return t;  
        
    }
    public static void wyswietl(int[][]t){
    
    for(int i = 0; i < t.length; i++){
        
                    for(int j = 0; j < t[i].length; j++){
                    
                       System.out.print(t[i][j]+" ");
                    }
            System.out.println();
                        }
    
    }
     
    public static void wypelnijtablicejedynkami(int[][]t){
        Random random = new Random();
      
       for(int i = 0; i < t.length; i++)
       {    
           
           for(int j = 0; j < t[i].length; j++)
           {
               System.out.print(Reset);
                if(i==j || t.length-i==j+1 ){
                 
                   
                           t[i][j]=1;
                     System.out.print(Czerwony);     
                }else               
                t[i][j]=0;
               
                System.out.print(t[i][j]+" ");
           
           }
        System.out.println(Reset);
       }
       
}
   public static int[][] transponujtablice(int[][]t){
   
       int [][]kopia = new int[t[0].length][t.length];
   
   
   for(int i = 0; i < t.length; i++)
       for(int j = 0; j < t[0].length;j++)
   
            kopia[j][i]=t[i][j];
   
       return kopia;
   
   
   
  
      
       
       
       
}
   public static void pokazkopie(int[][]t){
   transponujtablice(t);
       
     for(int i=0;i< transponujtablice(t).length; i++){
           
           
       for(int j=0; j< transponujtablice(t)[i].length;j++){
            
           System.out.print(Czerwony +transponujtablice(t)[i][j]+" "+ Reset); 
       
       }
        System.out.println();
       }
   
   
   }
   public static int [][] transponujTablice2(int[][] t) {
   
        for(int i = 0; i < t[i].length; i++)
       for(int j = 0; j < t[j].length;j++)
   
            t[j][i]=t[i][j];
   
       return t;
       
   
   }
    public static void pokazkopie2(int[][]t){
   transponujTablice2(t);
       
     for(int i=0;i< transponujTablice2(t).length; i++){
           
           
       for(int j=0; j< transponujTablice2(t)[i].length;j++){
            
           System.out.print(Czerwony +transponujTablice2(t)[i][j]+" "+ Reset); 
       
       }
        System.out.println();
       }
   
   
   }
    public static void mnozenieMaciezy(int[][] t, int[][] tt){
      int [][] t3 = new int[t[0].length][t.length];
     
      
          
      for(int i=0; i< t.length;i++){
           
             for(int j = 0;j<t[i].length;j++){
                 
                 for(int k = 0;k<t[j].length;k++){
                     
                          t3[i][j] += (t[i][k]*tt[k][j]); 
                    
                 }
                 System.out.print(t3[i][j]+ " "); 
             }
               System.out.println();
       }
     
        
    
    
    
        } 
public static final String Czerwony = "\u001B[31m";
   public static final String Reset = "\u001B[0m";
   public static final String Zielony = "\u001B[32m";
}
