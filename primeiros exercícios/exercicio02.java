package Javatech;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		
		float nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Insira sua nota do primeiro bimestre: ");
		nota1 = leia.nextFloat();
		System.out.println("Insira sua nota do segundo bimestre: ");
		nota2 = leia.nextFloat();
		System.out.println("Insira sua nota do terceiro bimestre: ");
		nota3 = leia.nextFloat();
		System.out.println("Insira sua nota do quarto bimestre: ");
		nota4 = leia.nextFloat();
	

		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\n sua média do semestre foi: "+media);
		System.out.printf("\nMédia Aritmética: %.2f",media);
		
	}

	

}
