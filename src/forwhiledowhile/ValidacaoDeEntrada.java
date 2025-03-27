package forwhiledowhile;

import java.util.Scanner;

public class ValidacaoDeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        do {
            System.out.println("Insira uma senha: ");
            senha = scanner.nextLine();
        }while (!senha.equals("java21"));
        System.out.println("Acesso permitido");




        scanner.close();
    }
}
