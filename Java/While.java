/* While
 Loop While executam um bloco de código desde que uma condição seja atingida.
*/

public class While {
    public static void main(String[] args) {
        // loop executado repetidamente, desde que a variável (i) seja menor de (5)
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("");
        /* Do..While
        O Loop Do/While é uma variante do While. Este loop executará o bloco de código uma vez,
        antes de verificar se a condição é verdadeira, então repetirá o loop enquanto a condição for 
        verdadeira.
        */

        /* loop executado pelo menos uma vez, mesmo que a condição seja falsa, pois o bloco de código é
         executado antes da condição ser testada:
        */
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);
        System.out.println("");
        // break em loops While
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
            if (k == 4) {
                break;
            }
        }
        System.out.println("");
        // continue em loops while
        int l = 0;
        while (l < 10) {
            if (l == 4) {
                l++;
                continue;
            }
            System.out.println(l);
            l++;
        }
    }
}
