package Trabalho_01;

/**
 * Interface que define todas as operações que as listas devem possuir.
 * Tanto a lista baseada em vetor quanto a lista encadeada devem
 * implementar exatamente esses métodos.
 */
public interface ListaOperacoes {

    int removerTodas(String elemento);

    int contar();

    int adicionarVarios(String[] elementos);

    String obter(int indice);

    boolean inserir(int indice, String elemento);

    String removerPorIndice(int indice);

    void limpar();

    int ultimoIndiceDe(String elemento);

    int contarOcorrencias(String elemento);

    int substituir(String antigo, String novo);
}