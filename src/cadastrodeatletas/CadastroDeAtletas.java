package cadastrodeatletas;

import java.util.Scanner;


public class CadastroDeAtletas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 10;
        String[] atletas = new String[NUMERO_MAX];

        int atletasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("===== Menu atleta =====");
            System.out.println("1. Cadastrar atleta");
            System.out.println("2. Listar atletas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (atletasCadastrados < NUMERO_MAX) {
                        System.out.print("Digite o seu nome para cadastro: ");
                        String nomeAtleta = scanner.nextLine();

                        System.out.print("Digite a sua idade para cadastro: ");
                        int idadeAtleta = scanner.nextInt();
                        scanner.nextLine();

                        CategoriaAtleta categoriaDoAtleta = definirCategoria(idadeAtleta);

                        atletas[atletasCadastrados] = "Nome: " + nomeAtleta +
                                                        " | Idade: " + idadeAtleta +
                                                            " | Categoria: " + categoriaDoAtleta;
                        atletasCadastrados++;

                        System.out.println("Atleta cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista de atletas está cheia, impossível cadastrar um novo usuário.");
                    }
                    break;

                case 2:
                    if (atletasCadastrados == 0) {
                        System.out.println("Nenhum atleta encontrado.");
                    } else {
                        System.out.println("============ Lista de Atletas ============");
                        for (int i = 0; i < atletasCadastrados; i++) {
                            System.out.println(atletas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa... Aguarde.");
                    break;

                default:
                    System.out.println("Essa opção não é válida.");
                    break;
            }
        }
        scanner.close();
    }

    private static CategoriaAtleta definirCategoria(int idade) {
        if (idade <= 10) {
            return CategoriaAtleta.INFANTIL;
        } else if (idade <= 15) {
            return CategoriaAtleta.JUVENIL;
        } else if (idade <= 19) {
            return CategoriaAtleta.JUNIOR;
        } else if (idade <= 40) {
            return CategoriaAtleta.ADULTO;
        } else {
            return CategoriaAtleta.MASTER;
        }
    }
}
