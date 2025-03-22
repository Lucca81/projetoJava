import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma nota (0 a 10): ");
            int nota = scanner.nextInt();

            switch (nota) {
                case 10:
                case 9:
                    System.out.println("Excelente");
                    break;
                case 8:
                case 7:
                    System.out.println("Bom");
                    break;
                case 6:
                case 5:
                    System.out.println("Regular");
                    break;
                default:
                    if (nota >= 0 && nota < 5) {
                        System.out.println("Reprovado");
                    } else {
                        System.out.println("Nota inválida");
                    }
            }

            scanner.close();

    }
}
