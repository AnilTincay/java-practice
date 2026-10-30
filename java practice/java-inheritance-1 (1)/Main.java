
class personal{
    String ad;
    String soyad;
    int maas;
    personal(String ad,String soyad,int maas){
        
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }
    
    void bilgiyazdir(){
        
        
        System.out.println("ad :" +ad+" soyad: "+soyad+" maas: "+maas);
    }
}


class arastırmagorevlisi extends personal{
    
    arastırmagorevlisi(String ad,String soyad,int maas){
        
        super(ad,soyad,maas);
        
        
    }
    
    
    
}


class ogretimgorevlisi extends personal{
    
     ogretimgorevlisi(String ad,String soyad,int maas){
        
        super(ad,soyad,maas);
        
        
    }
    
}

public class Main
{
	public static void main(String[] args) {
	    
	    ogretimgorevlisi o1 = new ogretimgorevlisi("ali","kurt",80000);
	    o1.bilgiyazdir();
	
	}
}