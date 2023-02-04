package javapoo;

/*
 * Métodos de Acesso com um Objeto
 * Ex: Crie um objeto Carro chamado 'myCar'. Chame os métodos fullThrottle() e no objeto execute o 
 * programa: speed() myCar
 */

public class Main2 {
    //Criando o método aceleraçãoTotal()
    public void fullThrottle() {
        System.out.println("Ocarro está indo o mais rápido que pode!");
    }

    //Criando o método velocidade() e adicionando um parâmetro
    public void speed(int maxSpeed, String string) {
        System.out.println("Velocidade máxima é: " + maxSpeed + string);
    }

    /**
     * Dentro de Main2, chame os métodos no objeto myCar
     * @param args
     */
    
    public static void main(String[] args) {
        final Main2 myCar = new Main2();
        myCar.fullThrottle();
        myCar.speed(200, "Km");
    }
}
