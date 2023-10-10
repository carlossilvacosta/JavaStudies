package entities;

public class Carro extends Veiculo {
	
	public Carro() {
		super();
	}
	
	public Carro(String modelo, double km) {
		super(modelo, km);
	}
	
	@Override
	public double calcularCustoServico() {
		return getKm() * 0.05;	
	}
}
