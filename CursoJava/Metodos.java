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
*/ 

public class Metodos {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z  = myMethod(5,3);
        System.out.println(z);
    } 
}