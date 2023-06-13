/* Strings em Java

String é um objeto, que contém métodos que podem realizar certas operações em strings.
Exemplo: encontrar o comprimento com o método 'length()',
Exemplo: converter strings em Maiúsculas e Minúsculas com métodos 'upperCase' e 'lowerCase()',
Exemplo: pesquisar índice (posição) de uma ocorrência em um texto especifico de uma string (incluindo espaços em branco) com método 'indexOf("")',
Exemplo: concatenar duas strings usando método 'concat()'
*/

public class Strings {
	public static void main(String[] args) {
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());

		String txt2 = "Hello World";
		System.out.println(txt2.toUpperCase());  // Saída: "HELLO WORLD"
		System.out.println(txt2.toLowerCase());  // Saída:  "hello world"

		String txt3 = "Please locate where 'locate' occurs!";
		System.out.println(txt3.indexOf("locate"));  // Saída: 7

		String firstName = "Junior ";
		String lastName = "Melo";
		System.out.println(firstName.concat(lastName));
	}
}