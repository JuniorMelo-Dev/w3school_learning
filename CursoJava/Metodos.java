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
*/ 

public class Metodos {
    static void myMethod(String fname) {
        System.out.println(fname + " Melo");
    }

    public static void main(String[] args) {
        myMethod("Junior");
        myMethod("Luana");
        myMethod("Bernardo");
    } 
}