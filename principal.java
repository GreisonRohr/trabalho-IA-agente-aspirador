import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) throws InterruptedException {

		Scanner ler = new Scanner(System.in);

		System.out.println("                   **** AGENTE ASPIRADOR DE PÓ ****");
		System.out.println(" ");

		System.out.println("Ambiente com o Aspirador");
		System.out.println("A = passa pelo ambiente sem aspirar/");
		System.out.println(
				"*a* = passa pelo ambiente e aspira                     Status do Ambiente L= Limpo / S= Sujo");
		System.out.println("");

		ambiente agente = new ambiente();//cria um agente
		Random aleatorio = new Random();//sorteia a posiçao onde o agente vai ser posicionado primeiro
		int valor = aleatorio.nextInt(2);
		
		agente.construirAmbiente();//chama a funçao construir ambiente
		
		agente.mostrarAmbiente();//printa o ambiente 
		Thread.sleep(1500);//pausa a execução para visualizar o status
			agente.movimentar(valor);//adiciona o agente para executar 
			
			
			
				


	}

}
