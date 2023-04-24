package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_fila {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int op;
		String nome = null;
		
		Queue<String> fila = new LinkedList();
		
		do {
		System.out.println("Banco Biabank Menu");
		System.out.println("1- Adicionar Cliente na Fila ");
		System.out.println("2- Listar Todos os Clientes ");
		System.out.println("3- Retirar Cliente da Fila ");
		System.out.println("0- Sair");
		System.out.println("Digite sua opção: ");
		op = leia.nextInt();
		System.out.println("\n");
		
		switch(op) {
		case 1:
			leia.nextLine();
			System.out.println("\nDigite o nome para ser adicionado na fila: \n");
			nome = leia.nextLine();
			fila.add(nome);
			System.out.println("\nFila: \n"+fila+"\nCliente Adicionado! ");
			System.out.println("\n");
		break;
		
		case 2:
			leia.nextLine();
			System.out.println("Lista de Cientes na Fila: \n"+fila);
			System.out.println("\n");
			break;
			
		case 3: 
			leia.nextLine();
			if(fila.contains(nome)) {
				fila.remove(nome);
				System.out.println("Fila: \n"+fila+"\nO Cliente Foi Chamado!");
				System.out.println("\n");
			}else {
				System.out.println("A Fila Está Vazia!");
				System.out.println("\n");
			}
			 break;
			
		case 0:
			System.out.println("\nMuito obrigado pela prêferencia pelo Banco Biabank... Volte Sempre!!!");
			break;
			
		default:
			System.out.println("\nOpção inválida! Tente uma opção válida...");
			System.out.println("\n");
		}
		}while(op != 0);
			
				
  }	
}

