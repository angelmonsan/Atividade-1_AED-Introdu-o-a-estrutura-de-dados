package Trabalho_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaSimples listaSimples = new ListaSimples(10);
        ListaDinamica listaDinamica = new ListaDinamica();

        listaSimples.exibir();
        listaDinamica.exibir();

        // adicionando nomes

        String[] nomes = {"Angelo", "Carlos", "Saulo", "Pedro"};

        listaSimples.adicionarVarios(nomes);
        listaDinamica.adicionarVarios(nomes);

        listaSimples.exibir();
        listaDinamica.exibir();

        System.out.print("Digite o nome que deseja remover: ");
        String nome = sc.nextLine();

        System.out.println("\nRemovendo " + nome + " da Lista Simples");
        listaSimples.removerTodas(nome);

        System.out.println("\nRemovendo " + nome + " da Lista Dinâmica");
        listaDinamica.removerTodas(nome);

        System.out.println("\nResultado final:");

        listaSimples.exibir();
        listaDinamica.exibir();

        sc.close();
    }
}