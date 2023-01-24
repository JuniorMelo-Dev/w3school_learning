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
 */

public class Objeto {
    String fname = "Junior";
    String lname = "Melo";
    int age = 33;

    public static void main(String[] args){
        Objeto myObj = new Objeto();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}