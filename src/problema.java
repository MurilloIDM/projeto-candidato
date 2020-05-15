import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int nivelEscolaridade, anosExperiencia;
		char disponibilidadeViajar, carteiraMotorista;
		
		System.out.println("Qual sua escolaridade");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.print("Digite uma opção: ");
		nivelEscolaridade = input.nextInt();
		
		System.out.print("\nVocê tem quantos anos de experiência profissional? ");
		anosExperiencia = input.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		disponibilidadeViajar = input.next().charAt(0);
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		carteiraMotorista = input.next().charAt(0);
		
		input.close();

	}

}
