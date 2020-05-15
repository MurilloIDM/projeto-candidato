import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int nivelEscolaridade, anosExperiencia, pontosEscolaridade, pontosExperiencia;
		char disponibilidadeViajar, carteiraMotorista;
		
		pontosEscolaridade = 0;
		pontosExperiencia = 0;
		
		System.out.println("Qual sua escolaridade?");
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
		
		//Pontos Escolaridade
		if (nivelEscolaridade == 1) {
			pontosEscolaridade = 10;
		} else if (nivelEscolaridade == 2) {
			pontosEscolaridade = 20;
		} else if (nivelEscolaridade == 3) {
			pontosEscolaridade = 30;
		} else if (nivelEscolaridade == 4) {
			pontosEscolaridade = 40;
		} else {
			pontosEscolaridade = 0;
		}
		
		//Pontos Experiência
		if (anosExperiencia == 0) {
			pontosExperiencia = 0;
		} else if (anosExperiencia > 0 && anosExperiencia <= 2) {
			pontosExperiencia = 10;
		} else if (anosExperiencia > 2 && anosExperiencia <= 5) {
			pontosExperiencia = 20;
		} else if (anosExperiencia > 5) {
			pontosExperiencia = 40;
		}
		
		System.out.printf("%nPontos por escolaridade: %d%n", pontosEscolaridade);
		System.out.printf("Pontos por experiência: %d%n", pontosExperiencia);
		
		input.close();

	}

}
