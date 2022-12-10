<h1 align="center">Exercicío - Aula 02 - Estrutura de dados.</h1>

<h4 align="center">Status: Criado</h4>

<p align="center">Utilizando a lista duplamente encadeada criada em aula com o código compartilhado, otimize a função de busca com o nome get de forma que se a posição for do início ao meio da lista, verifique a partir do início, já caso a posição seja maior que o meio, verifique a partir do final, caso ache o item, retorne sem finalizar a iteração.</p>

<h2>Resolução:</h2>
<h4>1 - Utilizando o desenvolvimento realizado em sala, a melhoria se encontra no metodo public T get(int posicao), nas linhas 58 a 76</h4>
<h2>Solicição proposta: Pegar a divisão do tamanho da lista, com o if é feita a comparação.</h2>
<h4>1 - Caso a posição seja menor que a divisão, o for é feito a partir do inicio da lista. </h4>
<h4>2 - Caso a posição seja maior que a divisão o for é realizado do final até o inicio</h4>
