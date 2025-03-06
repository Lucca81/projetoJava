import java.util.Scanner;

public class ExercicioDadosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade, tempoIdade;
        double altura, alturaCalculada;

        //Solicitando o nome do usuário
        System.out.println("Qual o seu nome?");
        nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();

        System.out.println("Qual a sua altura");
        altura = scanner.nextDouble();


        System.out.print("Olá, " + nome + "! ");


        tempoIdade = 50 - idade;
        System.out.println("Em " + tempoIdade + " anos você terá 50 anos.");


        alturaCalculada = altura * 100;
        System.out.println("Sua altura em cm é: " + alturaCalculada + " cm");

        scanner.close();
    }
}
