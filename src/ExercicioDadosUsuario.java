import java.util.Scanner;

public class ExercicioDadosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double altura;


        System.out.print("Qual o seu nome? ");
        nome = scanner.nextLine().trim();


        System.out.print("Qual a sua idade? ");
        idade = scanner.nextInt();
        scanner.nextLine();

        // Solicitação da altura
        System.out.print("Qual a sua altura (em metros)? ");
        altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nOlá, " + nome + "!");


        if (idade < 50) {
            int tempoIdade = 50 - idade;
            System.out.println("Em " + tempoIdade + " anos, você terá 50 anos.");
        } else {
            System.out.println("Você já tem 50 anos ou mais!");
        }


        double alturaCalculada = altura * 100;
        System.out.println("Sua altura em centímetros é: " + alturaCalculada + " cm.");

        scanner.close();
    }
}
