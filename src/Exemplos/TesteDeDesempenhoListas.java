package Exemplos;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TesteDeDesempenhoListas {

	public static void main(String[] args) {
		System.out.println("\n\n\n ArrayList	ArrayList	ArrayList	ArrayList	ArrayList	ArrayList	ArrayList	ArrayList\n\n\n");
		
		testeArrayListAdd();
		testeArrayListRemove();
		
		System.out.println("\n\n\n LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList\n\n\n");
		
		testeLinkedListAdd();
		testeLinkedListRemove();

	}
	
	
	private static void testeArrayListAdd() {
		
		final int MAX = 200000;
		
		long tInicio = System.currentTimeMillis();
		
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0;i<MAX;i++) {
			lista.add(i);
		}
		for(int i = 0;i<MAX;i++) {
			lista.contains(i);
		}
		
		
		long tFim = System.currentTimeMillis();
		System.out.println("Tempo total Gasto para add item: " + (tFim - tInicio)+"\n");
	}
	
private static void testeArrayListRemove() {
		
		final int MAX = 200000;
		
		long tInicio = System.currentTimeMillis();
		
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0;i<MAX;i++) {
			lista.add(i);
		}
		for(int i = MAX -1;i>0;i--) {
			lista.remove(i);
		}
		
		
		long tFim = System.currentTimeMillis();
		System.out.println("Tempo total Gasto para remov item: " + (tFim - tInicio));
	}



//============================================================================================================================================================|
//============================================================================================================================================================|
//LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList	LinkedList|
//============================================================================================================================================================|
//============================================================================================================================================================|



private static void testeLinkedListAdd() {
	
	final int MAX = 200000;
	
	long tInicio = System.currentTimeMillis();
	
	List<Integer> lista = new LinkedList<>();
	
	for(int i = 0;i<MAX;i++) {
		lista.add(i);
	}
	for(int i = 0;i<MAX;i++) {
		lista.contains(i);
	}
	
	
	long tFim = System.currentTimeMillis();
	System.out.println("Tempo total Gasto para add item: " + (tFim - tInicio)+"\n");
}

private static void testeLinkedListRemove() {
	
	final int MAX = 200000;
	
	long tInicio = System.currentTimeMillis();
	
	List<Integer> lista = new LinkedList<>();
	
	for(int i = 0;i<MAX;i++) {
		lista.add(i);
	}
	for(int i = MAX -1;i>0;i--) {
		lista.remove(i);
	}
	
	
	long tFim = System.currentTimeMillis();
	System.out.println("Tempo total Gasto para remov item: " + (tFim - tInicio));
}





}
