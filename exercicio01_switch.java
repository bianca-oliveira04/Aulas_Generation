package lacos_de_decisao;

import java.util.Scanner;

public class exercicio01_switch {

	public static void main(String[] args) {
		
		int produto,quantidade,valortotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nRestaurante Colmeia da Bia");
		System.out.println("\nMenu");
		System.out.println("Produto 1 - cachorro quente - 10 reais");
		System.out.println("Produto 2 - X-Salada - 15 reais");
		System.out.println("Produto 3 - X-Bacon - 18 reais");
		System.out.println("Produto 4 - Bauru - 12 reais");
		System.out.println("Produto 5 - Refrigerante - 8 reais");
		System.out.println("Produto 6 - Suco de Laranja - 13 reais");
		System.out.println("\nInsira o código do seu produto: ");
		produto = leia.nextInt();
		
		System.out.println("qual a quantidade que você quer desse produto: ");
		quantidade = leia.nextInt();
		
		switch(produto) {
		
		case 1:
			valortotal = 10 * quantidade;
			System.out.println("Você escolheu " +quantidade);
			System.out.println("cachorro(s) quente(s) e o valor ficou: "+valortotal);
			break;
			
		case 2:
			valortotal = 15 * quantidade;
			System.out.println("Você escolheu " + quantidade);
			System.out.println("X salada(s) e o valor ficou: " +valortotal);
			break;
			
		case 3:
			valortotal = 18 * quantidade;
			System.out.println("Você escolheu " + quantidade);
			System.out.println("X bacon(s) e o valor ficou: "+valortotal);
			break;
			
		case 4:
			valortotal = 12 * quantidade;
			System.out.println("Você escolheu " + quantidade);
			System.out.println("Bauru(s) e o valor ficou: "+valortotal);
			break;
			
		case 5:
			valortotal = 8 * quantidade;
			System.out.println("Você escolheu " + quantidade);
			System.out.println("Refrigerante(s) e o valor ficou: "+valortotal);
			break;
			
		case 6:
			valortotal = 13 * quantidade;
			System.out.println("Você escolheu " + quantidade);
			System.out.println("Suco(s) de Laranja e o valor ficou: "+valortotal);
			break;
			
			default:
				System.out.println("Esse código não é válido, tente novamente");
		}
		
		System.out.println("\n Obrigada pela preferência :) ");
		
		
		

	}

}
