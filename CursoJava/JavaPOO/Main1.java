package JavaPOO;

/*
 * Usando várias classes
 * Você também pode criar um objeto de uma classe e acessá-lo em outra classe. Isso geralmente é usado para melhor organização das classes (uma classe possui todos os atributos e métodos, enquanto a outra classe contém o método main() -> (código a ser executado)).

 * Lembre-se de que o nome do arquivo java deve corresponder ao nome da classe. Neste exemplo, criamos dois arquivos no mesmo diretório/pasta:
 * 
 * Abstract (Resumo)
 * Um método 'abstract' pertence a uma classe abstract e não possui corpo, pois é fornecido ple subclasse

 Main.java
 Second.java
 */

abstract class Main1 {
    public String fname = "Junior";
    public int age = 33;
    public abstract void study(); //método abstract
}

// Subclasse (herda da Principal)
class Student extends Main1 {
    public int graduationYear = 2023;
    public void study() {
        System.out.println("Estudando o dia todo.");
    }
}
