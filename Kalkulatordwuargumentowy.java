
package kalkulatordwuargumentowy;

import java.util.Scanner;

public class Kalkulatordwuargumentowy {

   
    public static void main(String[] args) {
       System.out.println("Kalkulator dwuargumentowy");
       int d;
        do{
        Scanner liczba = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę:");
        int a = liczba.nextInt();
        
        System.out.println("Wpisz drugą liczbę:");
        int b = liczba.nextInt();
        int c;
        int r;
        System.out.println("Jeśli chcesz dodać liczby wciśnij na klawiaturze +");
        System.out.println("Jeśli chcesz odjąć liczby wciśnij na klawiaturze -");
        System.out.println("Jeśli chcesz pomnożyc liczby wciśnij na klawiaturze *");
        System.out.println("Jeśli chcesz podzielić liczby wciśnij na klawiaturze /");
        
        Scanner symbol = new Scanner(System.in);
        char znak = symbol.next().charAt(0) ;
        
        switch(znak){
            case '+':
                    {
                
                        c = a + b;
                        System.out.println("Wynik dodawania:" + c);
                        break;
            }
            case '-':
            {
                        c = a - b;
                        System.out.println("Wynik odejmowania:" + c);
                        break;
            }
            case '*':
            {
                        c = a * b;
                        System.out.println("Wynik mnożenia:" + c);
                        break;
            }
            case '/':
            {
                if(b != 0){
                        c = a / b;
                        r = a % b;
                        System.out.println("Wynik dzielenia: " + c + " reszta: " + r);
                
                }
            else
                {
                     System.out.println("Nie wolno dzielić przez zero!");
                }
            break;
            }
    }
        System.out.println("Czy chcesz powtórzyć obliczenia dla innch liczb? Wpisz 1 jeśli chcesz kontynuować a 0 jeśli chcesz zakończyć program");
     Scanner run = new Scanner(System.in);
        d = run.nextInt();
        
        
        }
        while(d == 1);
}
}