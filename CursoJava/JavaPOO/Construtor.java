package JavaPOO;

/*
 * Construtores Java
 * Um construtor em Java é um 'método especial' usado para inicializar objetos. O construtor é chamado quando um 
 * objeto de uma classe é criado. Ele pode ser usado para definir valores iniciais para atributos de objeto:
 */

public class Construtor {
    int x;

    //Criando o construtor para a classe Principal
    public Construtor() {
        x = 6; //setando o valor inicial para o atributo da classe
    }

    public static void main(String[] args) {
        Construtor myObj = new Construtor(); //Criando um objeto pra classe principal (Isto chamará o construtor)
        System.out.println(myObj.x); //Retornando o valor de x
    }

    /*
     * Observe que o nome do construtor deve corresponder ao nome da classe e não pode ter um tipo de retorno   
     * (como void).
     * Observe também que o construtor é chamado quando o objeto é criado.
     * Todas as classes têm construtores por padrão: se você não criar um construtor de classe, o Java o criará
     * para você. No entanto, você não poderá definir valores iniciais para atributos de objeto.
     */
}
