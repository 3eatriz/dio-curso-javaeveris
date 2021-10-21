package entidades;

import enums.Atividade01_TipoVeiculo;

public class Atividade01_Veiculo {

	protected String placa;
	protected String marca;
	protected Atividade01_TipoVeiculo modelo;
	protected String horaEntrada;
	protected String horaSaida;
	
	public Atividade01_Veiculo() {}
	
	public Atividade01_Veiculo(String placa, String marca, Atividade01_TipoVeiculo modelo, String horaEntrada, String horaSaida) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Atividade01_TipoVeiculo getModelo() {
		return modelo;
	}

	public void setModelo(Atividade01_TipoVeiculo modelo) {
		this.modelo = modelo;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

}
