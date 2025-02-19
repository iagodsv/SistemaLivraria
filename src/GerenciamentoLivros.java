import java.util.Scanner;

public class GerenciamentoLivros {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setDisponivel(false);

        Biblioteca biblioteca = new Biblioteca();
        Scanner menu = new Scanner(System.in);

        Usuario user1 = new Usuario("Carlos", "carlos@email.com");
        Livro livro2 = new Livro("O Senhor dos Anéis", new Autor("J.R.R. Tolkien"));

        while (true) {

            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|----------------------------------------------|\n");
            System.out.print("| Opção 1 - Adicionar um novo livro            |\n");
            System.out.print("| Opção 2 - Listar todos os livros disponíveis |\n");
            System.out.print("| Opção 3 - Realizar empréstimo de um livro    |\n");
            System.out.print("| Opção 4 - Adicionar Usuário                  |\n");
            System.out.print("| Opção 5 - Buscar histórico do Usuário        |\n");
            System.out.print("| Opção 6 - Sair                               |\n");
            System.out.print("|----------------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 6) {
                System.out.print("\nAté logo!");
                menu.close();
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nOpção 'Adicionar um novo livro' Selecionado");
                    System.out.println();
                    menu.nextLine();
                    System.out.println("Digite o título do livro:");
                    String titulo = menu.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = menu.nextLine();

                    Autor autorClass = new Autor(autor);
                    Livro livro1 = new Livro(titulo, autorClass);
                    biblioteca.adicionarLivro(livro1, autorClass);
                    System.out.println("Livro adicionado com sucesso!");

                    break;

                case 2:
                    System.out.print("\nOpção 'Listar todos os livros disponíveis' Selecionado\n");

                    System.out.println();

                    biblioteca.listarLivrosDisponiveis();


            break;

                case 3:
                    System.out.print("\nOpção 'Realizar empréstimo de um livro' Selecionado\n");
                    System.out.println();
                    biblioteca.listarLivrosDisponiveis();

                    menu.nextLine();
                    System.out.println("Informe seu nome: ");
                    String user = menu.nextLine();
                    System.out.println("Informe seu e-mail: ");
                    String email = menu.nextLine();

                    Usuario usuario = new Usuario(user, email); // Criar usuário
                    System.out.println("Qual livro gostaria de pegar?");
                    String livroEmprestimo = menu.nextLine();

                    biblioteca.realizarEmprestimo(usuario, livroEmprestimo);
                    break;

                case 4:
                    System.out.print("\nOpção 'Adicionar Usuário' Selecionado\n");

                    menu.nextLine();

                    System.out.print("Digite o nome do usuário: ");
                    String nome = menu.nextLine();

                    System.out.print("Digite o e-mail do usuário: ");
                    String emails = menu.nextLine();

                    biblioteca.adicionarUsuario(nome, emails);


                    break;
                case 5:
                    System.out.print("\nOpção 'Buscar histórico do Usuário' Selecionado\n");

                biblioteca.verificaHistorico();

                default:
                System.out.print("\nOpção Inválida!");
                break;
        }
    }


}
}
