# 📚 Pilha e Fila com Lista Encadeada

Este trabalho em Java simula um sistema de **atendimento ao cliente**, utilizando estruturas de **pilha** e **fila**, implementadas manualmente com **lista encadeada**.

## 🔧 Estrutura do Trabalho

O trabalho está dividido em duas partes principais:

---

## 🗂️ Parte 1: Histórico de Solicitações (Pilha)

A **pilha** representa um histórico das solicitações feitas. Segue o modelo LIFO (Last In, First Out).

### 📁 Classe `Pilha.java`
- Implementa uma pilha usando uma lista encadeada com a classe `No`.
- Possui métodos:
    - `insere(Elemento e)`: insere uma nova solicitação no topo da pilha.
    - `remove()`: remove e retorna a solicitação do topo.
    - `vazia()`: verifica se a pilha está vazia.
    - `imprime()`: imprime o conteúdo da pilha.
    - `preencherPilha()`: insere 10 solicitações simuladas.

### 📁 Classe `Historico.java`
- Representa uma solicitação feita pelo cliente.
- Armazena:
    - ID da solicitação
    - Descrição
    - Data e hora

---

## 🧾 Parte 2: Ordem de Atendimento (Fila)

A **fila** simula a ordem de atendimento dos clientes, seguindo o modelo FIFO (First In, First Out).

### 📁 Classe `Fila.java`
- Implementa uma fila usando uma lista encadeada com a classe `No`.
- Possui métodos:
    - `adicionarCliente(Elemento e)`: adiciona cliente ao final da fila.
    - `atenderCliente()`: remove o primeiro cliente da fila.
    - `vazia()`: verifica se a fila está vazia.
    - `imprimir()`: mostra a fila completa.
    - `preencherFila()`: adiciona 10 atendimentos simulados.

### 📁 Classe `Atendimento.java`
- Representa um atendimento agendado para um cliente.
- Armazena:
    - ID do atendimento
    - Nome do cliente
    - Motivo do atendimento

---

## 🔗 Classes Auxiliares

### 📁 Classe `No.java`
- Representa o nó da lista encadeada.
- Armazena um `Elemento` e a referência para o próximo nó.

### 📁 Classe `Elemento.java`
- Classe abstrata usada como base para `Historico` e `Atendimento`.

---

## 🚀 Execução

A classe principal `Main.java` realiza as seguintes ações:

1. Preenche e imprime o histórico de solicitações (pilha).
2. Remove uma solicitação e mostra a pilha atualizada.
3. Adiciona uma nova solicitação.
4. Preenche a fila de atendimentos com clientes.
5. Atende sete clientes e mostra a fila atualizada.
6. Adiciona mais dois clientes e mostra a nova fila.

---

## ✅ Requisitos Atendidos

- [x] Pilha com lista encadeada.
- [x] Elementos com ID, descrição, data e hora.
- [x] Métodos para adicionar, remover e verificar se a pilha está vazia.
- [x] Fila com lista encadeada.
- [x] Elementos com nome, identificação e motivo.
- [x] Métodos para adicionar, atender e verificar se a fila está vazia.

---

## ▶️ Como Rodar o Programa

### ✅ Pré-requisitos
- Ter o **Java JDK** instalado (versão 8 ou superior)
- Ter uma IDE como **IntelliJ IDEA**, **Eclipse**, ou utilizar o terminal

### 💻 Executando pelo terminal:
1. Acesse a pasta do projeto:
   ```bash
   cd caminho/para/seu/projeto
   ```
   
2. Entre na pasta `src`:
    ```bash
    cd src
    ```
   
3. Compile todos os arquivos:
   * No __CMD__ (prompt de comando):
    ```bash
    javac *.java
    ```
    * No __PowerShell__ :
    ```bash
    javac (Get-ChildItem *.java).Name
    ```
4. Execute a aplicação:
    ```bash
    java Main
    ```