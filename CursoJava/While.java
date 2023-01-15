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
    }
}
