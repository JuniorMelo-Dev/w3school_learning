package JavaPOO;

/*
 * Estático vs. Público
 * exemplo para demonstrar as diferenças entre os métodos static e public
 */

public class Main2 {
    // Método Static
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Método Public
    public void myPublicMethod() {
        System.out.println("Public methods be called by creating objects");
    }

    // Método Principal (Main2)
    public static void main(String[] args) {
        myStaticMethod();

        Main2 myObj = new Main2();
        myObj.myPublicMethod();
    }
}
