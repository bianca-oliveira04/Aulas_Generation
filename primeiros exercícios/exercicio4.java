package Javatech;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		
    Scanner leia = new Scanner(System.in);
    
    float n1,n2,n3,n4,diferenca = 0.0f;
    
    System.out.println("Insira o primeiro valor: ");
	n1 = leia.nextFloat();
	System.out.println("Insira o segundo valor: ");
	n2 = leia.nextFloat();
	System.out.println("Insira o terceiro valor: ");
	n3 = leia.nextFloat();
	System.out.println("Insira o quarto valor: ");
	n4 = leia.nextFloat();
	
	diferenca= (n1*n2)-(n3*n4);
	
	System.out.println("a diferença do primeiro e segundo para o terceiro e quarto é: "+diferenca);
	
	}

}
