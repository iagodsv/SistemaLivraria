# 📚 Sistema de Livraria

Bem-vindo ao **Sistema de Livraria**! Este projeto em **Java** simula o gerenciamento de uma biblioteca, permitindo o cadastro de livros, autores, usuários e a realização de empréstimos.

## ✨ Funcionalidades

✅ Cadastro de livros e autores\
✅ Listagem de livros disponíveis\
✅ Cadastro de usuários\
✅ Empréstimo de livros para usuários\
✅ Registro do histórico de empréstimos de cada usuário\
✅ Bloqueio de empréstimos para usuários inadimplentes

---

## 🚀 Tecnologias Utilizadas

- **Java** - Linguagem principal do projeto
- **Paradigma Orientado a Objetos (POO)**
- **Coleções (List, ArrayList)**

---

## 📌 Como Rodar o Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/SistemaLivraria.git
   ```
2. Abra o projeto em sua IDE preferida (IntelliJ IDEA, Eclipse, VS Code com extensão Java etc.)
3. Compile e execute a classe principal (`Main.java`).

---

## 🛠 Estrutura do Projeto

📁 **src/**\
├── 📂 **model/** (Classes do domínio do projeto)\
│   ├── `Livro.java` 📖\
│   ├── `Autor.java` ✍️\
│   ├── `Usuario.java` 👤\
│   ├── `GerenciamentoLivros.java` 🔄\
├── 📂 **service/** (Regras de negócio)\
│   ├── `Biblioteca.java` 🏛️\
├── 📂 **main/** (Ponto de entrada do programa)\
│   ├── `Main.java` 🚀

---

## 🎯 Exemplos de Uso

### 📖 Cadastrar um Livro

```java
Biblioteca biblioteca = new Biblioteca();
Autor autor = new Autor("J.K. Rowling");
Livro livro = new Livro("Harry Potter e a Pedra Filosofal", autor);
biblioteca.adicionarLivro(livro, autor);
```

### 🔄 Realizar um Empréstimo

```java
Usuario usuario = new Usuario("João Silva", "joao@email.com");
biblioteca.adicionarUsuario(usuario.getNome(), usuario.getEmail());
biblioteca.realizarEmprestimo(usuario, "Harry Potter e a Pedra Filosofal");
```


---

Feito com ❤️ por [Iago Duarte](https://github.com/iagodsv) 🚀

