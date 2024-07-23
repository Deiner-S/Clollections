package Queue;

import java.util.Queue;
import java.util.PriorityQueue;
/**
 * Possui ordenação natural
 * 
 * @author Deiner.Rodrigues 
 */

public class ExemploPriorityQueue {

	public static void main(String[] args) {
		Queue<String> fila = new PriorityQueue<>();
		
		fila.add("paciente 1");
		fila.add("paciente 2");
		fila.add("paciente 3");
		
		while(fila.size() !=0) {
			System.out.println(fila.remove());
		}
		

	}

}
