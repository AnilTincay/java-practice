class galeri{
    
    String marka;
    String model;
    int fiyat;
    
    
    void bilgiyazdir(){
        
        
        System.out.print("marka :"+marka);
           System.out.print(" model :"+model);
           System.out.print(" fiyat :"+fiyat);
        
        
    }
    
    
    
}
public class Main
{
	public static void main(String[] args) {
	    
	    galeri araba1 = new galeri();
	    araba1.marka = "toyota";
	    araba1.model ="supra";
	    araba1.fiyat = 20000000;
	    araba1.bilgiyazdir();
	}
}
