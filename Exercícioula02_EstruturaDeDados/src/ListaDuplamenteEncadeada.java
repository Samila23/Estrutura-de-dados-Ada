public class ListaDuplamenteEncadeada<T> {
	

	public class ItemListaEncadeada<K> {
	    private K dado;
	    private ItemListaEncadeada<K> anterior;
	    private ItemListaEncadeada<K> proximo;
		public K getDado() {
			return dado;
		}
		public void setDado(K dado) {
			this.dado = dado;
		}
		public ItemListaEncadeada<K> getAnterior() {
			return anterior;
		}
		public void setAnterior(ItemListaEncadeada<K> anterior) {
			this.anterior = anterior;
		}
		public ItemListaEncadeada<K> getProximo() {
			return proximo;
		}
		public void setProximo(ItemListaEncadeada<K> proximo) {
			this.proximo = proximo;
		}
	    
	    
	}
	
    ItemListaEncadeada<T> primeiroItem;
    ItemListaEncadeada<T> ultimoItem;
    int tamanho = 0;

    public ListaDuplamenteEncadeada() {}

    public T add(T dado){
        if(primeiroItem==null){
            this.primeiroItem = new ItemListaEncadeada<>();
            primeiroItem.setDado(dado);
            ultimoItem = primeiroItem;
        } else {
            ItemListaEncadeada<T> item = new ItemListaEncadeada<>();
            item.setDado(dado);
            item.setAnterior(ultimoItem);
            ultimoItem.setProximo(item);
            ultimoItem = item;
        }
        /*System.out.println(primeiroItem.getDado());
        System.out.println(ultimoItem==null?"":ultimoItem.getDado());
        System.out.println(primeiroItem);
        System.out.println(ultimoItem);
        System.out.println();
        System.out.println();*/
        tamanho++;
        return dado;
    }

    public T get(int posicao) throws Exception {
        this.validateRulesList(posicao);
        if (posicao == 0) return primeiroItem.getDado();
        ItemListaEncadeada<T> item = primeiroItem;
        //Se a posicao for menor que a divisão, eu vou fazer o for iniciado da posição 0.
        if(posicao <= (tamanho/2)) {
            for (int i = 0; i < posicao; i++) {
                item = item.getProximo();
            }

        }
        //Se a posicao for maior que a divisão, eu vou fazer o for reverse.
        if(posicao >= (tamanho/2 + 1)) {
            for (int i = tamanho; i < posicao; i--) {
                item = item.getProximo();
            }
        }
        return item.getDado();
    }
    
    private ItemListaEncadeada<T> getItem(int posicao) throws Exception {
        this.validateRulesList(posicao);
        
        if (posicao == 0) return primeiroItem;

        ItemListaEncadeada<T> item = primeiroItem;

        for (int i = 0; i < posicao; i++) {
            item = item.getProximo();
        }

        return item;
    }

    public T remove(int posicao) throws Exception {

        if (posicao == 0) {
        	T dado = primeiroItem.getDado();
            primeiroItem = primeiroItem.getProximo();
            return dado;
        }
        
        ItemListaEncadeada<T> itemAtual = this.getItem(posicao);
        ItemListaEncadeada<T> itemAnterior = itemAtual.getAnterior();

        if (itemAtual == ultimoItem) {
            ultimoItem = itemAnterior;
            itemAnterior.setProximo(null);
        } else {
            itemAnterior.setProximo(itemAtual.getProximo());
        }

        return itemAtual.getDado();
    }

    public T validateRulesList(int posicao) throws Exception {
        if (posicao < 0) throw new Exception("Posição não pode ser negativa");
        if (posicao >= tamanho) throw new IndexOutOfBoundsException("Posição acima do tamanho da lista");

        return null;
    }

    public void printList() {
        ItemListaEncadeada<T> item = primeiroItem;

        System.out.println("\n");
        System.out.println("primeiroItem: " +  primeiroItem.getDado());
        System.out.println("ultimoItem: "  + ultimoItem.getDado());

        while (item.getProximo() != null) {
            System.out.println(item.getDado());
            item = item.getProximo();
        }

        System.out.println(item.getDado());
    }
    
    public void printListReverse() {
        ItemListaEncadeada<T> item = ultimoItem;

        System.out.println("\n");
        System.out.println("primeiroItem: " +  ultimoItem.getDado());
        System.out.println("ultimoItem: "  + primeiroItem.getDado());

        while (item.getAnterior() != null) {
            System.out.println(item.getDado());
            item = item.getAnterior();
        }

        System.out.println(item.getDado());
    }

    public static void main(String[] args) throws Exception {
    	ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Ultimo");
        lista.add("Fábio");
        lista.add("Lucas");
        lista.add("Samila");
        lista.add("Vivi");
        lista.add("Camila");
        lista.add("Isa");
        
        lista.printList();
        
        lista.printListReverse();

        //lista.remove(3);

        //lista.printList();
    }

}
