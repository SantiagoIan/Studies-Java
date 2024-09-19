package maratonajava.devdojo.introducao.EstruturasDeRepeticao;

// Imprimir os 25 primeiros números de um determinado valor.

public class Aula04EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int number = 50;

        for (int i = 0; i <= number; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }

    }
}

