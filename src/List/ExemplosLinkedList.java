package List;

import java.util.LinkedList;
import java.util.List;

public class ExemplosLinkedList {

	public static void main(String[] args) {
		
		exemploLinkedList();
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public static void exemploLinkedList() {
		
		List<Livros> biblioteca = new LinkedList<>();
		
		
		Livros livro1 = new Livros("A Sociedade Do Anel","J.R.R Tolkien","HarperCollinsBrasil","Rio de Janeiro 2022",604 ); 
		Livros livro2 = new Livros("A Song of Ice and Fire","George R. R. Martin","Suma","edição (25 março 2019)",600 );
		Livros livro3 = new Livros("As Duas Torres","J.R.R Tolkien","HarperCollinsBrasil","Rio de Janeiro 2022",466 ); 
		Livros livro4 = new Livros("O Retorno Do Rei","J.R.R Tolkien","HarperCollinsBrasil","Rio de Janeiro 2022",608 ); 
		Livros livro5 = new Livros("A Dança dos Dragões","George R. R. Martin","‎Casa dos Mundos","1ª edição (1 julho 2012)",864  ); 
		
		
		biblioteca.add(livro5);
		biblioteca.add(livro4);
		biblioteca.add(livro3);
		biblioteca.add(livro2);
		biblioteca.add(livro1);
		
		System.out.println(biblioteca);
		
		biblioteca.remove(2);
		System.out.println(biblioteca);
		
			// retorna um boolean
			System.out.print(biblioteca.contains(livro2));
		

	}

}
