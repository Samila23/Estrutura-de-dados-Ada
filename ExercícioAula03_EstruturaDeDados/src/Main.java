import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma das opções:");
		System.out.println("[1] - Fila");
		System.out.println("[2] - Pilha ");
		int menuPrincipal = sc.nextInt();

		if (menuPrincipal == 1) {
			fila();
		}else
			if(menuPrincipal == 2) {
				pilha();
			}

	}

	public static void fila() {
		Scanner sc = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();

		int menuFila;
		String nome;
		do {
			System.out.println("Menu de opções para FILA:");
			System.out.println("Escolha uma das opções:");
			System.out.println("[1] - Adicionar");
			System.out.println("[2] - Remover ");
			System.out.println("[3] - Listar");
			System.out.println("[0] - Encerrar");
			menuFila = sc.nextInt();

			if (menuFila == 1) {
				sc.nextLine();
				System.out.println("Qual nome deseja adicionar?");
				nome = sc.nextLine();
				fila.offer(nome);
				System.out.println("\n\n");
			}
			if (menuFila == 2) {
				System.out.println("");
				String itemRetirado = fila.peek();
				System.out.println("\n - Primeiro Item da Fila removido :" + itemRetirado);
				System.out.println("\n\n");
			}
			if (menuFila == 3) {
				System.out.println("Lista completa da Fila :");
				for (String item : fila) {
					System.out.println(item);
				}
				System.out.println("\n\n");
			}
		} while (menuFila != 0);
	}
	
	public static void pilha() {
		Scanner sc = new Scanner(System.in);
		Stack<String> pilha = new Stack<>();

		int menuPilha;
		String nome;
		do {
			System.out.println("Menu de opções para PILHA:");
			System.out.println("Escolha uma das opções:");
			System.out.println("[1] - Adicionar");
			System.out.println("[2] - Remover ");
			System.out.println("[3] - Listar");
			System.out.println("[0] - Encerrar");
			menuPilha = sc.nextInt();
			
			if (menuPilha == 1) {
				sc.nextLine();
				System.out.println("Qual nome deseja adicionar?");
				nome = sc.nextLine();
				pilha.push(nome);
				System.out.println("\n\n");
			}
			if (menuPilha == 2) {
				System.out.println("");
				String itemRetirado = pilha.pop();
				System.out.println("\n - Último Item da Pilha removido :" + itemRetirado);
				System.out.println("\n\n");
			}
			if (menuPilha == 3) {
				System.out.println("Lista completa da pilha:");
				for (String item : pilha) {
					System.out.println(item);
				}
				System.out.println("\n\n");
			}
		}while(menuPilha != 0);
	}
}
