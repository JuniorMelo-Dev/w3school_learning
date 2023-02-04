package javapoo;

/*
 * Construtores Java
 * Um construtor em Java é um 'método especial' usado para inicializar objetos. O construtor é chamado quando um 
 * objeto de uma classe é criado. Ele pode ser usado para definir valores iniciais para atributos de objeto:
 * 
 * Parâmetros do Construtor
 * Os construtores também podem receber parâmetros, que são usados ​​para inicializar atributos.
 */

public class Construtor {
    int modelYear;
    String modelName;

    public Construtor(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Construtor myCar = new Construtor(1969, "Mustang");
        System.out.println(myCar.modelName + " " + myCar.modelYear);
    }
}
