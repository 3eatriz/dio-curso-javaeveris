package aplicacao;

import java.util.Scanner;

import entidades.Atividade01_Estacionamento;
import entidades.Atividade01_Veiculo;
import enums.Atividade01_TipoVeiculo;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados do funcion�rio
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-| FUNCION�RIO |-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("Informe o valor por hora do estacionamento: ");
		double valorHora = leia.nextDouble();
		System.out.println();
		
		//Entrada de dados da entrada do cliente
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-| ENTRADA DO CLIENTE |-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("TOLER�NCIA DE 10 MINUTOS!!");
		System.out.print("Informe a placa do ve�culo: ");
		String placa = leia.next();
		System.out.print("Informe a marca do ve�culo: ");
		String marca = leia.next();
		System.out.print("Informe a hora de entrada(hh:mm): ");
		String horaEntrada = leia.next();	
		
		boolean repita;
		Atividade01_TipoVeiculo modeloEnum = null;
		
		//Estrutura de repeti��o usada para caso o usu�rio errar na hora de escolher o tipo do ve�culo
		do {
			repita = false;
			System.out.print("Informe o modelo do ve�culo (carro/moto/utilitario): ");
			String modelo = leia.next();
			
			if(modelo.equalsIgnoreCase("carro")) {
				modeloEnum = Atividade01_TipoVeiculo.CARRO;
			}
			else if(modelo.equalsIgnoreCase("moto")) {
				modeloEnum = Atividade01_TipoVeiculo.MOTO;
			}
			else if(modelo.equalsIgnoreCase("utilitario")) {
				modeloEnum = Atividade01_TipoVeiculo.UTILITARIO;
			}
			else {
				System.out.println("Informe um tipo v�lido de ve�culo!");
				repita = true;
			}
		}while(repita == true);
		System.out.println();
		
		//Dados da sa�da do cliente
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-| SA�DA DO CLIENTE |-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("Informe a hora da sa�da (hh:mm): ");
		String horaSaida = leia.next();
		Atividade01_Estacionamento veiculoEstacionado = new Atividade01_Estacionamento(valorHora, new Atividade01_Veiculo(placa, marca, modeloEnum, horaEntrada, horaSaida));
		String placa2;
		
		//Estrutura de repeti��o usada para caso o usu�rio errar a placa do carro estacionado
		do {
			System.out.print("Informe a placa do ve�culo estacionado: ");
			placa2 = leia.next();
			
			if(veiculoEstacionado.placaExiste(placa2)) {
				
			}
			else {
				System.out.println("Placa inexistente!");
			}
		} while(!veiculoEstacionado.placaExiste(placa2));
		
		veiculoEstacionado.calcularFaturamento();
		
		System.out.println();
		System.out.println(veiculoEstacionado);
		
		leia.close();
	}

}
