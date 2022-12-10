package Aula02;

public class Lista<T> {
	ListaEncadeada<T> primeiroItem;
	ListaEncadeada<T> ultimoItem;
	int tamanho = 0;
	int excluido;
	
	public Lista() {
	}
	
	public T add(T dado) {

		if(ultimoItem == null) {
			this.primeiroItem = new ListaEncadeada<T>();
			//ListaEncadeada<T> item = new ListaEncadeada<>();
			primeiroItem.setDado(dado);
			ultimoItem = primeiroItem;
		}
		
		else {
			ListaEncadeada<T> item = new ListaEncadeada<>();
			item.setDado(dado);
			ultimoItem.setProximo(item);
			ultimoItem = item;
		}
		System.out.println(primeiroItem.getDado());
		System.out.println(ultimoItem == null?"":ultimoItem.getDado());
		System.out.println(primeiroItem);
		System.out.println(ultimoItem);
		
		tamanho++;
		return dado;
	}
	
	public T get (int posicao) throws Exception {
		if(posicao < 0) {
			throw new Exception("Posicao não pode ser negativa");
		}
		if(posicao == 0) {
			return primeiroItem.getDado();
		}
		if(posicao>=tamanho) {
			throw new Exception("Posicao não pode ser maior que o tamanho");
		}
		ListaEncadeada<T> item = primeiroItem;
		for (int i = 0; i < posicao; i ++) {
			item = item.getProximo();
		}
		return item.getDado();
	}
	
	
	public static void main(String[] ars) throws Exception  {
		Lista<String> listaEncadeada = new Lista<>();
		
		listaEncadeada.add("Sâmila");
		listaEncadeada.add("Camila");
		listaEncadeada.add("ultimo");
		
		System.out.println(listaEncadeada.get(2));
	}
	
}
