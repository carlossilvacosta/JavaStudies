package entities;

public class Moto extends Veiculo{

	public Moto() {
		super();
	}
	
	public Moto(String modelo, double km) {
		super(modelo, km);
	}
	
	@Override
	public double calcularCustoServico() {
		return getKm() * 0.03;	
	}
	
}
