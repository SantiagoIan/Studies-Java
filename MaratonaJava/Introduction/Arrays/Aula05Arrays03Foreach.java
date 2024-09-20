package maratonaJava.devDojo.introducao.arrays;

public class Aula05Arrays03Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        int[] numeros2 = {1, 2, 3, 4, 5};

        /* for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        } */


        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
