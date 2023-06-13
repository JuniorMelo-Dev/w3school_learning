/* Loop For
 * Quando você souber exatamente quantas vezes deseja percorrer um bloco de código, use o for em vez de um while:
 */

public class For {
    public static void main(String[] args) {
        // imprimindo valores de 0 a 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("");
        // imprimindo valores de 0 a 10 de 2 em 2
        for (int j = 0; j <= 10; j = j + 2) {
            System.out.println(j);
        }
        System.out.println("");
        // for aninhado
        // loop outer
        for (int k = 1; k <= 2; k++) {
            System.out.println("Outer: " + k);

            // loop inner
            for (int l = 1; l <= 3; l++) {
                System.out.println(" Inner: " + l);
            }
        }

        // For-each
        // loop "for-each" é usado exclusivamente para percorrer os elementos em uma matriz
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String m : cars) {
            System.out.println(m);
        }

        // break para sair do loop for
        // interrompe o loop quando for == 4
        for (int n = 0; n < 10; n++) {
            if (n == 4){
                break;
            }
            System.out.println(n);
        }

        // continue para pula pra próxima iteração no loop
        // ignora o valor 4
        for (int o = 0; o < 10; o++) {
            if (o == 4) {
                continue;
            }
            System.out.println(o);
        }
    }
}
