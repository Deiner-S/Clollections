/**
 * 
 */
package Exemplos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Cujo tamanho pode crescer. <br>
 * Possui maior eficiencia em relação a busca de dados.<br>
 * Menor eficiencia na inserção e exclusão.
 * 
 * @author Deiner.Rodriges 
 * 
 */
public class ExemploArrayList {

	public static void main(String[] args) {
		
		//exemploListaSimples();
		exemploListaObjeto();
	
	}
	

	
	
	
	
	/**
	 * <p>Como instanciar uma lista do tipo ArrayList </p>
	 * 
	 * <ol>
	 * 	<li>Declarar a interface</li>
	 * 	<li>Definir o tipo de dado que a lista ira receber</li>
	 * 	<li>Defininir nome da lista(variavel)</li>
	 * 	<li>inserir atribuição</li>
	 * 	<li>instanciar o tipo de implementação </li>
	 * </ol>
	 * 
	 * <p>Método para ADICIONAR item na lista:</p>
	 * 
	 * <ul>
	 * 	<li>NomeDaLista.add(item);</li>
	 * </ul>
	 * 
	 * <p>Método para ORDENAR items na lista:</p>
	 * 
	 * <ul>
	 * 	<li>Collections.sort(nomeDaLista);</li>
	 * </ul>
	 * 
	 * 
	 */	 
	private static void exemploListaSimples() {
		System.out.println("===================Exemplo Lista Simples===================");
		List<String> lista = new ArrayList<>();
		
		lista.add("Ice");
		lista.add("And");
		lista.add("Fire");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
	}
	
	
	
	private static void exemploListaObjeto() {
		System.out.println("===================Biblioteca===================");
		
		
		Scanner scan = new Scanner(System.in);
		List<Livros> biblioteca = new ArrayList<>();
		String porta = "sim";
		
		
		while(porta.equalsIgnoreCase("sim")) {			
			
			System.out.println("Bem vindo a nossa biblioteca virtural! \n\n");
			
			System.out.println("Nome do livro: ");	
			String nome = scan.nextLine();
			
			System.out.println("Autor do livro: ");	
			String autor = scan.nextLine();
			
			System.out.println("Editora do livro: ");	
			String editora = scan.nextLine();
			
			System.out.println("Ano da primeira edição do livro: ");	
			String anoEdicao = scan.nextLine();
			
			System.out.println("Numero de páginas do livro: ");	
			int numeroPaginas = scan.nextInt();
			
			
			Livros construtor = new Livros(nome, autor, editora, anoEdicao, numeroPaginas);
			
			biblioteca.add(construtor);
			
			System.out.println("Gostaria de continuar adicionando livros ? sim ou não?");
			scan.nextLine();//consumir proxima linha
			
			porta = scan.nextLine();
			
			
			
			
		}	
		
		
		System.out.println("n\n Sem Ordenação"+biblioteca);
				
		ordenarObjeto(biblioteca);
		
		scan.close();
		
		
	}
	
	
	/**
		 * <h1>CompararNumeroPaginas</h1><br>
		 * <p>Utilizado quando necessário adicionar mais algum tipo de comparação para um objeto que já está utilizando método </p>
		 * 
		 */
	public static void ordenarObjeto(List<Livros>biblioteca) {
		
		//Comparable
		
		Collections.sort(biblioteca);
		System.out.println("\n\n Ordenação por ordem alfabetica"+biblioteca);
		
		//Comparator
		
		CompararNumeroPaginas compararNumeroPaginas = new CompararNumeroPaginas();
		Collections.sort(biblioteca, compararNumeroPaginas);
		System.out.println("\n\n\n Ordenação por pagina"+biblioteca);
	}

}
