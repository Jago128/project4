package for_doWhile_WhileStuff;
import java.util.Scanner;
public class DoWhileProject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		i=1;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero entero: ");
		n = teclado.nextInt();
		do {
			System.out.println(i);
			i++;
		} while (i<=n);
		teclado.close();
	}
}
