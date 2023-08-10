package preco;

import java.util.Scanner;

public class Hamburgueria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd;
		int codigo;
		
		
		System.out.println("      |Faça a escolha do seu pedido|");
		System.out.println("+---------------------------------------+");
		System.out.println("|Codigo       Especificação       Preço |");
		System.out.println("+---------------------------------------+");
		System.out.println("| 1           Cachorro quente     R$4.00|");
		System.out.println("| 2              X-Salada         R$4.50|");
		System.out.println("| 3              X-Bacon          R$5.00|");
		System.out.println("| 4           Torrada simples     R$2.00|");
		System.out.println("| 5             Refrigerante      R$1.50|");
		System.out.println("+---------------------------------------+");
		
		System.out.println("Digite o código respectivo do cardápio");
		codigo=sc.nextInt();
		
		//inicio condicional
		if(codigo == 1) {
			System.out.println("Quantas unidades? ");
			qtd=sc.nextInt();
			System.out.println("\nTotal: "+4*qtd+"R$");
			System.out.println("Seu pedido já está saindo :)");
			
		}
		else if(codigo == 2) {
			System.out.println("Quantas unidades? ");
			qtd=sc.nextInt();
			System.out.println("\nTotal: "+4.50*qtd+"R$");
			System.out.println("Seu pedido já está saindo :)");
			
		}
		else if(codigo == 3) {
			System.out.println("Quantas unidades? ");
			qtd=sc.nextInt();
			System.out.println("\nTotal: "+5*qtd+"R$");
			System.out.println("Seu pedido já está saindo :)");
			
		}
		else if(codigo == 4) {
			System.out.println("Quantas unidades? ");
			qtd=sc.nextInt();
			System.out.println("\nTotal: "+2*qtd+"R$");
			System.out.println("Seu pedido já está saindo :)");
		
		}
		else if(codigo == 5) {
			System.out.println("Quantas unidades? ");
			qtd=sc.nextInt();
			System.out.println("\nTotal: "+1.50*qtd+"R$");
			System.out.println("Seu pedido já está saindo :)");
			
		}
		else {
			System.out.println("Ops! Código de cardápio não identificado.");
		}
		//fim condicional
		
		sc.close(); //caso de bom uso

	}

	
}
