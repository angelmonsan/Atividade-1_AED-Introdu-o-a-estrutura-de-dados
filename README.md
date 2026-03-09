# Atividade-1_AED-Introdu-o-a-estrutura-de-dados

---

## Descrição do Projeto

Este projeto tem como objetivo implementar e comparar duas estruturas de dados utilizadas para armazenar elementos do tipo `String` em listas. As duas implementações seguem o mesmo conjunto de operações definidas por uma interface comum, permitindo que ambas ofereçam as mesmas funcionalidades, mesmo possuindo estruturas internas diferentes.

As estruturas implementadas são:

- **Lista Simples**, baseada em vetor (`String[]`)
- **Lista Dinâmica**, baseada em lista encadeada com nós

O principal objetivo do trabalho é demonstrar como diferentes estruturas de dados podem resolver os mesmos problemas, além de permitir a comparação entre suas formas de implementação e funcionamento.

---

## Lista Simples

A **Lista Simples** é implementada utilizando um vetor (`String[]`) para armazenar os elementos. Esse vetor possui um tamanho definido no momento da criação da lista, o que significa que sua capacidade máxima é fixa.

Para controlar quantos elementos estão realmente armazenados no vetor, a implementação utiliza uma variável chamada `tamanho`. Essa variável representa a quantidade de posições válidas ocupadas na lista.

Quando elementos são adicionados ou removidos, o valor dessa variável é atualizado. Em operações como inserção ou remoção em posições específicas, os elementos do vetor precisam ser deslocados para manter a organização da lista.

Essa abordagem permite acesso rápido a posições específicas da lista, mas possui a limitação de possuir capacidade máxima previamente definida.

---

## Lista Dinâmica

A **Lista Dinâmica** é implementada utilizando uma estrutura de **lista encadeada**, na qual cada elemento da lista é armazenado dentro de um nó.

Cada nó contém dois elementos principais: um valor (`String`) e uma referência para o próximo nó da lista. A lista mantém uma referência para o primeiro nó, que é utilizado como ponto inicial para percorrer toda a estrutura.

Diferente da lista baseada em vetor, a lista dinâmica não possui limite fixo de tamanho. Novos elementos podem ser adicionados conforme necessário, pois novos nós podem ser criados dinamicamente durante a execução do programa.

Para acessar elementos em posições específicas, é necessário percorrer os nós da lista desde o início até a posição desejada.

---

# Interface Utilizada

As duas estruturas implementam a interface `ListaOperacoes`. Essa interface define um conjunto de métodos que devem obrigatoriamente existir em qualquer implementação de lista utilizada no projeto.

A utilização da interface garante que as duas estruturas tenham o mesmo comportamento funcional e ofereçam as mesmas operações ao usuário, mesmo que internamente utilizem técnicas diferentes de armazenamento.

Essa padronização também facilita a manutenção do código e permite que o programa principal utilize qualquer uma das implementações sem precisar conhecer detalhes da sua estrutura interna.

---

# Funcionalidades Implementadas

As funcionalidades implementadas permitem realizar diversas operações sobre as listas, tornando sua manipulação mais completa.

Entre as principais operações implementadas estão:

- Remover todas as ocorrências de um determinado elemento da lista
- Contar a quantidade total de elementos presentes na estrutura
- Adicionar múltiplos elementos de uma só vez
- Obter o elemento armazenado em uma posição específica
- Inserir um elemento em um índice determinado
- Remover um elemento localizado em uma posição específica
- Limpar completamente a lista
- Encontrar o índice da última ocorrência de um elemento
- Contar quantas vezes um elemento aparece na lista
- Substituir todas as ocorrências de um elemento por outro

Todas essas funcionalidades foram implementadas tanto na **Lista Simples** quanto na **Lista Dinâmica**, respeitando as características de cada estrutura.

---

# Alterações em Relação à Versão Inicial

Na versão inicial do projeto, as listas possuíam apenas funcionalidades básicas de manipulação, como exibir os elementos, adicionar novos valores e remover uma única ocorrência de um elemento.

Com a ampliação do projeto, novas funcionalidades foram implementadas para tornar a manipulação das listas mais completa e permitir comparações mais interessantes entre as duas estruturas.

Além disso, foi introduzida a interface `ListaOperacoes`, que passou a definir um padrão obrigatório de métodos para as duas classes. Essa mudança permitiu organizar melhor o projeto e garantir que ambas as estruturas ofereçam exatamente o mesmo conjunto de operações.

Outro ponto importante foi a melhoria no tratamento de comparações entre textos. As comparações passaram a ignorar diferenças entre letras maiúsculas e minúsculas, permitindo que as operações funcionem corretamente independentemente da forma como o usuário digita os elementos.

---
