package Exercicio21;

public class Aluno {

	private int matricula;
	private String nome;
	private Float notaP1, notaP2, notaTrabalho, media;

	public Aluno(int matricula, String nome, Float notaP1, Float notaP2, Float notaTrabalho) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaTrabalho = notaTrabalho;
		this.media = (notaP1 + notaP2 + notaTrabalho)/3;
	}

	public Aluno() {}

	public Float getMedia() {
		return media;
	}
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getNotaP1() {
		return notaP1;
	}

	public void setNotaP1(Float notaP1) {
		this.notaP1 = notaP1;
	}

	public Float getNotaP2() {
		return notaP2;
	}

	public void setNotaP2(Float notaP2) {
		this.notaP2 = notaP2;
	}

	public Float getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(Float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}

	public Float media () {
		return media;
	}
	
	public String resultadofinal () {
		if(media >= 6) {
			return "Aprovado";
		} else {
			return "Prova final";
		}
	}

	
	@Override
	public String toString() {
		return "Aluno matricula: " + matricula + ", nome: " + nome + ", notaP1: " + notaP1 + ", notaP2: " + notaP2
				+ ", notaTrabalho: " + notaTrabalho + ", media: " + media;
	}


	
}
