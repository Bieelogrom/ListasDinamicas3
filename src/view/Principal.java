package view;

import controller.ModificacaoCadastroController;

public class Principal {
	public static void main(String[] args) {
		ModificacaoCadastroController mcc = new ModificacaoCadastroController();
		try {
			mcc.novoCadastro(41, 60, 8000);
			mcc.novoCadastro(31, 40, 5000);
			mcc.novoCadastro(21, 30, 3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
