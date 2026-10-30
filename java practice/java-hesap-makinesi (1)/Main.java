
import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("islem yapmak icin iki sayi giriniz");
        
         double   sayi1=input.nextDouble();
         double   sayi2=input.nextDouble();
         
        double sonuc;
           System.out.println("yapmak istediginiz islemin isaretine basin");
           String isaret = input.next();
           
        switch(isaret){
            
            case "+":
          sonuc =  sayi1 + sayi2 ;
         
         System.out.printf("%.2f\n",sonuc);
         break;
         
         
               case "-":
          sonuc =  sayi1 - sayi2 ;
         
         System.out.printf("%.2f\n",sonuc);
         break;
         
            
               case "*":
          sonuc =  sayi1 * sayi2 ;
         
         System.out.printf("%.2f\n",sonuc);
         break;
         
               case "/":
          sonuc =  sayi1 / sayi2 ;
         
         System.out.printf("%.2f\n",sonuc);
         break;
         
           
               case "^":
          sonuc = Math.pow(sayi1,sayi2);
         
         System.out.printf("%.2f\n",sonuc);
         break;
         
               
                         case "!^":
          sonuc = Math.pow(sayi1,1/sayi2);
         
         System.out.printf("%.2f\n",sonuc);
         break;
         default:
        System.out.print("bastıgınız tusun islem olarak karsılıgı yoktur");
               break;
        }
        
    }
}