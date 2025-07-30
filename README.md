# 📦 Projeto: Cadastro de Produto (Java)

Este projeto simula o **cadastro de um produto** e a manipulação do seu **estoque**, utilizando a linguagem **Java**. O foco está na prática dos principais conceitos de Programação Orientada a Objetos (POO).

---

## 🧠 Conceitos Trabalhados

- ✅ Criação de classes e objetos (`Produto`)
- ✅ Construtores com e sem parâmetros
- ✅ Sobrecarga de construtores
- ✅ Entrada de dados com `Scanner`
- ✅ Encapsulamento
- ✅ Atualização de estoque (adicionar e remover)
- ✅ Boas práticas de POO

---

## 🧾 Estrutura do Projeto

### 📁 Classe `Produto`
Contém os seguintes atributos:
- `codigo` (int)
- `nome` (String)
- `quantidade` (int)
- `preco` (double)

Inclui:
- Construtores (com e sem parâmetros)
- Métodos `adicionarEstoque(int)` e `removerEstoque(int)`
- Método `toString()` para exibir os dados do produto formatados

### 💻 Classe `ProgramProduto`
Responsável por:
- Capturar os dados do usuário via `Scanner`
- Criar instâncias de `Produto`
- Manipular o estoque chamando os métodos da classe `Produto`
- Exibir o produto atualizado após cada operação

---

## 🚀 Funcionalidades

- 📌 Cadastrar produto com ou sem preço e quantidade inicial
- ➕ Adicionar itens ao estoque
- ➖ Remover itens do estoque
- 📋 Exibir informações atualizadas do produto após cada operação

---

## 🛠️ Tecnologias Utilizadas

- Linguagem: Java
- IDE: Eclipse
- Paradigma: Programação Orientada a Objetos (POO)
