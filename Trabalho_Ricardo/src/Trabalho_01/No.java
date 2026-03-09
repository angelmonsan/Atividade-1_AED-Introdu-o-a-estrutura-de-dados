package Trabalho_01;

/**
 * Classe que representa um nó da lista encadeada.
 * Cada nó possui:
 * - um valor (String)
 * - uma referência para o próximo nó
 */
public class No {

    String valor;
    No proximo;

    public No(String valor) {
        this.valor = valor;
        this.proximo = null;
    }
}