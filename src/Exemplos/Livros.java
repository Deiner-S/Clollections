package Exemplos;

public class Livros implements Comparable<Livros> {
	
	private String nome;
	private String autor;
	private String editora;
	private String anoEdicao;
	private int numeroPaginas;
	
	public Livros(String nome, String autor, String editora, String anoEdicao, int numeroPaginas) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.anoEdicao = anoEdicao;
		this.numeroPaginas = numeroPaginas;
		
	}
	
	
	//==========================================
	//get/set nome
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	//==========================================
	// get/set autor
	public String getAutor() {
		return this.nome;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	//==========================================
	//get/set editora
	public String getEditora() {
		return this.editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
	//==========================================
	//get/set anoEdicao
	public String getAnoEdicao() {
		return this.nome;
	}
	
	public void setAnoEdicao(String anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	
	
	
	//==========================================
	//get/set numeroPaginas
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
	public String toString() {
		return "Livro{" +'\n'+
				"nome = " + nome + '\n'+
				"autor = " + autor + '\n'+
				"editora = " + editora + '\n'+
				"anoEdicao = " + anoEdicao + '\n'+
				"numeroPaginas = " + numeroPaginas + '\n'+
				'}';
	}
	/**
	 * Usado para comparação entre objetos e verificar se o mesmo é igual 
	 * @param livro
	 * @return
	 */

	@Override
	public int compareTo(Livros livro) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(livro.getNome());
	}

}
