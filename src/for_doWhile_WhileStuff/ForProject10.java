package for_doWhile_WhileStuff;
import java.util.Scanner;
public class ForProject10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int MIN, MAX;
		
		System.out.print("Introduzca un numero minimo: ");
		MIN=sc.nextInt();
		System.out.println("Minimo: " +MIN);
		System.out.print("Introduzca un numero maximo: ");
		MAX=sc.nextInt();
		System.out.println("Maximo: " +MAX);
		
		for (int n=MIN;n<=MAX;n++) {
			System.out.println(n);
			if (n%2==0) {
				System.out.println("Suma de pares: " +(n+n));
			}
			if (n%2==1) {
				System.out.println("Multiplicacion de impares: " +(n*n));
			}
		}
		sc.close();
	}

}
