package Exemplos;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class ExemploArrayDeque {

	public static void main(String[] args) {
		AcessandoFila();
		RemoveFila();
	}
	
	/**
	 * <h1>Acessando Fila Deque</h1><br>
	 * <p>Ao declarar esse tipo de fila, como ela está abaixo de uma super collection Queue, você pode declara-lo utilizando a Queue, porem, ao fazer isso você não terá acesso aos métodos expecíficos da coleção Deque</p>
	 * 
	 * @author Deiner.Souza
	 */
	public static void AcessandoFila() {
		
		System.out.println("================   ACESSANDO FILA	================\n\n");
		
		Deque<String> deque1 = new ArrayDeque<>();
		
		deque1.add("cor1");
		deque1.add("cor2");
		deque1.add("cor3");
		deque1.add("cor4");
		deque1.add("cor5");
		
		Deque<String> deque2 = new ArrayDeque<>();
		
		deque2.add("cor6");
		deque2.add("cor7");
		
		
		deque1.addAll(deque2);
		
		System.out.println(deque1+"\n\n");
		System.out.println(deque1.contains("cor3"));
		System.out.println(deque2.contains("cor6"));
		System.out.println(deque2.containsAll(deque1)); // contem deque2 em deque 1 ? 
		
		System.out.println("\n\nInput output Deque using element e get\n");
		
		System.out.println("Output of element: " + deque1.element());
		System.out.println("Get first element using getFirst: " + deque1.getFirst());
		System.out.println("Get last element using getLast: " + deque1.getLast());
		System.out.println("\n\nInput output Deque using peek\n");
		System.out.println("Output of peek: " + deque1.peek());
		System.out.println("Get first element using peekFirst: "+ deque1.peekFirst());
		System.out.println("Get last element using peekLast: "+ deque1.peekLast());
		
	}
	
	public static void RemoveFila() {
	
		System.out.println("\n\n\n================   REMOVENDO FILA	================\n\n");
		
		Deque<String> deque1 = new ArrayDeque<>();
		
		deque1.add("cor1");
		deque1.add("cor2");
		deque1.add("cor3");
		deque1.add("cor4");
		deque1.add("cor5");
		
		Deque<String> deque2 = new ArrayDeque<>();
		
		deque2.add("cor6");
		deque2.add("cor7");
		deque2.add("cor8");
		deque2.add("cor9");
		deque2.add("cor10");
		
		
		
		deque1.addAll(deque2);
		System.out.println("addAll\nElementos em ArayDeque: " + deque1);
		
		
		
	
		String valor = deque1.remove();//remove primeiro elemento da fila
		deque1.remove("cor7"); // remove o elemento escolhido		
		System.out.println("\n\nremove\nElementos em ArayDeque: " + deque1);
		
		
		
		deque1.removeFirst();
		deque1.removeLast();		
		System.out.println("\n\nremoveFirst/Last\nElementos em ArayDeque: " + deque1);
		
		
		
		
		deque1.poll(); //remove primeiro da fila
		deque1.pollFirst();
		deque1.pollLast();		
		System.out.println("\n\npoll/pollFirst/Last\nElementos em ArayDeque: " + deque1);
		
		
		
		
		deque1.pop();		
		System.out.println("\n\npop\nElementos em ArayDeque: " + deque1);
		
		
		
		
		deque1.retainAll(deque2);		
		System.out.println("\n\nretainAll\nElementos em ArayDeque: " + deque1);
		
		
		
		
		deque1.removeAll(deque2);		
		System.out.println("\n\nremoveAll\nElementos em ArayDeque: " + deque1);
		
		
		
		
		System.out.println("\n\nElementos variavel valor: " + valor);
		
		
		
		
	}

}
