package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_Set {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	Set<Integer> meuSet = new HashSet<Integer>();
	int i, valor;
	
	System.out.println("Insira aqui 10 valores inteiros não repetidos: ");
	
	for( i=0;i<10;i++){
		System.out.println("\n Digite o " +(i+1)+ "º valor: ");
		valor =leia.nextInt();
		meuSet.add(valor);
		System.out.println("\n");
	}
	
	Iterator<Integer> iMeuSet = meuSet.iterator();
	
	while(iMeuSet.hasNext()) {
		System.out.println(iMeuSet.next());
	}
 }
}