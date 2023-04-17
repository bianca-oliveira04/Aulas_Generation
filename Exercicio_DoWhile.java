package lacos_de_repeticao;

import java.util.Scanner;

public class Exercicio_DoWhile {
	

	public static void main(String[] args) {
		
		int soma=0, numero;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		
			
		System.out.println("Insira um número aqui: ");
		numero = leia.nextInt();
		if(numero >= 0) {
		soma += numero;}}
		while(numero != 0);
		
		System.out.println("\nA soma dos números é de: "+soma);
		
		
	

}
}
