package application;

import entities.Cachorro;
import entities.Carro;
import entities.ContaBancaria;
import entities.Livro;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		 //Criar ao menos dois objetos de cada classe.
		
        Carro carro1 = new Carro("Fiat", "Cronos", 2022);
        Carro carro2 = new Carro("Jeep", "Renegade", 2019);

        Pessoa pessoa1 = new Pessoa("Carlos Costa", 23);
        Pessoa pessoa2 = new Pessoa("Maria Carolina", 21);

        Livro livro1 = new Livro("Os Miseráveis", "Machado de Assis", 1862);
        Livro livro2 = new Livro("Dom Casmurro", "George Orwell", 1899);

        Cachorro cachorro1 = new Cachorro("Lion", "Labrador", 1);
        Cachorro cachorro2 = new Cachorro("Toby", "Pastor Alemão", 11);

        ContaBancaria conta1 = new ContaBancaria("Carlos Costa", 1500.0);
        ContaBancaria conta2 = new ContaBancaria("Maria Carolina", 2000.0);

        
        
        // Exibir dados antes da alteração dos objetos.
        
        System.out.println("\nAntes das alterações:\n");
        
        carro1.exibirDados();
        carro2.exibirDados();

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        livro1.exibirDados();
        livro2.exibirDados();

        cachorro1.exibirDados();
        cachorro2.exibirDados();

        conta1.exibirDados();
        conta2.exibirDados();

        
        
        // Alterar valores dos objetos
        
        carro1.alterarModelo("Argo");
        carro2.alterarModelo("Compass");
        
        pessoa1.fazerAniversario();
        pessoa2.fazerAniversario();
        
        livro1.alterarAutor("Victor Hugo");
        livro2.alterarAutor("Machado de Assis");
        
        cachorro1.envelhecer();
        cachorro2.envelhecer();
        
        conta1.depositar(500.0);
        conta2.sacar(200.0);

        
        
        // Exibir dados após a alteração dos objetos
        
        System.out.println("\nApós alterações:\n");

        carro1.exibirDados();
        carro2.exibirDados();

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        livro1.exibirDados();
        livro2.exibirDados();

        cachorro1.exibirDados();
        cachorro2.exibirDados();

        conta1.exibirDados();
        conta2.exibirDados();

	}

}
