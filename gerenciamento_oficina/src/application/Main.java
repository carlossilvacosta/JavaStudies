package application;

import java.util.ArrayList;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		Veiculo v1 = new Carro("Uno", 200000.00);
		Veiculo v2 = new Moto("Honda", 200000.00);
		
		System.out.println("Modelo do Carro: " + v1.getModelo());
		System.out.println("Quilometragem: " + v1.getKm());
		System.out.println("Custo do Serviço: " + v1.calcularCustoServico());
		System.out.println("----------------------------------------------");
		System.out.println("Modelo do Carro: " + v2.getModelo());
		System.out.println("Quilometragem: " + v2.getKm());
		System.out.println("Custo do Serviço: " + v2.calcularCustoServico());
		System.out.println("----------------------------------------------");
		System.out.println();
		
		veiculos.add(v1);
		veiculos.add(v2);
		
		for(Veiculo veiculo : veiculos) {
			System.out.println("Modelo do Carro: " + veiculo.getModelo());
			System.out.println("Quilometragem: " + veiculo.getKm());
			System.out.println("Custo do Serviço: " + veiculo.calcularCustoServico());
			System.out.println();
		}
	}
}
