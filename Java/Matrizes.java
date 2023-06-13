// Matrizes

public class Matrizes {
    public static void main(String[] args) {
        // retornando o valor do array no índice selecionado
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        // alterando elemento de um array
        cars[0] = "Opel";
        System.out.println(cars[0]);

        // comprimento do array
        System.out.println(cars.length);
        
        // percorrendo os elementos do array com o loop for e retornando o comprimento usando .length
        String[] marks = {"VW", "Fiat", "Jeep", "Peugeot"};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("");
        // gerando elementos do array usando for-each
        for (String j : marks) {
            System.out.println(j);
        }
        System.out.println("");

        // Matrizes Multidimensionais
        /* Arrays multidimensionais são úteis quando você deseja armazenar dados em formato tabular, como uma
        tabela com linhas e colunas.

        Para criar um array bidimensional, adicione cada array dentro de seu próprio conjunto de chaves
         */
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

        /* para retornar os elementos de um array multidimensional, especifique dois índices: um para a matriz
        ou para o elemento dentro da matriz.
        */
        System.out.println(myNumbers[1][2]);
        System.out.println("");

        // alterando valores dos arrays
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);   
    }
}
