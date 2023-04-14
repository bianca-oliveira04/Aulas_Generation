package lacos_de_decisao;

import java.util.Scanner;

public class exercicio01_if {

	public static void main(String[] args) {
		
		float A,B,C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		A = leia.nextFloat();
		System.out.println("Insira o segundo valor: ");
		B = leia.nextFloat();
		System.out.println("Insira um valor para saber se é maior, menor ou igual a soma dos dois primeiros: ");
		C = leia.nextFloat();
		
		if(A+B > C) {
			System.out.println("\nA soma dos dois primeiros valores é maior que o terceiro valor!  ");
		}	
			else if (A+B < C) {
		      System.out.println("\nA soma dos dois primeiros valores é menor do que o terceiro valor!");
			}
			else if (A+B == C) {
				System.out.println("\nA soma dos dois primeiros valores é igual ao terceiro valor!");
			}
	}

}
