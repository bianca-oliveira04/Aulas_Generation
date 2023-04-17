package lacos_de_repeticao;

import java.util.Scanner;

public class Exercicio_while2 {
	
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	int idade, maior = 0, menor = 0;
	
	System.out.println ("Insira a idade aqui: ");
	idade = leia.nextInt();
	
	while (idade >= 0){
		if (idade <= 21)
		{ menor++; }
		else if(
			idade >=50) {
			maior++; }
		
		System.out.println("Entre com um número: ");
		idade=leia.nextInt();
	} 
	System.out.println("\n Pessoas menores de 21 anos: "+menor);
	System.out.println("\n Pessoas maiores de 50 anos: "+maior);
	
	
	
}
}

