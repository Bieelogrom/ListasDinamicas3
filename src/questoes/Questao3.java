package questoes;

import Lista.Lista;

public class Questao3 {
	public static void main(String[] args) {
		int[] vetor = {25,42,23,74,80,70,13,41,59,35,68,53,75,84,44,94,93,71,88};
		
		Lista<Integer> l = new Lista<>();
		
		
		try {
			for(int i : vetor) {
				if(l.isEmpty()) {
					l.addFirst(i * 2);
				}else if(l.size() < 3) {
					l.addFirst(i / 2);
				}else if(l.size() > 10) {
					l.add(i * 3, 5);
				}else {
					l.add(i, 1);
				}
			}
			
			while(!l.isEmpty()) {
				if(l.size() > 10) {
					int valor = l.get(3);
					l.remove(3);
					System.out.println(valor);
				}else if(l.size() > 5) {
					int valor = l.get(l.size() - 1);
					l.removeLast();
					System.out.println(valor);
				}else if(l.size() > 3) {
					int valor = l.get(1);
					l.remove(1);
					System.out.println(valor);
				}else {
					int valor = l.get(0);
					l.removeFirst();
					System.out.println(valor);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
