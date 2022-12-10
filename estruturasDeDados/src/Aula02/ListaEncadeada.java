package Aula02;


public class ListaEncadeada <T>{

	private T dado;
	private ListaEncadeada<T> proximo;
	
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	public ListaEncadeada<T> getProximo() {
		return proximo;
	}
	public void setProximo(ListaEncadeada<T> proximo) {
		this.proximo = proximo;
	}
}
