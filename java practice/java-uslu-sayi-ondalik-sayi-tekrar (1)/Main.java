
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    double alan,hacim,pi=3.14;
	    double r;
	    Scanner input = new Scanner(System.in);
	    
	    r=input.nextDouble();
	    alan = pi*r;
	    hacim =pi*Math.pow(r,2);
	    
	    System.out.printf("alan=" +"%.2f\n",alan);
	    System.out.printf("hacim ="+"%.2f\n",hacim);
	    
	
	}
}