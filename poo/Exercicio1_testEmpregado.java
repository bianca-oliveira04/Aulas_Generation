package poo;

public class Exercicio1_testEmpregado {
	
	public static void main(String[] args) {

	Exercicio1_Empregado[] lista = new Exercicio1_Empregado[2] ;
	
	lista[0] = new Exercicio1_Empregado("Bianca Oliveira",19,20000,false,true);
	lista[1] = new Exercicio1_Empregado("Laura Rossi",18,15000,true,false);

	for(Exercicio1_Empregado roda:lista) {
		
		roda.imprimir();
	
	  }
   }
}