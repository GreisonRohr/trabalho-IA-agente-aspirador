import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) throws InterruptedException {

		Scanner ler = new Scanner(System.in);

		int posiInicial = 0;
		int proximaPosi = 0;

		System.out.println("                   **** AGENTE ASPIRADOR DE PÓ ****");

		System.out.println("Ambiente com o Aspirador");
		System.out.println("A = passa pelo ambiente sem aspirar/");
		System.out.println(
				"*a* = passa pelo ambiente e aspira                     Status do Ambiente L= Limpo / S= Sujo");

		ambiente agente = new ambiente();
		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(2);
		switch (valor) {
		case 0:
			proximaPosi = 1;
			break;
		case 1:
			proximaPosi = 0;
			break;
		}
		agente.construirAmbiente();
		agente.mostrarAmbiente();
		
			agente.movimentar(valor,  proximaPosi);
			
				


	}

}
