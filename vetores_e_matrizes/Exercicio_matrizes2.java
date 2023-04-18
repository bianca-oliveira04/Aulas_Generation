package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio_matrizes2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float[][] notas = new float [10][4];
		float vetmedia[] = new float [10];
		float soma=0;
		int linha,coluna;
		
		{
		 
		  for (linha=0;linha < notas.length;linha++) {
			for(coluna=0;coluna<4;coluna++) {
				System.out.printf("\nDigite sua nota do "+(linha+1)+ " aluno: ");
				notas[linha][coluna] = leia.nextFloat();
				soma += notas[linha][coluna];
			}
			
			vetmedia[linha] = soma/4;
			soma = 0;
	      }
		  
		  for(int i=0; i < vetmedia.length; i++ ){
			  System.out.printf("\n Média do aluno %d: %.1f",(i+1),vetmedia[i]);
		}
	  }
   }
}

	
