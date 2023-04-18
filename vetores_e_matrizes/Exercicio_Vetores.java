package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio_Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetNumeros[]= {2,5,1,3,4,9,7,8,10,6};
		int num,x,resultado=-1;
	            
		System.out.println("\n 2,5,1,3,4,9,7,8,10,6");
		System.out.println("\n escolha um numero: ");
		num = leia.nextInt();
		
		for(x=0; x<10; x++){
			if(num == vetNumeros[x]) {
				resultado = x;
			}
		
	}
 
		if(resultado == -1) {
			System.out.printf("O número %d não foi encontrado!",num);
		}else {
			System.out.printf("O número %d está localizado na posição: %d",num,resultado);
			
		}
		
}
}