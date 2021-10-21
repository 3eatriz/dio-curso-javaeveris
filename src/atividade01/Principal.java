package atividade01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados do funcionário
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-| FUNCIONÁRIO |-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("Informe o valor por hora do estacionamento: ");
		double valorHora = leia.nextDouble();
		System.out.println();
		
		//Entrada de dados da entrada do cliente
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-| ENTRADA DO CLIENTE |-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("TOLERÂNCIA DE 10 MINUTOS!!");
		System.out.print("Informe a placa do veículo: ");
		String placa = leia.next();
		System.out.print("Informe a marca do veículo: ");
		String marca = leia.next();
		System.out.print("Informe a hora de entrada(hh:mm): ");
		String horaEntrada = leia.next();	
		
		boolean repita;
		TipoVeiculo modeloEnum = null;
		
		//Estrutura de repetição usada para caso o usuário errar na hora de escolher o tipo do veículo
		do {
			repita = false;
			System.out.print("Informe o modelo do veículo (carro/moto/utilitario): ");
			String modelo = leia.next();
			
			if(modelo.equalsIgnoreCase("carro")) {
				modeloEnum = TipoVeiculo.CARRO;
			}
			else if(modelo.equalsIgnoreCase("moto")) {
				modeloEnum = TipoVeiculo.MOTO;
			}
			else if(modelo.equalsIgnoreCase("utilitario")) {
				modeloEnum = TipoVeiculo.UTILITARIO;
			}
			else {
				System.out.println("Informe um tipo válido de veículo!");
				repita = true;
			}
		}while(repita == true);
		System.out.println();
		
		//Dados da saída do cliente
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-| SAÍDA DO CLIENTE |-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("Informe a hora da saída (hh:mm): ");
		String horaSaida = leia.next();
		Estacionamento veiculoEstacionado = new Estacionamento(valorHora, new Veiculo(placa, marca, modeloEnum, horaEntrada, horaSaida));
		String placa2;
		
		//Estrutura de repetição usada para caso o usuário errar a placa do carro estacionado
		do {
			System.out.print("Informe a placa do veículo estacionado: ");
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
