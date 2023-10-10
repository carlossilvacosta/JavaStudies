package entities;

public class Veiculo {

	private String modelo;
	private double km;

	public Veiculo() {
	}

	public Veiculo(String modelo, double km) {
		this.modelo = modelo;
		this.km = km;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double calcularCustoServico() {
		return 0.0; 	
	}

}
