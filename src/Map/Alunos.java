package Map;

public class Alunos {
	
	String nome;
	String curso;
	String sala;
	Integer nota; 
	
	public Alunos(String nome, String curso, String sala, Integer nota) {
		
		this.nome = nome;
		this.curso = curso;
		this.sala = sala;
		this.nota = nota;
		
	}
	//===================================/
	//get/set Nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	//===================================/
	//get/set Curso
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	
	//===================================/
	//get/set Sala
	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	
	
	//===================================/
	//get/set Nota
	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Alunos [nome = " + nome + ", curso=" + curso + ", sala=" + sala + ", nota=" + nota + "]\n\n";
	}
	
	

}
