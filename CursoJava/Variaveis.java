// Código de como criar variáveis em Java

public class Variaveis {
	public static void main(String[] args) {
		// Variavel com texto simples
		String name = "Junior Dev";
		System.out.println(name);

		// Variavel com numero simples
		int idade = 32;
		System.out.println(idade);

		// Reatribuindo um valor à variavel
		int diaMes = 8;
		diaMes = 9;
		System.out.println(diaMes);

		// Declarando vários tipos de variaveis em Java
		int meuNum = 1;
		float meuNumFloat = 1.74f;
		char minhaLetra = 'J';
		boolean meuBooleano = false;
		String meuTexto = "Estou aprendendo Java";
		System.out.println(meuNum);
		System.out.println(meuNumFloat);
		System.out.println(minhaLetra);
		System.out.println(meuBooleano);
		System.out.println(meuTexto);

		// Criando variavel 'imutavel' ou 'constante'
		final int diaAniversario = 11;
		System.out.println(diaAniversario);
		// Se quiser reatribuir valor a essa variavel, será exibido um alerta de erro.
	}
}