package JavaPOO;


/*
 * Java POO - Obejtos
 * Em Java, um objeto é criado a partir de uma classe. Já criamos a classe chamada Objeto, agora podemos usá-la para criar objetos.

 * Para criar um objeto de Objeto, especifique o nome da classe, seguido do nome do objeto e use a palavra-chave new:
 * 
 * Objetos Mútiplos
 * Você pode criar vários objetos de uma classe:
 * 
 * Modificando Objetos
 * Altere o valor de x para 25 em myObj2 e deixe o myObj1 inalterado.
 * 
 * Atributos Múltiplos
 * Podemos especificar quantos atributos quiser-mos.
 * 
 * Final
 * Se você não deseja substituir os valores de atributo existentes, declare os atributos como final:
 */

public class Objeto {
    //final int x = 11;
    //final 
    int x = 11;
    double PI = 3.14;

    public static void main(String[] args) {
        Objeto myObj = new Objeto();
        myObj.x = 50; // Será gerado um 'erro' não é possível atribuir um valor á variável 'final'
        myObj.PI = 25;
        System.out.println(myObj.PI);
    }
}