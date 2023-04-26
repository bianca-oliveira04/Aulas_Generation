package poo;

public class Vendedor extends Exercicio1_Empregado{
	
	private int Metadeatendimento;

	public Vendedor(String nome, int idade, float salario, boolean horaExtra, boolean mD1ANE, int metadeatendimento) {
		super(nome, idade, salario, horaExtra, mD1ANE);
		Metadeatendimento = metadeatendimento;
	}

	public int getMetadeatendimento() {
		return Metadeatendimento;
	}

	public void setMetadeatendimento(int metadeatendimento) {
		Metadeatendimento = metadeatendimento;
	}
	
	public void imprimirInfo() {
		System.out.println(getNome() +"\t\t"+getIdade()+" anos"+"\t\t"+"Salário: "+this.formatarMoeda()+"\t\t"+"Fez Hora Extra: "+isHoraExtra()+"\t\t"+"Tem mais de 1 ano de empresa: "+isMD1ANE()+"\n Meta diária de pessoas a atender: "+Metadeatendimento);
	}
}
