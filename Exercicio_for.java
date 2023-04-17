package lacos_de_repeticao;

import java.util.Scanner;

public class Exercicio_for {

	public static void main(String[] args){

			int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,impar = 0,numero, par = 0;
			
			Scanner leia = new Scanner(System.in);
					
			System.out.println("\nInsira um número: ");
			n1 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n2 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n3 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n4 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n5 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n6 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n7 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n8 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n9 = leia.nextInt();
			System.out.println("\nInsira um número: ");
			n10 = leia.nextInt();
			
			for (numero=1;numero<=10;numero++);
			  if(n1 % 2 == 0) {
				par++;
			}else {
		        impar++; 
			}
		     if(n2 % 2 == 0) {
				par++;
		    }else {
		        impar++;
		    }
	          if(n3 % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			if(n4 % 2 == 0) {
				par++;
			}else {
			    impar++;
			}
		    if(n5 % 2 == 0) {
				par++;
			}else {
		       impar++;
			}
	        if(n6 % 2 == 0) {
				par++;
     		}else {
			  impar++;
     		}
		    if(n7 % 2 == 0) {
				par++;
			}else {
		        impar++;
			}
	        if(n8 % 2 == 0) {
				par++;
			}else {
		       impar++;
			}
	        if(n9 % 2 == 0) {
				par++;
     		}else {
		      impar++;
     		}
	        if(n10 % 2 == 0) {
			   par++;
			}else {
	           impar++;
				}
			
	
	System.out.println("\nQuantidade de números pares digitados: "+par);
	System.out.println("\nQuantidade de números impares digitados: "+impar);

			
			
				
				
			}
		}
	
			
		    


