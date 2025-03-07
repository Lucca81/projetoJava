import java.util.Scanner;

public class VerificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;


        while (true) {
            System.out.println("Coloque seu nome: ");
            nome = scanner.nextLine().trim();
            if (nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+") && !nome.isEmpty()) {
                break;
            } else {
                System.out.println("Nome inválido! Digite apenas letras.");
            }
        }
        System.out.println("Nome aceito: " + nome);


        while (true) {
            System.out.print("Coloque sua idade: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.matches("\\d{1,2}")) {
                idade = Integer.parseInt(entrada);
                break;
            } else {
                System.out.println("Entrada inválida! Digite apenas números de no MAXIMO 2 digitos.");
            }
        }


        System.out.print("Você tem carteira de motorista? (sim/não): ");
        String resposta = scanner.nextLine().trim().toLowerCase();

        boolean temCnh = resposta.equals("sim");

        scanner.close();

        // Verificação final
        if (idade >= 18 && temCnh) {
            System.out.println(nome + ", você pode dirigir.");
        } else if (!temCnh) {
            System.out.println(nome + ", você não pode dirigir porque não tem CNH.");
        } else {
            System.out.println(nome + ", você não pode dirigir porque é menor de idade.");
        }
    }
}
