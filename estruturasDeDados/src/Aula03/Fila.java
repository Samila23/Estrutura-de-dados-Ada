package Aula03;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<>();
		
		//offer é == .add
		fila.add("Samila");
		fila.offer("Lucas");
		fila.offer("Camila");
		fila.offer("Isa");
		fila.offer("Vivi");
		
		//peek - ele pega o primeiro e não remove da pilha
		String itemRetirado = fila.peek();
		System.out.println("\n - Primeiro Item e não removido da ListaEncadeada:" + itemRetirado);
		for(String item : fila) {
			System.out.println("ListaEncadeada completa:" + item);
		}
		//poll - ele pega o primeiro e remove da pilha
		
		String itemNãoRetirado = fila.poll();
		System.out.println("\n - Primeiro Item e removido da ListaEncadeada:" + itemNãoRetirado);
		
		for(String item : fila) {
			System.out.println("ListaEncadeada completa:" + item);
		}
	}

}
