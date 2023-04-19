package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_List {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String cor;
		int i;
		ArrayList<String> cores = new ArrayList();
		
		System.out.println("\n Olá, mencione 5 cores por favor, vamos lá?");
		
		for( i=0;i<5;i++){
		System.out.println("\n Digite a " +(i+1)+ "º cor: ");
		cor =leia.nextLine();
		cores.add(cor);
		 
	
		}
			 System.out.println("\nLista de cores armazenadas: \n"+cores);

			 System.out.println("\nCores ordenadas por ordem alfabética: \n");
			 Collections.sort(cores);
             System.out.println(cores);
}
}