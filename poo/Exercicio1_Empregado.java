package poo;

import java.text.NumberFormat;

public class Exercicio1_Empregado {
	
	private String nome;
	private int idade;
	private float salario;
	private boolean horaExtra;
	private boolean MD1ANE;
	
	public Exercicio1_Empregado(String nome, int idade, float salario, boolean horaExtra, boolean mD1ANE) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.horaExtra = horaExtra;
		MD1ANE = mD1ANE;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalário() {
		return salario;
	}
	public void setSalário(float salário) {
		this.salario = salário;
	}
	public boolean isHoraExtra() {
		return horaExtra;
	}
	public void setHoraExtra(boolean horaExtra) {
		this.horaExtra = horaExtra;
	}
	public boolean isMD1ANE() {
		return MD1ANE;
	}
	public void setMD1ANE(boolean mD1ANE) {
		MD1ANE = mD1ANE;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();//pega a moeda padrão do país no nosso caso R$
		nf.setMinimumFractionDigits(2);//estabelece o número de casas depois da virgula
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome+"\t\t"+idade+" anos"+"\t\t"+"Salário: "+this.formatarMoeda()+"\t\t"+"Fez Hora Extra: "+horaExtra+"\t\t"+"Tem mais de 1 ano de empresa: "+MD1ANE);
	}
	

}
