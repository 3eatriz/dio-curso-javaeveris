package atividade01;

public class Estacionamento {
	
	private Double valorHora;
	private double totalFaturamento;
	private int horasPassadas;
	private int minutosPassados;
	
	Veiculo veiculo = new Veiculo();
	
	public Estacionamento() {}
	
	public Estacionamento(Double valorHora, Veiculo veiculo) {
		this.valorHora = valorHora;
		this.veiculo = veiculo;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public double getTotalFaturamento() {
		return totalFaturamento;
	}

	public void setTotalFaturamento(double totalFaturamento) {
		this.totalFaturamento = totalFaturamento;
	}

	public int getHorasPassadas() {
		return horasPassadas;
	}

	public void setHorasPassadas(int horasPassadas) {
		this.horasPassadas = horasPassadas;
	}

	public int getMinutosPassados() {
		return minutosPassados;
	}

	public void setMinutosPassados(int minutosPassados) {
		this.minutosPassados = minutosPassados;
	}

	//Calcula o tempo que o veiculo ficou estacionado separando por hora e minuto
	private void calcularTempo() {
		//calculo da hora entrada
		int horaEntrada = Integer.parseInt(veiculo.horaEntrada.substring(0, 2));
		int minutoEntrada = Integer.parseInt(veiculo.horaEntrada.substring(3, 5));
		//calculo da hora saida
		int horaSaida = Integer.parseInt(veiculo.horaSaida.substring(0, 2));
		int minutoSaida = Integer.parseInt(veiculo.horaSaida.substring(3, 5));
		
		horasPassadas = horaSaida - horaEntrada;
		minutosPassados = Math.abs(minutoSaida - minutoEntrada);
		if(minutoEntrada>minutoSaida && horaSaida>horaEntrada) {
			horasPassadas -= 1;
			minutosPassados = 60 - minutosPassados;
		}
	}
	
	//Informa de forma formatada e bonitinha o tempo que o carro ficou estacionado
	public String tempoPassado() {
		String hora;
		if(horasPassadas < 10 && minutosPassados < 10) {
			hora = "0" + horasPassadas + ":" + "0" + minutosPassados;
		}
		else if(horasPassadas < 10 && minutosPassados >= 10) {
			hora = "0" + horasPassadas + ":" + minutosPassados;
		}
		else if(horasPassadas >= 10 && minutosPassados < 10) {
			hora = horasPassadas + ":" + "0" + minutosPassados;
		}
		else {
			hora = horasPassadas + ":" + minutosPassados;
		}

		return hora;
	}
	
	//Testa se a placa digitada pelo usu?rio na hora de ver os dados do carro est? correta
	public boolean placaExiste(String placa) {
		if(placa.equalsIgnoreCase(veiculo.placa)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Calcula todo o valor que o cliente deve pagar pelo estacionamento
	public void calcularFaturamento() {
		calcularTempo();
		double valor;
		if(minutosPassados > 10 || horasPassadas > 0) {
			if(minutosPassados > 10) {
				valor = valorHora*(horasPassadas+1);
			}
			else {
				valor = valorHora*horasPassadas;
			}		
		}
		else {
			valor = 0;
		}
		
		if(veiculo.modelo == TipoVeiculo.CARRO) {
			totalFaturamento = valor;
		}
		else if(veiculo.modelo == TipoVeiculo.MOTO) {
			totalFaturamento = valor - valor*0.15;
		}
		else {
			totalFaturamento = valor + valor*0.15;
		}
	}
	
	//O toString que faz todo o detalhamento para o cliente
	@Override
	public String toString() {
		return "-=-=-=-=-| DADOS DO CARRO |-=-=-=-=-\n"
				+ "Placa: " + veiculo.placa + "\n"
				+ "Marca: " + veiculo.marca + "\n"
				+ "Modelo: " + veiculo.modelo + "\n"
				+ 
				"-=-=-=-=-| DADOS DO ESTACIONAMENTO |-=-=-=-=-\n"
				+ "Hora de entrada do ve?culo: " + veiculo.horaEntrada + "\n"
				+ "Hora de sa?da do ve?culo: " + veiculo.horaSaida + "\n"
				+ "Tempo no estacionamento: " + tempoPassado() + "\n"
				+ "Valor total: R$" + String.format("%.2f", totalFaturamento);
	}
}
