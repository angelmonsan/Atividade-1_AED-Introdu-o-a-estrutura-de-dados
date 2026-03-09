package Trabalho_01;

/**
 * Implementação de lista utilizando nós encadeados.
 * Não possui limite de tamanho, pois cresce dinamicamente.
 */
public class ListaDinamica implements ListaOperacoes {

    private No inicio; // referência para o primeiro nó
    private int tamanho;

    public ListaDinamica() {
        inicio = null;
        tamanho = 0;
    }

    /**
     * Exibe os elementos da lista.
     */
    public void exibir() {

        No atual = inicio;

        System.out.print("[ ");

        // percorre toda a lista
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }

        System.out.println("]");
    }

    @Override
    public int contar() {
        return tamanho;
    }

    @Override
    public int adicionarVarios(String[] elementos) {

        int adicionados = 0;

        for (String e : elementos) {

            // insere sempre no final
            inserir(tamanho, e);
            adicionados++;
        }

        return adicionados;
    }

    @Override
    public String obter(int indice) {

        if (indice < 0 || indice >= tamanho) {
            return null;
        }

        No atual = inicio;

        // percorre até o índice desejado
        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }

        return atual.valor;
    }

    @Override
    public boolean inserir(int indice, String elemento) {

        if (indice < 0 || indice > tamanho) {
            return false;
        }

        No novo = new No(elemento);

        // inserção no início da lista
        if (indice == 0) {

            novo.proximo = inicio;
            inicio = novo;

        } else {

            No anterior = inicio;

            // encontra o nó anterior à posição
            for (int i = 0; i < indice - 1; i++) {
                anterior = anterior.proximo;
            }

            novo.proximo = anterior.proximo;
            anterior.proximo = novo;
        }

        tamanho++;
        return true;
    }

    @Override
    public String removerPorIndice(int indice) {

        if (indice < 0 || indice >= tamanho) {
            return null;
        }

        No removido;

        if (indice == 0) {

            removido = inicio;
            inicio = inicio.proximo;

        } else {

            No anterior = inicio;

            for (int i = 0; i < indice - 1; i++) {
                anterior = anterior.proximo;
            }

            removido = anterior.proximo;
            anterior.proximo = removido.proximo;
        }

        tamanho--;

        return removido.valor;
    }

    @Override
    public void limpar() {

        // remove referência para todos os nós
        inicio = null;
        tamanho = 0;
    }

    @Override
    public int ultimoIndiceDe(String elemento) {

        No atual = inicio;
        int indice = 0;
        int ultimo = -1;

        elemento = elemento.toLowerCase();

        while (atual != null) {

            if (atual.valor != null && atual.valor.toLowerCase().equals(elemento)) {
                ultimo = indice;
            }

            atual = atual.proximo;
            indice++;
        }

        return ultimo;
    }

    @Override
    public int contarOcorrencias(String elemento) {

        No atual = inicio;
        int contador = 0;

        elemento = elemento.toLowerCase();

        while (atual != null) {

            if (atual.valor != null && atual.valor.toLowerCase().equals(elemento)) {
                contador++;
            }

            atual = atual.proximo;
        }

        return contador;
    }

    @Override
    public int substituir(String antigo, String novo) {

        No atual = inicio;
        int contador = 0;

        antigo = antigo.toLowerCase();

        while (atual != null) {

            if (atual.valor != null && atual.valor.toLowerCase().equals(antigo)) {
                atual.valor = novo;
                contador++;
            }

            atual = atual.proximo;
        }

        return contador;
    }

    @Override
    public int removerTodas(String elemento) {

        int removidos = 0;
        elemento = elemento.toLowerCase();

        // remove ocorrências no início
        while (inicio != null && inicio.valor != null && inicio.valor.toLowerCase().equals(elemento)) {
            inicio = inicio.proximo;
            tamanho--;
            removidos++;
        }

        No atual = inicio;

        while (atual != null && atual.proximo != null) {

            if (atual.proximo.valor != null && atual.proximo.valor.toLowerCase().equals(elemento)) {

                atual.proximo = atual.proximo.proximo;
                tamanho--;
                removidos++;

            } else {
                atual = atual.proximo;
            }
        }

        return removidos;
    }
}