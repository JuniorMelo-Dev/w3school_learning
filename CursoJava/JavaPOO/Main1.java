package JavaPOO;

/*
 * Usando várias classes
 * Você também pode criar um objeto de uma classe e acessá-lo em outra classe. Isso geralmente é usado para melhor organização das classes (uma classe possui todos os atributos e métodos, enquanto a outra classe contém o método main() -> (código a ser executado)).

 * Lembre-se de que o nome do arquivo java deve corresponder ao nome da classe. Neste exemplo, criamos dois arquivos no mesmo diretório/pasta:

 Main.java
 Second.java
 */

public class Main1 {
    public void fullThrottle() {
        System.out.println("O carro está indo o mais rápido que pode!");
    }

    public void speed(int maxSpeed, String string) {
        System.out.println("Velocidade máxima é: " + maxSpeed + string);
    }
}
