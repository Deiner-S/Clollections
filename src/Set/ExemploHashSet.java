package Set;
import java.util.Set;
import java.util.HashSet;


public class ExemploHashSet {

	public static void main(String[] args) {
		ExemploHashSet();
	}
	
	public static void ExemploHashSet(){
		
		Set<String> lista = new HashSet<>();
		
		lista.add("Item-1");
		lista.add("Item-2");
		//lista.add("Item-1");
		lista.add("Item-3");
		//lista.add("Item-1");
		lista.add("Item-4");
		
		System.out.println(lista);
		System.out.println("");
		
		
		
	}

}
