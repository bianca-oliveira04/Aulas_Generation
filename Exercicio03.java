package Javatech;
  
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float salariobru,addnoturno,horaextra,descontos,salarioliq;
	
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("digite seu salário bruto: ");
		salariobru = leia.nextFloat();
		System.out.println("digite seu adicional noturno: ");
		addnoturno= leia.nextFloat();
	    System.out.println("digite suas horas extras: ");
	    horaextra = leia.nextFloat();
	    System.out.println("digite seus descontos: ");
	    descontos = leia.nextFloat();
	    
	    salarioliq = (salariobru+addnoturno+horaextra-descontos);
	    
	    System.out.println("\n Seu salário líquido é: "+salarioliq);
	}

}
