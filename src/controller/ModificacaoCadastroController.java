package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import Lista.Lista;
import model.Cliente;

public class ModificacaoCadastroController {
	public ModificacaoCadastroController() {
		// TODO Auto-generated constructor stub
	}
	
	private void novoArquivo(Lista<Cliente> L, String nomeArquivo) throws IOException {
		String path = System.getProperty("user.dir") + File.separator + "SistemaCadastro";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, nomeArquivo);
		boolean existe = false;
		if(arq.exists()) {
			existe = true;
		}
		FileWriter fw = new FileWriter(arq, existe);
		PrintWriter pw = new PrintWriter(fw);
		int tamanho = L.size();
		for(int i = 0; i < tamanho; i++) {
			Cliente novoCliente;
			try {
				novoCliente = L.get(i);
				String texto = novoCliente.toString();
				pw.write(texto+"\r\n");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pw.flush();
		pw.close();
		fw.close();
	}
	
	public void novoCadastro(int idadeMin, int idadeMax, double limiteCredito) throws Exception {
		Lista<Cliente> lc = new Lista<>();
		String path = System.getProperty("user.dir") + File.separator + "docs";
		File arq = new File(path, "Cadastro.csv");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String linha = buffer.readLine();
			while(linha != null) {
				String[] cliente = linha.split(";");
				cliente[3] = cliente[3].replace(",",".");
				Cliente novoCliente = new Cliente(cliente[0],cliente[1], Integer.parseInt(cliente[2]), Double.parseDouble(cliente[3]));
				if((novoCliente.getIdade() > idadeMin && novoCliente.getIdade() < idadeMax) && novoCliente.getLimiteCredito() > limiteCredito) {
					lc.addLast(novoCliente);
				}
				String nomeArquivo = "Idade: "+novoCliente.getIdade()+" Limite: "+novoCliente.getLimiteCredito();
				novoArquivo(lc,nomeArquivo);
				linha = buffer.readLine();
			}
			buffer.close();
			isr.close();
			fis.close();
		}
	}
	
}
