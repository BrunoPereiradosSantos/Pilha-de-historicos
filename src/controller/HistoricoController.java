package controller;

import br.edu.fateczl.brunosantos.Pilha;

public class HistoricoController {
	Pilha p = new Pilha();
	public void inserirEndereco(Pilha p, String endereco) {
		p.push(endereco);
	}
	
	public String removerEndereco(Pilha p) throws Exception {
		String enderecoRemovido = p.pop();
		return enderecoRemovido;
	}
	
	public String exibirUltimoEndereco(Pilha p) throws Exception {
		String endereco = p.top();
		return endereco;
	}
}
