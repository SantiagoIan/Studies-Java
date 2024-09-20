package maratonaJava.devDojo.introducao.arrays;

public class Aula05Arrays02 {
    public static void main(String[] args) {
        //Tipos primitivos & Tipos Reference
        // byte, short, int, ling, float e double = 0
        // char = '\u0000'
        // boolean = false
        // String = null

        String[] nomes = new String[3];
        nomes[0] = "ZObomafu"; // Valor dentro do arrays; Sempre comecando por 0,1,2,3...
        nomes[1] = "Hitlher";
        nomes[2] = "Raulzito";

        for (int i = 0; i < nomes.length; i++) { // muda como o tamanho do arrays
            System.out.println(nomes[i]);

        }
    }
}
