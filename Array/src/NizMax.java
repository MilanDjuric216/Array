import java.util.Scanner;

public class NizMax {

	public static void main(String[] args) {

		int broj;
		int[] elementiNiza;
		int min, max;
		
		System.out.println("Unesite elemente niza: ");
		Scanner scanner = new Scanner(System.in);
		broj = scanner.nextInt();
		elementiNiza = new int[broj];
		
		for(int i = 0; i<elementiNiza.length;i++) {
			System.out.println("Unesite "+(i+1)+".clan niza");
			elementiNiza[i] = scanner.nextInt();	
		}
		min = elementiNiza[0];
		max = elementiNiza[0];
		
		for (int i = 0;i<elementiNiza.length;i++) {
			
			if(elementiNiza[i]<min) {
				min = elementiNiza[i];
			}
			if(elementiNiza[i]>max) {
				max = elementiNiza[i];
			}
			
		}
		System.out.println("Minimalan broj je "+min+" ,a maksimalan broj je "+max);
	}

}
