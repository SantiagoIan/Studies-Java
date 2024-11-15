import java.util.Scanner;

public class VerificacaoString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Descubra quantos 'A' tem na sua palavra: ");
        String Palavra = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < Palavra.length(); i++) {
            char caractere = Palavra.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra (a) apareceu " + contador + " vezes.");
        } else {
            System.out.println("Não foi possivel encontrar a letra (a) na palavra.");
        }

        scanner.close();
    }
}



