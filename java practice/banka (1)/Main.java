 class banka{
    
    
 private int eklenen;
 private   int bakiye = 800;     String ad;
    
    
    void parayukle(int a){
        eklenen = a;
        
        bakiye += eklenen;
          System.out.println("bakiye" +bakiye);
    }
    
     void paracek (int b){
        eklenen = b;
        
        bakiye -= eklenen;
        System.out.println("isim  = "+ad);
        
        System.out.println(" bakiye = " +bakiye);
        
     }
}


public class Main
{
	public static void main(String[] args) {
	    
	    banka bank1 = new banka();
	    bank1.ad = "ahmet";
	    bank1.paracek(200);
	
	
	}
}