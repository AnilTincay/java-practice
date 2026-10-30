import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner input = new  Scanner (System.in);
		System.out.println("vize notunu giriniz");
		int vize = input.nextInt();
		System.out.println("final notunu giriniz");
		int sonsınav = input.nextInt();
		
		double not = (vize*4/10) + (sonsınav*6/10);
		
		System.out.println("not" +not);
		
		
		
	}
}