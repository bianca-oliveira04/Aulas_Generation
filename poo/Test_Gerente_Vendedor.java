package poo;

public class Test_Gerente_Vendedor {

	public static void main(String[] args) {
		
		Gerente ger1 = new Gerente("Bianca Oliveira",19,20000,false,true,2193);
		Gerente ger2 = new Gerente("Laura Rossi",18,15000,true,false,2193);
		
		Vendedor ven1 = new Vendedor("Adam Gomes",23,1800,false,false,35 );
		Vendedor ven2 = new Vendedor("Maya Tomonari",22,1800,true,false,35 );

			
		ger1.imprimir();
		ger2.imprimir();
		
		
		System.out.println("\n**************************************************");
	
	
		ven1.imprimirInfo();
        ven2.imprimirInfo();
		
	
	}
}