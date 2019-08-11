import java.util.ArrayList;
import java.util.Random;

public class ambiente {
	public ambiente local;

	ArrayList<String> espaco = new ArrayList<String>();
	ArrayList<String> statusLocal = new ArrayList<String>();
	int a = 0, b = 0;
	// Valores: S == Sujo ; L == Limpo ; A == Aspirador ; *a*==aspirando

	public void construirAmbiente() {

		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(4) + 1;
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

	public void movimentar(int retornaAmbiente, int proximaPosi) {
		a = retornaAmbiente;
		b = proximaPosi;

		switch (espaco.get(retornaAmbiente)) {

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

			break;
		case "S":
			espaco.set(retornaAmbiente, "*a*");

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
		
		 movimentar();
		 movimentar();

	}

	public void movimentar() {

		switch (espaco.get(0)) {

		case "L":
			espaco.set(0, "A");

			break;
		case "S":
			espaco.set(0, "*a*");

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

			break;
		case "S":
			espaco.set(1, "*a*");

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

	public void mostrarAmbiente() {
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
