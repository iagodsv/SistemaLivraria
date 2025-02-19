import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<GerenciamentoLivros> emprestimos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<GerenciamentoLivros> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<GerenciamentoLivros> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void adicionarLivro(Livro livro, Autor autor) {
        livro.setAutor(autor);
        livros.add(livro);
        System.out.println("📚 Livro '" + livro.getTitulo() + "' adicionado com sucesso!");
    }

    public void listarLivrosDisponiveis() {
        if (livros.isEmpty()) {
            System.out.println("🚫 Nenhum livro cadastrado.");
            return;
        }

        boolean encontrouDisponivel = false;
        System.out.println("📖 Lista de livros disponíveis:");

        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println("   ✅ " + livro.getTitulo() + " - Autor: " + livro.getAutor().getNome());
                encontrouDisponivel = true;
            }
        }

        if (!encontrouDisponivel) {
            System.out.println("❌ Nenhum livro disponível!");
        }
    }

    public void realizarEmprestimo(Usuario usuario, String tituloLivro) {
        if (!usuario.isAdimplente()) {
            System.out.println("🚫 Usuário inadimplente. Empréstimo não permitido.");
            return;
        }

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro) && livro.isDisponivel()) {
                livro.setDisponivel(false);
                usuario.adicionarHistorico(livro);
                System.out.println("📕 Empréstimo realizado com sucesso! Livro: " + livro.getTitulo() + " para " + usuario.getNome());
                return;
            }
        }

        System.out.println("❌ Livro não encontrado ou indisponível.");
    }

    public void adicionarUsuario(String nome, String email) {
        Usuario novoUsuario = new Usuario(nome, email);
        usuarios.add(novoUsuario);
        System.out.println("👤✅ Usuário " + nome + " cadastrado com sucesso!");
    }

    public void verificaHistorico() {
        if (usuarios.isEmpty()) {
            System.out.println("🚫 Nenhum usuário cadastrado.");
            return;
        }

        for (Usuario users : usuarios) {
            System.out.println("\n📌 Nome: " + users.getNome() + " - Histórico de empréstimos:");
            List<Livro> historico = users.getHistoricoEmprestimos();

            if (historico.isEmpty()) {
                System.out.println("   ❌ Nenhum livro emprestado.");
            } else {
                for (Livro livro : historico) {
                    System.out.println("   📖 Livro: " + livro.getTitulo() + " | Autor: " + livro.getAutor().getNome());
                }
            }
        }
    }
}