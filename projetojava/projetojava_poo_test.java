package projetojava;

import java.util.Scanner;

public class projetojava_poo_test {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
	    float celular, rg;
		boolean Particular, Planosaude;
		
		paciente[] lista = new paciente[31];
		
		System.out.println("Insira seu nome: ");
		nome =leia.nextLine();
		System.out.println("Insira sua idade: ");
		idade =leia.nextInt();
		System.out.println("Insira sua identidade: ");
		rg =leia.nextInt();
		System.out.println("Vai dar entrada com o plano de saúde? \n(true para sim e false para não) ");
		Planosaude =leia.hasNext();
		System.out.println("Vai dar entrada com atendimento particular? \n(true para sim e false para não) ");
		Particular =leia.hasNext();
		System.out.println("Insira um telefone para contato: +55 11 ");
		celular =leia.nextInt();
		
		lista[0] = new paciente (nome,idade,rg,Planosaude,Particular,celular);
	}

}
