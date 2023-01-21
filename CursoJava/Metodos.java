/* 
 * Metodos em Java
 * Um método é um bloco de código que só é executado quando é chamado.
 * Você pode passar dados, conhecidos como parâmetros, para um método.
 * Os métodos são usados ​​para executar determinadas ações e também são conhecidos como funções .
 * Por que usar métodos? Para reutilizar o código: onde definimos o código uma vez e usamos várias vezes.
*/ 



public class Metodos {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
    } 
}