package albino;

import javax.swing.JOptionPane;

public class Desafio06 {

	public static void main(String[] args) {
		
	
	
	int opcao;
	double num1, num2, resultado;
	String menu;

	menu = "Escolha uma op��o:\n"
			+ "1 - Somar \n"
			+ "2 - Subtrair \n"
			+ "3 - Multiplicar \n"
			+ "4 - Dividir \n"
			+ "5 - Pot�ncia \n"
			+ "0 - Sair";

		
	
	
	opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
	
	while (opcao != 0) {

	switch (opcao) {

	case 1:

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero da SOMA: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero da SOMA: "));

		resultado = num1 + num2;

		JOptionPane.showMessageDialog(null, "SOMA: \n"+ num1+" + "+num2+" = "+resultado);

		break;

	case 2:


		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero da SUBTRA��O: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero da SUBTRA��O: "));

		resultado = num1 - num2;

		JOptionPane.showMessageDialog(null,"SUBTRA��O: \n"+ num1+" - "+num2+" = "+resultado);

		break;

	case 3:


		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero da MULTIPLICA��O: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero da MULTIPLICA��O: "));

		resultado = num1 * num2;

		JOptionPane.showMessageDialog(null,"MULTIPLICA��O: \n"+ num1+" x "+num2+" = "+resultado);
		
		break;

	case 4:
		

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero da DIVIS�O: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero da DIVIS�O: "));

		resultado = num1 / num2;

		JOptionPane.showMessageDialog(null,"DIVIS�O: \n"+ num1+" � "+num2+" = "+resultado);

		break;
		
	case 5:
		

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero da POT�NCIA: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero da POT�NCIA: "));

		
		resultado = Math.pow(num1, num2);

		JOptionPane.showMessageDialog(null,"POT�NCIA: \n"+ num1+" � "+num2+" = "+resultado);

		break;

	default:
		
		JOptionPane.showMessageDialog(null,"FAVOR SELECIONAR UMA OP��O V�LIDA!");
		
		break;
	}
	
	opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

	}
}

	
}
