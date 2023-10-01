package util;

import java.util.ArrayList;
import java.util.List;

import entities.Pessoa;

public class CadastroPessoas {
	
	private List<Pessoa> pessoas;
	
	public CadastroPessoas() {
		this.pessoas = new ArrayList<>();
	}
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		System.out.println("Pessoa adicionada com sucesso!");
	}
	
	public void deletarPessoa(Pessoa pessoa) {
		pessoas.remove(pessoa);
		System.out.println("Pessoa deletada com sucesso!");
	}
	
	public void listarPessoas() {
		for(Pessoa pessoa : pessoas) {
			pessoa.mostrarDetalhes();
			System.out.println("---------------------------------");
		}
	}
	
	public Pessoa buscarPessoa(String pessoaPesquisada) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getNome().equals(pessoaPesquisada)) {
				return pessoa;
			}
		}
		return null;
	}
	
	public void deletarPessoa(String pessoaDeletar) {
		Pessoa pessoaEncontrada = buscarPessoa(pessoaDeletar);
		if(pessoaEncontrada != null) {
			deletarPessoa(pessoaEncontrada);
		} else {
			System.out.println("A pessoa com este nome não está em nosso banco de dados.");
		}
	}
}
