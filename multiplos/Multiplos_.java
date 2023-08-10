package multiplos;
import java.util.Scanner;
import java.util.Locale;

public class Multiplos_ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		//iniício program
		System.out.println("			São Múltiplos? ");
		System.out.println("Digite o primeiro Número");
		n1=sc.nextInt();
		System.out.println("Digite o Segundo Número");
		n2 = sc.nextInt();
		//fim 
		
		//início condicional
		if(n1 % n2 ==0 || n2 % n1 ==0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		
		//Fim condicional
		
		
		sc.close();
		

	}

}
