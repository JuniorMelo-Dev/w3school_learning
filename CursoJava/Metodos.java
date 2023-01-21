/* 
 * Metodos em Java
 * 
 * Ex: 1 (MÉTODOS)
 * Um método é um bloco de código que só é executado quando é chamado.
 * Você pode passar dados, conhecidos como parâmetros, para um método.
 * Os métodos são usados ​​para executar determinadas ações e também são conhecidos como funções .
 * Por que usar métodos? Para reutilizar o código: onde definimos o código uma vez e usamos várias vezes.
 * 
 * Ex: 2 (MÉTODOS E PARÂMETROS)
 * As informações podem ser passadas para métodos como parâmetro. Os parâmetros atuam como variáveis ​​dentro do método.
 * Os parâmetros são especificados após o nome do método, entre parênteses. Você pode adicionar quantos parâmetros quiser, 
 * basta separá-los com uma vírgula.
 * 
 * Ex: 3 (RETORNANDO VALORES)
 * A voidpalavra-chave, utilizada nos exemplos acima, indica que o método não deve retornar um valor. Se você deseja que o 
 * método retorne um valor, pode usar um tipo de dado primitivo (como int, char, etc.) em vez de void, e usar a palavra- 
 * chave 'return' dentro do método.
 * 
 * Ex: 4 (MÉTODOS COM IF...ELSE)
 * Criando método checkAge() usando if..else e uma variável idade, para verificar o acesso.
 * 
 * Ex: 5 (SOBRECARGA DE MÉTODO)
 * Com sobrecarga de método, vários métodos podem ter o mesmo nome com parâmetros diferentes
 * Considere o exemplo a seguir, que possui dois métodos que adicionam números de tipos diferentes:
*/ 

public class Metodos {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    } 
}