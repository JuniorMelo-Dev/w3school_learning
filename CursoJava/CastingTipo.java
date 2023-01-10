/* Casting de ampliação automático ao passar um tipo de tamanho menor para um tipo de tamanho maior.
*/

public class CastingTipo {
	public static void main(String[] args) {
		int myInt = 9;
		double myDouble = myInt; // Casting automático

		System.out.println(myInt);  // Saída 9
		System.out.println(myDouble);  //  Saída 9.0
	}
}