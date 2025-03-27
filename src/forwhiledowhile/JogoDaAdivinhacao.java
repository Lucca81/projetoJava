package forwhiledowhile;

import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero =(int) (Math.random() * 100) + 1;
        int resposta = 0;

        while (resposta != numero){
            System.out.println("Escolha um número aleatório entre 1 e 100: ");
            resposta = scanner.nextInt();
            scanner.nextLine();

                    if (resposta < numero) {
                        System.out.println("Tente um número maior! ");

                    } else if (resposta > numero) {
                        System.out.println("Tente um numero menor");


                    }else {
                        System.out.println("Certa resposta");
                    }



        }
        scanner.close();
    }
}
