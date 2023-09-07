package posto;

import java.util.Scanner;

public class combustivel_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Iniciando variáveis
		int gasolina = 0;
		int acool = 0;
		int diesel = 0;
		
		//Início menu
		System.out.println("Pesquisa de Preferência dos Produtos UIRAPURÚ");
		System.out.println("1 - Gasolina");
		System.out.println("2 - Álcool");
		System.out.println("3 - Diesel");
		System.out.println("4 - Encerrar Pesquisa");
		
		
		//variável tipo inteiro que recebe o número correspondente ao produto
		int escolha = sc.nextInt();
		
		//início while, laço de repetição
		while(escolha != 4) { // enquanto escolha for diferente de 4, execute.
			
			if(escolha == 1) {
				gasolina += +1;
			}
			else if(escolha == 2) {
				acool += +1; // acool = acool + 1
			}
			else if (escolha == 3) {
				diesel += +1;
			}
			
			else { //se não ! Exiba as mensagens
				System.out.println("\nOPs! Opção Não Encontrada no Menu de Produtos");
				System.out.println("Por Favor, Tente Novamente.");
			}
			
			//novo print do menu para o usuário
			System.out.println("\nPesquisa de Preferência dos Clientes UIRAPURÚ");
			System.out.println("1 - Gasolina");
			System.out.println("2 - Álcool");
			System.out.println("3 - Diesel");
			System.out.println("4 - Encerrar Pesquisa");
			escolha = sc.nextInt(); //nova coleta 
					
		}
		
		
		//print do resultado final do programa
		System.out.println("\nMuito Obrigado!");
		System.out.println("Álcool: "+acool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		sc.close();
	}

}
