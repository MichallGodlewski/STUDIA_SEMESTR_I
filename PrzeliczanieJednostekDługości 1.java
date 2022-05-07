
package przeliczaniejednostekdługości;

import java.util.Scanner;


public class PrzeliczanieJednostekDługości {

   
    public static void main(String[] args) {
       System.out.println("Program przelicza odległość podaną w metrach na rózne miary");
       
     

     
        //Stałe 
        double c = 39.37008; //cale
        double s = 3.28084; //stopy
        double j = 1.09361; //jardy
        double ml = 0.00062; //mile
        double sa = 0.5468066491688539; //saznie
        double mm = 0.0005399568;   //mile morskie
        double l = 1.6404199475065617;  //łokcie
        double k = 0.0053995680345572;  //kable
        double wi = 0.93738;    //wiorsty
        
        
        
        double wc ; //wynik cali
         double ws; //wynik stop
          double wj; //wynik jardow
           double wml; //wynik mill
           double wsa; //wynik sazni
           double wmm; //wynik mil morskich
           double wl; //wynik lokci
           double wk; //wynik kabli
           double wwi; //wynik wiorst
           int a;
        do{
            System.out.println("Wpisz odległośc podaną w metrach");
            Scanner metry = new Scanner(System.in);
        
        double m = metry.nextDouble();
        wc = m * c;
        ws = m * s;
        wj = m * j;
        wml = m * ml;
        wsa = m * sa;
        wmm = m * mm;
        wl = m * l;
        wk = m * k;
        wwi = m * wi;
        
        System.out.format(m+ " m "+ "(wartość podana w calach) = " + "%.4f%n", wc);
       System.out.format(m+ " m "+ "(wartość podana w stopach) = " + "%.4f%n", ws);
       System.out.format(m+ " m "+ "(wartość podana w jardach) = " + "%.4f%n", wj);
       System.out.format(m+ " m "+ "(wartość podana w milach) = " + "%.4f%n", wml);
       System.out.format(m+ " m "+ "(wartość podana w sazniach) = " + "%.4f%n", wsa);
       System.out.format(m+ " m "+ "(wartość podana w milach morskich) = " + "%.4f%n", wmm);
       System.out.format(m+ " m "+ "(wartość podana w łokciach) = " + "%.4f%n", wl);
       System.out.format(m+ " m "+ "(wartość podana w kablach) = " + "%.4f%n", wk);
       System.out.format(m+ " m "+ "(wartość podana w wiorstach) = " + "%.4f%n", wwi);
        
        
       System.out.println("Czy chcesz powtórzyć obliczenia dla innej liczby? Wpisz 1 jeśli chcesz kontynuować a 0 jeśli chcesz zakończyć program");
     Scanner run = new Scanner(System.in);
        a = run.nextInt();
        
       }
        
    while(a == 1);
       
       
    }
     
    
    
    
}
