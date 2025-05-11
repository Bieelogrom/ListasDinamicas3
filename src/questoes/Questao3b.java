package questoes;

import Lista.Lista;

public class Questao3b {
	public static void main(String[] args) {
		Lista<Integer> l = new Lista<>();
		
		try {
			l.addFirst(3);
			l.addLast(5);
			l.addLast(8);
			l.addLast(12);
			l.addLast(9);
			l.addLast(7);
			l.addLast(6);
			l.addLast(2);
			l.addLast(3);
			l.addLast(7);
			l.addLast(16);
			l.exibirLista();
			
			int maiorA = 0;
			int maiorB = 0;
			
			for(int i = 0; i < l.size(); i++) {
				int valor = l.get(i);
				if(valor > maiorA) {
					maiorB = maiorA;
					maiorA = valor;
				}else if(valor > maiorB && valor != maiorA) {
					maiorB = valor;
				}
			}
			
			System.out.println("\nMaior a: "+ maiorA);
			System.out.println("Maior b: "+ maiorB);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
