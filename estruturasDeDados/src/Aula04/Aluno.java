package Aula04;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private String matricula;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}


	@Override
	public String toString() {
		return "nome= " + nome + ", matricula= " + matricula + "\n";
	}


	@Override
	public int compareTo(Aluno aluno) {
		int ordenacaoAluno = this.nome.compareTo(aluno.nome);
		if(ordenacaoAluno != 0) {
			return ordenacaoAluno;
		}
		return this.matricula.compareTo(aluno.matricula);
	}
	
	
	
}
