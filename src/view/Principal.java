package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.brunosantos.Pilha;
import controller.HistoricoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		Pilha p = new Pilha();
		HistoricoController hc = new HistoricoController();
		int op = 0;
		while(op != 9) {
		    op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a op��o\n "
		    		+ "1 - inserir endereco\n "
		    		+ "2 - remover endereco\n "
		    		+ "3 - exibir o ultimo endereco\n "
		    		+ "9 - sair"));
			switch(op) {
				case 1:
					String caminho = "";
					String endereco = JOptionPane.showInputDialog("Digite um endereco: ");
					if(endereco.substring(0,7).equals("http://")) {
						if(endereco.substring(endereco.length()-4).equals(".com")) {
							caminho = endereco;
							hc.inserirEndereco(p, endereco);
						}else {
							throw new Exception("� necess�rio que o dominio termine com .com");
						}
						
					}else {
						throw new Exception("� necess�rio que o endere�o inicie com http://");
					}
					
					break;
				case 2:
					if(!p.pilhaVazia()) {
						String removido = hc.removerEndereco(p);
						System.out.println("o ultimo endereco removido �: " + removido);
					}else {
						throw new Exception("Pilha vazia, n�o h� elementos a serem removidos");
					}
					
					break;
				case 3:
					if(!p.pilhaVazia()) {
					String ultimo =	hc.exibirUltimoEndereco(p);
					System.out.println("o ultimo endereco �:" + ultimo);
					}else {
						throw new Exception("N�o h� historico a ser exibido");
					}
					
					break;
				case 9:
					System.exit(0);
			}
		}
	}

}
