package parimpar;
import java.util.Scanner;
import java.util.Locale;
public class Par_impar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número inteiro para saber se é par ou impar.");
		numero=sc.nextInt();
		
		if(numero % 2 == 0) { //o operador % pede para verificar o resto da divisão por 2
			System.out.println("Esse número é par"); //se o resto fort igual a 0, o número é par
		}
		else{
			System.out.println("Esse número é impar");
		}
		
		sc.close();

	}

}
