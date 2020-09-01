import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Niz {

	public static void main(String[] args) {

		
		int broj;
		int[] elementiNiza;
		
		
		System.out.println("Unesite koliko zelite elementa u nizu:");
		Scanner scanner = new Scanner(System.in);
		broj = scanner.nextInt();
		
		elementiNiza = new int[broj];
		int zbir = 0;
		
		for(int i = 0; i<elementiNiza.length; i ++) {
			System.out.println("Unesite "+(i+1)+".clan niza");
			elementiNiza[i] = scanner.nextInt();
		    zbir = elementiNiza[i] + zbir;
		
		}
		
	
		System.out.println("Zbir elemenat niza je: "+zbir);
	
	
	}

}
