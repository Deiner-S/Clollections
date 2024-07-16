package Exemplos;
import java.util.Comparator;

public class CompararNumeroPaginas implements Comparator<Livros>{
	

	@Override
	public int compare(Livros livro1,  Livros livro2) {
		
		return Integer.compare(livro1.getNumeroPaginas(), livro2.getNumeroPaginas());
	}

	

}
