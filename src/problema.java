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
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.print("Digite uma op��o: ");
		nivelEscolaridade = input.nextInt();
		
		System.out.print("\nVoc� tem quantos anos de experi�ncia profissional? ");
		anosExperiencia = input.nextInt();
		System.out.print("Voc� tem disponibilidade para viajar (S/N)? ");
		disponibilidadeViajar = input.next().charAt(0);
		System.out.print("Voc� tem habilita��o de motorista (S/N)? ");
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
		
		//Pontos Experi�ncia
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
		System.out.printf("Pontos por experi�ncia: %d%n", pontosExperiencia);
		
		//Vagas
		if (pontosExperiencia > 0 && pontosEscolaridade > 10) {
			System.out.println("\nVoc� est� habilitado para o(s) seguinte(s) cargo(s):");
			if (pontosEscolaridade >= 20 && (carteiraMotorista == 'S' || carteiraMotorista == 's')) {
				System.out.println("ASSISTENTE");
			} 
			
			if (pontosExperiencia >= 20 && pontosEscolaridade >= 30) {
				System.out.println("GERENTE");
			} 
			
			if (pontosExperiencia == 40 && (disponibilidadeViajar == 'S' || disponibilidadeViajar == 's') && pontosEscolaridade >= 30) {
				System.out.println("ANALISTA");
			} 
		} else {
			System.out.println("\nInfelizmente seu perfil n�o atende a empresa");
		}
		
		
		input.close();

	}

}
