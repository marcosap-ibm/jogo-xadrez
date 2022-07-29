import java.util.Scanner;

public class entrada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String x;
		String s1;
		int y;
		double z;
		char gen;

		System.out.println("Digite o primeiro nome: ");
		x = sc.next();
		sc.nextLine(); /*macete para absorver a quebra de entrada
		quando aplica o primeiro enter, o sc.nextLine recebe o enter
		precionado senão pula a primeira entrada válida
		*/
		System.out.println("Digite o nome completo: ");
		s1 = sc.nextLine();
		System.out.println("Digite o idade: ");
		y = sc.nextInt();
		System.out.println("Digite o peso: ");
		z = sc.nextDouble();
		System.out.println("Digite o sexo: ");
		gen = sc.next().charAt(0);

		/*
		variedade de entradas:
		next(); 1 string, sem espaço
		nextInt() INT;
		nextDouble() float;
		next().charAt(0) primeiro caracter da string
		nextLine(); texto até a quebra de linha (enter)
		*/

		System.out.println("Você digitou: ");
		System.out.printf("Primeiro nome: %s", x);
		System.out.printf("\nNome completo: %s", s1);
		System.out.printf("\nIdade: %d", y);
		System.out.printf("\nPeso: %.1f", z);
		System.out.printf("\nGenero: %c", gen);
				
		sc.close();
	}
}
