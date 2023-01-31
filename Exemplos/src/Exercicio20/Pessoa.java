package Exercicio20;

public class Pessoa {

	private String nome;
	private Integer idade;
	private String sexo;
	private String cpf;
	
	public Pessoa() {}
	
	public Pessoa(String nome, Integer idade, String sexo, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, Integer idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Pessoa(String nome, Integer idade) {
		
		super();
		this.nome = nome;
		this.idade = idade;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	@Override
	public String toString() {
		return "Pessoa [nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", cpf: " + cpf + "]";
	}

	
	
}
