package atividade01;

public class Veiculo {

	protected String placa;
	protected String marca;
	protected TipoVeiculo modelo;
	protected String horaEntrada;
	protected String horaSaida;
	
	public Veiculo() {}
	
	public Veiculo(String placa, String marca, TipoVeiculo modelo, String horaEntrada, String horaSaida) {
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

	public TipoVeiculo getModelo() {
		return modelo;
	}

	public void setModelo(TipoVeiculo modelo) {
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
