import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("SALAZAR");

        Livro[] livrosNaBiblioteca = new Livro[10];
        livrosNaBiblioteca[0] = new Livro("Harry Potter", 0, biblioteca, TipoLivro.FANTASIA);
        livrosNaBiblioteca[1] = new Livro("Blade Runner", 1, biblioteca, TipoLivro.FICCAO_CIENTIFICA);

        int mani = 2;
        TipoLivro tipoLivro = TipoLivro.FANTASIA;

        System.out.println("------------------------------");
        System.out.println("BEM VINDO A BIBLIOTECA " + biblioteca.getNome());
        System.out.println("------------------------------");

        while (mani != 4) {

            System.out.println("O Que Deseja Fazer?");
            System.out.println();
            System.out.println("[1] Adcionar Livro");
            System.out.println("[2] Remover Livro");
            System.out.println("[3] Listar Livros");
            System.out.println("[4] Sair");

            int opção = sc.nextInt();

            if (opção == 1) {
                for (int i = 2; i <= livrosNaBiblioteca.length; i++) {
                    System.out.println("Digite O Nome Do Livro:");

                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.println("Escolha O Tipo Do Livro:");

                    System.out.println("[1] ROMANCE "); System.out.println("[2] FANTASIA ");System.out.println("[3] FICCAO_CIENTIFICA ");System.out.println("[4] SUSPENSE ");System.out.println("[5] THRILLER ");System.out.println("[6] TERROR ");System.out.println("[7] AVENTURA ");System.out.println("[8] CONTOS ");System.out.println("[9] HQ ");

                    int opçãoTipo = sc.nextInt();
                    sc.nextLine();
                    switch (opçãoTipo) {
                        case 1:
                            tipoLivro = TipoLivro.ROMANCE;
                            break;
                        case 2:
                            tipoLivro = TipoLivro.FANTASIA;
                            break;
                        case 3:
                            tipoLivro = TipoLivro.FICCAO_CIENTIFICA;
                            break;
                        case 4:
                            tipoLivro = TipoLivro.SUSPENSE;
                            break;
                        case 5:
                            tipoLivro = TipoLivro.THRILLER;
                            break;
                        case 6:
                            tipoLivro = TipoLivro.TERROR;
                            break;
                        case 7:
                            tipoLivro = TipoLivro.AVENTURA;
                            break;
                        case 8:
                            tipoLivro = TipoLivro.CONTOS;
                            break;
                        case 9:
                            tipoLivro = TipoLivro.HQ;
                            break;
                    }


                    livrosNaBiblioteca[i] = new Livro(nome, i, biblioteca, tipoLivro);

                    System.out.println("Livro Adcionado!");
                    System.out.println("Deseja Adcionar Mais Um?");
                    System.out.println("[1] Sim");
                    System.out.println("[2] Não");

                    int op = sc.nextInt();
                    if (op == 1) {
                        continue;
                    }
                    if (op == 2) {
                        break;
                    }

                }
            }

            if (opção == 2) {
                System.out.println("Digite o índice do livro que deseja remover:");
                int indice = sc.nextInt();

                if (indice >= 0 && indice < livrosNaBiblioteca.length) {
                    if (livrosNaBiblioteca[indice] != null) {
                        livrosNaBiblioteca[indice] = null;
                        System.out.println("Livro removido!");
                    } else {
                        System.out.println("Não existe livro nessa posição.");
                    }
                } else {
                    System.out.println("Índice inválido.");
                }
            }

            if (opção == 3) {
                for (Livro livros : livrosNaBiblioteca) {
                    if (livros != null) {
                        System.out.println("---------");
                        livros.imprime();
                    }
                }
                System.out.println("-----------------------------------");
                System.out.println("Quantidade De Livros Na Biblioteca: " +Livro.getContadorLivros());
                System.out.println("-----------------------------------");
            }

            if (opção == 4) {
                mani = 4;
            }

        }
    }
}
