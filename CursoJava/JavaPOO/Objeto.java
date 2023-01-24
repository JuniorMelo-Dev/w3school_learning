package JavaPOO;


/*
 * Java POO - Obejtos
 * Em Java, um objeto é criado a partir de uma classe. Já criamos a classe chamada Objeto, agora podemos usá-la para criar objetos.

 * Para criar um objeto de Objeto, especifique o nome da classe, seguido do nome do objeto e use a palavra-chave new:
 * 
 */

public class Objeto {
    int x = 5;

    public static void main(String[] args){
        Objeto myObj = new Objeto();
        System.out.println(myObj.x);
    }
}