/* Casting de restrição dece ser feito manualmente, colocando o tipo entre parenteses na frente do valor
*/

public class CastingTipo2 {
	public static void main(String[] args) {
		double myDouble = 9.78d;
		int myInt = (int) myDouble;  // Casting Manual: double to int

		System.out.println(myDouble);  // Saída 9.78
		System.out.println(myInt);  //  Saída 9
	}
}