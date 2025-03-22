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
            System.out.println("2. Listar atleta");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (atletasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o seu nome para cadastro: ");
                        String nomeAtleta = scanner.nextLine();
                        System.out.println("Digite o sua idade para cadastro: ");
                        int idadeAtleta = scanner.nextInt();
                        scanner.nextLine();

                        CategoriaAtleta categoriaAtleta = categoriaValida(scanner);


                        atletas[atletasCadastrados] = "Nome: " + nomeAtleta +
                                                        " | Idade: " + idadeAtleta +
                                                            " | Categoria: " + categoriaAtleta;


                        atletasCadastrados++;
                        System.out.println("Atleta cadastrado com sucesso");

                    } else {
                        System.out.println("A lista de atletas esta cheia, impossivel cadastrar um novo usuario");
                    }
                    break;

                case 2:
                    if (atletasCadastrados == 0) {
                        System.out.println("Nenhum atleta encontrado");
                    } else {
                        System.out.println("============ Lista de Atleta ============");
                        for (int i = 0; i < atletas.length ; i++) {
                            System.out.println(atletas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos saindo o programa...Aguarde");
                    break;

                default:
                    System.out.println("Essa opcao nao é valida.");
                    break;
            }

        }

    }
    private static CategoriaAtleta categoriaValida(Scanner scanner) {
        while (true) {
            System.out.print("Digite a sua categoria para cadastro (INFANTIL, JUVENIL, ADULTO, MASTER): ");
            String categoriaInput = scanner.nextLine().toUpperCase();

            try {
                return CategoriaAtleta.valueOf(categoriaInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Categoria inválida! Escolha entre INFANTIL, JUVENIL, ADULTO ou MASTER.");
            }
        }
    }
}
