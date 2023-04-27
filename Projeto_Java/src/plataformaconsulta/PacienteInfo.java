package plataformaconsulta;

public class PacienteInfo {

	
	private String nome;
	private int idade;
	private String rg;
	private String cpf;
	private String Planosaude;
	private float celular;
	
	public PacienteInfo (String nome, int idade, String rg,String cpf, String planosaude, float celular) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.Planosaude = planosaude;
		this.celular = celular;
		
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPlanosaude() {
		return Planosaude;
	}

	public void setPlanosaude(String planosaude) {
		Planosaude = planosaude;
	}
	
	public float getCelular() {
		return celular;
	}

	public void setCelular(float celular) {
		this.celular = celular;
	}
	
	public void imprimir() {
		System.out.println(nome+"\n"+"idade: "+idade+" anos"+"\n"+"Identidade: "+rg+"\n"+"CPF: "+cpf+"\n"+"Telefone para contato: "+celular+"vai dar entrada na clínica como Plano de Saúde ou Particular: "+Planosaude);

	}
}
