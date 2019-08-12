
import java.util.ArrayList;
import java.util.Random;

public class ambiente {

	ArrayList<String> espaco = new ArrayList<String>();// representa o espaço com o aspirador
	ArrayList<String> statusLocal = new ArrayList<String>();// representa apenas o espaço e o status sujo ou limpo
	
	int contLimpeza=0;

	
	int contMovimentos=0;

// Valores: S == Sujo ; L == Limpo ; A == Aspirador ; *a*==aspirando

	public void construirAmbiente() {//controi o ambiente com seu status sujo ou limpo

		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(4) + 1;// sorteia um possivel estado do ambiente
		switch (valor) {// os quatro possiveis estados do ambiente
		case 1:
			this.espaco.add("S"); // adiciona a sujeira
			this.espaco.add("S"); // adiciona a sujeira
			statusLocal.addAll(espaco);

			break;
		case 2:
			this.espaco.add("L"); // ambiente limpo
			this.espaco.add("S"); // adiciona a sujeira
			statusLocal.addAll(espaco);
			break;

		case 3:
			this.espaco.add("S"); // adiciona a sujeira
			this.espaco.add("L"); // ambiente limpo
			statusLocal.addAll(espaco);
			break;
		case 4:
			this.espaco.add("L"); // ambiente limpo
			this.espaco.add("L"); // ambiente limpo
			statusLocal.addAll(espaco);
			break;
		}

	}

	public void movimentar(int retornaAmbiente) throws InterruptedException {// recebe o valor sorteado para ver em qual ambiente o aspirador vai começar

		switch (espaco.get(retornaAmbiente)) {//possiveis situaçoes dependendo do estado do ambiente

		case "A":
			espaco.set(retornaAmbiente, "L");
			statusLocal.set(retornaAmbiente, "L");
			
			break;
		case "*a*":
			espaco.set(retornaAmbiente, "L");
			statusLocal.set(retornaAmbiente, "L");
			break;

		case "L":
			espaco.set(retornaAmbiente, "A");
			contMovimentos++;
			
			


			break;
		case "S":
			espaco.set(retornaAmbiente, "*a*");
			contMovimentos++;
			contLimpeza++;

			
			break;

		}


		System.out.println("");

		System.out.print("          ");
		
		

		for (int i = 0; i < 2; i++) {

			if (espaco.get(i) == "*a*") {//alinha o ambiente

				System.out.print("|" + espaco.get(i) + "|");

			} else {
				System.out.print("| " + espaco.get(i) + " |");

			}

		}

		System.out.print("                                            ");

		for (int i = 0; i < 2; i++) {//printa o status

			System.out.print("| " + statusLocal.get(i) + " |");
		}

		for (int i = 0; i < 5; i++) {//vai movimentar o agente 5 vezes
			Thread.sleep(1500);//pausa a execução para visualizar o status
			movimentar();
			

		}

	}

	public void movimentar() {// movimenta o agente e executa uma açao

		switch (espaco.get(0)) {

		case "L":
			espaco.set(0, "A");
			contMovimentos++;


			break;
		case "S":
			espaco.set(0, "*a*");
			contMovimentos++;
			contLimpeza++;
			break;
		case "A":
			espaco.set(0, "L");
			statusLocal.set(0, "L");
			

			break;
		case "*a*":
			espaco.set(0, "L");
			statusLocal.set(0, "L");

			break;
		}

		switch (espaco.get(1)) {

		case "L":
			espaco.set(1, "A");
			contMovimentos++;
			break;
		case "S":
			espaco.set(1, "*a*");
			contMovimentos++;
			contLimpeza++;
			break;
		case "A":
			espaco.set(1, "L");
			statusLocal.set(1, "L");

			break;
		case "*a*":
			espaco.set(1, "L");
			statusLocal.set(1, "L");

			break;
		}
		

		System.out.println("");

		System.out.print("          ");
		
		

		for (int i = 0; i < 2; i++) {

			if (espaco.get(i) == "*a*") {

				System.out.print("|" + espaco.get(i) + "|");

			} else {
				System.out.print("| " + espaco.get(i) + " |");

			}
			


		}
	


		System.out.print("                                            ");

		for (int i = 0; i < 2; i++) {

			System.out.print("| " + statusLocal.get(i) + " |");
		}
		


	}

	public void mostrarAmbiente() {//printa o ambiente
		System.out.print("          ");

		for (int i = 0; i < 2; i++) {
			if (espaco.get(i) == "*a*") {
				System.out.print("|" + espaco.get(i) + "|");

			} else {
				System.out.print("| " + espaco.get(i) + " |");

			}

		}

		System.out.print("                                            ");

		for (int i = 0; i < 2; i++) {

			System.out.print("| " + statusLocal.get(i) + " |");
		}

		System.out.println("");

	}
}
