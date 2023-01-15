// If, ElseIf, e Else em Java
// Tipos de Condicionais

public class IfElse {
	public static void main(String[] args) {
        int time = 17;
        if ( time < 10) {
            System.out.println("Good Morning!!");
        } else if (time < 18) {
            System.out.println("Good Afternoon!!");
        } else {
            System.out.println("Good Evening!!");
        }

        // Operador ternário
        int temp = 20;
        String result = (temp < 18) ? "Good day" : "Good evening";
        System.out.println(result);
    }
}  