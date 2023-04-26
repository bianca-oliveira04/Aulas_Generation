package poo;

public class Gerente extends Exercicio1_Empregado{
	
	private int CodigodeCaixa;

	public Gerente(String nome, int idade, float salario, boolean horaExtra, boolean mD1ANE, int codigodeCaixa) {
		super(nome, idade, salario, horaExtra, mD1ANE);
		CodigodeCaixa = codigodeCaixa;
		
		
	}

	public int getCodigodeCaixa() {
		return CodigodeCaixa;
	}

	public void setCodigodeCaixa(int codigodeCaixa) {
		CodigodeCaixa = codigodeCaixa;
	}
	
	public void imprimir() {
		System.out.println(getNome() +"\t\t"+getIdade()+" anos"+"\t\t"+"Salário: "+this.formatarMoeda()+"\t\t"+"Fez Hora Extra: "+isHoraExtra()+"\t\t"+"Tem mais de 1 ano de empresa: "+isMD1ANE()+"\n Código do Cartão Gerente: "+CodigodeCaixa);
	}
}
