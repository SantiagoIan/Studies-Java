package maratonajava.devdojo.introducao.EstruturasCondicionais;
import java.util.Scanner;

public class Aula03EstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

    }
}
