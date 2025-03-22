
import java.util.Scanner;
    public class CategoriaDeAtleta {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

                if (idade < 5) {
                    System.out.println("Idade inválida para competição.");
                } else if (idade <= 10) {
                    System.out.println("Categoria: Infantil");
                } else if (idade <= 15) {
                    System.out.println("Categoria: Juvenil");
                } else if (idade <= 19) {
                    System.out.println("Categoria: Júnior");
                } else if (idade <= 40) {
                    System.out.println("Categoria: Adulto");
                } else {
                    System.out.println("Categoria: Master");


            scanner.close();
            }

        }
    }

