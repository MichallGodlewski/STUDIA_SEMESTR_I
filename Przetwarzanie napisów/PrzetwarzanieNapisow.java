
package przetwarzanienapisow;

import java.util.Arrays;
import java.util.Scanner;


public class PrzetwarzanieNapisow {
    
    

   
    public static void main(String[] args) {
         System.out.println("Wpisz dowolne słowo");
        Scanner s = new Scanner(System.in); 
        String a = s.nextLine();
        
        //Scanner k = new Scanner(System.in); 
        //int b = k.nextInt();
        
      System.out.println();
         
        int wybor; 
        do {
            System.out.println();
            System.out.println("Wybierz co chcesz zrobić z danym slowem");
            menu();
            Scanner sc = new Scanner(System.in);
            wybor = sc.nextInt();sc.nextLine();
            switch (wybor){
                case 1: 
                   odwrocony(a);
                  
                  
                  
                    break;
                case 2: 
                    
                   przestawioneSlowa(a);
                    
                 
                    break;
                case 3: 
                    System.out.println("Podaj klucz szyfru");
                 Scanner c = new Scanner(System.in); 
                    int d = c.nextInt();
                    szyfruj(a,d);
                    break;
                case 4: 
                    System.out.println("Podaj slowo ktore chcesz odszyfrowac");
                    Scanner o = new Scanner(System.in); 
        String g = o.nextLine();
                     System.out.println("Podaj klucz szyfru");
                     Scanner e = new Scanner(System.in); 
                    int f = e.nextInt();
                    
                     odszyfruj(g,f);
                    
                    break;
                case 5:
              
                
                uporzadkuj(a);
                break;
                 case 6:
                     System.out.println("Podaj znak");
                Scanner l = new Scanner(System.in); 
                char z = l.next().charAt(0);
                     
                
                liczbaWystapien(a,z);
                break;
                 case 7:
                     
                 histogram(a);
                     break;
                      case 8:
                     
                 palindrom(a);
                     break;
                      case 9:
                   System.out.println("Wpisz słowo które porównasz ze wcześniejszym");
                   String slowo2 = sc.nextLine();
                 anagram(a,slowo2);
                     break;
              
            }
        } while (wybor != 10 && wybor != 0);
  
        
        
        
    
    }
    
    public static void menu(){
        System.out.println("1 - odwróć podane slowo");
        System.out.println("2 - przestaw slowo");
        System.out.println("3 - zaszyfruj metoda Cezara");
        System.out.println("4 - odszyfruj metoda Cezara");
         System.out.println("5 - uporzadkuj");
         System.out.println("6 - liczba wystąpień");
         System.out.println("7 - histogram");
      System.out.println("8 - palindrom");
       System.out.println("9 - anagram");
       System.out.println("0 - Koniec");
    }
    
    
   public static void odwrocony(String slowo){
   System.out.print("Tekst po odwróceniu: ");
       for (int i=slowo.length()-1; i>= 0; i--) 
       {
           System.out.print("" + slowo.charAt(i));
           
      }
    System.out.println();
   }
   
   public static void przestawioneSlowa(String slowo){
   System.out.print("Przestawione słowa: ");
    String[] a = slowo.split(" ");
      
    for (int i=a.length-1; i>= 0; i--) 
       {
           System.out.print(a[i]);
           System.out.print(" ");
      }
   System.out.println();
  
   }
   public static void szyfruj(String slowo,int klucz){     
       System.out.print("Słowo zaszyfrowane ");
        char x[] = slowo.toCharArray();
        
        for(int i=0; i != x.length; i++){
            int n = x[i];
            n += klucz;
            x[i] = (char)n;
             
        }
       
       System.out.print(x);
        System.out.println();
  
    }
   
     public static void odszyfruj(String slowo, int klucz){     
       System.out.print("Słowo odszyfrowane ");
        char x[] = slowo.toCharArray();
        
        for(int i=0; i != x.length; i++){
            int n = x[i];
            n -= klucz;
            x[i] = (char)n;
             
        }
       
       System.out.print(x);
    }
     public static void uporzadkuj(String slowo){
     
     String a = slowo.replaceAll("\\s+,", ", ").replaceAll(",", ", ").replaceAll("\\s+", " ");
     System.out.print("Słowo uporządkowane " + a);
     
     }
     public static void liczbaWystapien(String slowo, char znak){
         int liczba = 0;
         
         char [] a = slowo.toCharArray();
         for(int i=0;i < a.length;i++){
         
            if (a[i]==znak){
             liczba+=1;
         
            }
            
         }
     System.out.print("Liczba wystąpień " + znak + " wynosi: " + liczba);
       
     
     }
     public static void histogram(String slowo) {
        int[] zliczanie = new int[26];
        slowo = slowo.toLowerCase();
        for (char s : slowo.toCharArray()) {
            int toAscii = (int) s;
            toAscii -= 97;
            if (toAscii >= 0 && toAscii <= 25) {
                zliczanie[toAscii] += 1;
               }
        }
        for (int i = 0; i < 26; i++) {
            char fromAsciiToChar = (char) (i + 97);
            
          System.out.println(fromAsciiToChar +  " - " + zliczanie[i]);
        }
        
    }
     public static void palindrom(String slowo)
     {
         slowo = slowo.toLowerCase();
      int p = 0;
      int d = slowo.length();
      int b = (d - 1);
        for(int i = 0; i < d;i++)
      {
           
            if(slowo.charAt(i) != slowo.charAt(b)){
            
                p = 1;
                break;
            
            }
            b--;
       }
         if(p==1){
             System.out.println("Podane słowo nie jest palindromem");     
         }else
         {
             System.out.println("Podane słowo jest palindromem");  
         
         }
     }
     public static void anagram(String slowo1, String slowo2){
       if(slowo1.length() != slowo2.length()) {
        System.out.println("Podane słowo nie jest anagramem ponieważ dlugość obu wyrazów sie różni");
     return;
       }
       
            char[] s1 = slowo1.toCharArray();
       
            char[] s2 = slowo2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
       if(Arrays.equals(s1, s2)== true){
      
       System.out.println("Podane słowo jest anagramem");
      
       }else{
        System.out.println("Podane słowo nie jest anagramem");
       }
        
       
       
     }
}