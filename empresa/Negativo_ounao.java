package empresa;

import java.util.Scanner;

public class Negativo_ounao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		System.out.println("Digite um número inteiro");
		numero=sc.nextInt();
		
		    //inicio condicional
		if(numero < 0) {
			System.out.println(numero + " "+"É um número negativo");
		}
		else {
			System.out.println(numero + " "+ "É um número não negativo");
		}
		
		    //fim Condicional
		
		sc.close();//boc prática, fechar o Scanner
	}

}
