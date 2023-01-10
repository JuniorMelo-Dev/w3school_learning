// Booleanos em Java

public class Booleanos {
	public static void main(String[] args) {
		// Saída simples de valores booleanos
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);  //  Saída: 'true'
		System.out.println(isFishTasty);  //  saída: 'false'

		// Saída com expressões booleanas
		int x = 10;
		int y = 9;
		System.out.println(x > y);  // Saída 'true', pois 10 é maior do que 9

		// Descobrir se uma pessoa tem idade para votar
		int myAge = 25;
		int votingAge = 18;
		System.out.println(myAge >= votingAge);

		// Teste com If...else
		int myAged = 17;
		int votingAged = 18;

		if (myAge >= votingAge) {
			System.out.println("Old enough to vote!");
		} else {
			System.out.println("Not old enough to vote.");
		}

	}
}