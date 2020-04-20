package view;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewMenu extends JFrame{
	
	private JButton testeButton;
	
	public ViewMenu() {
		//isso � importante, esse � o gerenciador de Layout
		// Layout � a forma como as coisas se organizam na tela
		setLayout(null);
		
		//definindo o tamanho da janela
		setSize(300, 300);
		
		//deixar a janela no centro da tela
		setLocationRelativeTo(null);
		
		testeButton = new JButton("Botao Teste");
		// agora eu vou definir a localiza��o do botao
		// vai ficar no ponto (30, -10) com 10 pixels de altura e 10 pixels de largura, entendeu? ok 
		testeButton.setBounds(80, 250, 150, 50); // se aumentar os pixels? aumenta, show
		// lembrando que a posi��o � exata 
		
		// mas agora eu preciso adicionar o botao � tela
		add(testeButton);
		
		// agora eu preciso deixar a janela visivel
		// lembrando que essa classe toda � uma Janela
		setVisible(true);
	}
	
}
