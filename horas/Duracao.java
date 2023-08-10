package horas;

import java.util.Scanner;
import java.util.Locale;
public class Duracao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hr1, hr2;
		
		System.out.println("                      :Calculador de duração de evento:");
		System.out.println("Digite a hora inicial");
		hr1=sc.nextInt();
		System.out.println("Digite a hora final");
		hr2=sc.nextInt();
		
		int duracao;
		if(hr1 < hr2) {
			duracao = hr2 - hr1; //a fim de não obter horários negativos
		}
		else {
			duracao = 24 - hr1 + hr2;
		}
		
		System.out.println("O jogo durou" + " " + duracao + " "+ "horas");
		sc.close();

	}

}
