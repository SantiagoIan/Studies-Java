import java.util.Random;
import java.util.Scanner;

public class Numerosecreto {  
    public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);
    Random numAleatorio = new Random();
    
    int numeroSecreto = 0;

    numeroSecreto = numAleatorio.nextInt(31);

    System.out.println(numAleatorio);
    boolean resposta = true;
    
    while (resposta) {
        System.out.print("\nDigite um número entre 1 e 30: ");
        int numEscolhido = dados.nextInt();

        if (numEscolhido < 1 || numEscolhido > 30) {
            System.out.println("O número deve estar entre 1 e 30. Por favor, tente novamente.");
        } else if (numeroSecreto != numEscolhido) {
            System.out.println("Você errou! Tente novamente.");
        } else {
            System.out.println("Parabéns, você acertou!");
            resposta = false;
        }
    }
    
    }  
}
