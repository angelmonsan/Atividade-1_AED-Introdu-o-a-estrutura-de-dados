package Trabalho_01;

/**
 * Implementação de lista utilizando vetor (String[]).
 * Possui tamanho fixo definido no construtor.
 */
public class ListaSimples implements ListaOperacoes {

    private String[] elementos; // vetor onde os dados são armazenados
    private int tamanho; // quantidade real de elementos usados no vetor

    public ListaSimples(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    /**
     * Exibe os elementos presentes na lista.
     */
    public void exibir() {

        System.out.print("[ ");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }

        System.out.println("]");
    }

    @Override
    public int contar() {
        // retorna apenas o número de elementos válidos
        return tamanho;
    }

    @Override
    public int adicionarVarios(String[] novos) {

        int adicionados = 0;

        // percorre o vetor recebido
        for (String e : novos) {

            // verifica se ainda há espaço no vetor
            if (tamanho < elementos.length) {
                elementos[tamanho] = e;
                tamanho++;
                adicionados++;
            }
        }

        return adicionados;
    }

    @Override
    public String obter(int indice) {

        // validação do índice
        if (indice < 0 || indice >= tamanho) {
            return null;
        }

        return elementos[indice];
    }

    @Override
    public boolean inserir(int indice, String elemento) {

        // verifica se índice é válido e se ainda existe espaço
        if (indice < 0 || indice > tamanho || tamanho == elementos.length) {
            return false;
        }

        // desloca os elementos para abrir espaço
        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[indice] = elemento;
        tamanho++;

        return true;
    }

    @Override
    public String removerPorIndice(int indice) {

        if (indice < 0 || indice >= tamanho) {
            return null;
        }

        String removido = elementos[indice];

        // desloca os elementos para preencher o espaço
        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho--;

        return removido;
    }

    @Override
    public int removerTodas(String elemento) {

        int removidos = 0;

        // padroniza o texto digitado para minúsculo
        elemento = elemento.toLowerCase();

        // percorre toda a lista procurando o elemento
        for (int i = 0; i < tamanho; i++) {

            // comparação ignorando maiúscula/minúscula
            if (elementos[i] != null && elementos[i].toLowerCase().equals(elemento)) {

                // desloca os elementos à direita
                for (int j = i; j < tamanho - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }

                tamanho--;
                removidos++;

                // volta uma posição para verificar novamente
                i--;
            }
        }

        return removidos;
    }

    @Override
    public void limpar() {

        // apenas reseta o tamanho lógico
        tamanho = 0;
    }

    @Override
    public int ultimoIndiceDe(String elemento) {

        elemento = elemento.toLowerCase();

        // percorre de trás para frente
        for (int i = tamanho - 1; i >= 0; i--) {

            if (elementos[i] != null && elementos[i].toLowerCase().equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int contarOcorrencias(String elemento) {

        int contador = 0;
        elemento = elemento.toLowerCase();

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i] != null && elementos[i].toLowerCase().equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

    @Override
    public int substituir(String antigo, String novo) {

        int contador = 0;
        antigo = antigo.toLowerCase();

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i] != null && elementos[i].toLowerCase().equals(antigo)) {
                elementos[i] = novo;
                contador++;
            }
        }

        return contador;
    }
}