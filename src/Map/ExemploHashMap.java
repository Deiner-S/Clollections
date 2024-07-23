package Map;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

/**
 * Para usar classe que implementa map , quaisquer  classes  que forem utilizadas  com chave 
 * devem  sobrescrever  os métodos  hashCod() e equals()
 * @author Deiner.Souza
 */
public class ExemploHashMap {

	public static void main(String[] args) {
		exemploListaHashMap();
		exemplosIterandoHashMap();
		
		

	}
	private static void exemplosIterandoHashMap() {
		Map<Integer, String> lista = new HashMap<>();
		
		lista.put(1, "Machado de assim");
		lista.put(2, "J.R.R Tolkien");
		lista.put(3, "George R.R. Martin");
		lista.put(4, "Machado de assim");
		
		Set<Map.Entry<Integer, String>> entry = lista.entrySet();
		for(Map.Entry<Integer, String> e : entry) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		System.out.println("\n\n ================= API Stream EX 1 ================= ");
		
		lista.entrySet().forEach(e ->{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		});
		
		System.out.println("\n\n ================= API Stream EX 2 ================= ");		
		lista.keySet().stream().forEach(System.out::println);
		
		
		System.out.println("\n\n ================= API Stream EX 3 ================= ");		
		lista.values().stream().forEach(System.out::println);
		
		
		System.out.println("\n\n ================= API Stream EX 3 ================= ");		
		lista.forEach((key , value)-> System.out.println(key +" = "+ value));
		
		
		
	}
	
	/**
	 * <h1>EXEMPLO HASHMAP LISTA SIMPLES</h1>
	 * <h2>DECLARAÇÃO</h2>
	 * 		<ol> 
	 * 		
	 * 				<li>Declarar interface Map</li>
	 * 				<li>Declarar os dois tipos de variavel </li>
	 * 				<li>Definir nome da lista</li>
	 * 				<li>Depois instanciar a implementação, neste caso o HashMap</li>
	 * 		
	 * 		</ol>
	 * <h2>METODOS</h2>
	 * 
	 * 		<ol>
	 * 				<li>lista.put();</li>
	 * 				<li>lista.values();</li>
	 * 				<li>lista.keySet();</li>	
	 * 				<li>lista.entrySet();</li>
	 * 		</ol> 
	 */
	private static void exemploListaHashMap() {
		
		Map<Integer, String> lista = new HashMap<>();
		
		lista.put(1, "Machado de assim");
		lista.put(2, "J.R.R Tolkien");
		lista.put(3, "George R.R. Martin");
		lista.put(4, "Machado de assim");
		
//		lista.values();  
//		lista.keySet(); 
		System.out.println(lista.values()+"\n\n");//retorna somente os valores sem as chaves em formato Collection
		System.out.println(lista.keySet()+"\n\n");//retornar somente as chaves em formato Set		
		System.out.println(lista);
	}

}
