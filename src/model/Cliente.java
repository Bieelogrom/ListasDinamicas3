package model;

public class Cliente {
	private String cpf;
	private String nome;
	private int idade;
	private double limiteCredito;
	
	public Cliente(String cpf, String nome, int idade, double limiteCredito) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.limiteCredito = limiteCredito;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	@Override
	public String toString() {
		return cpf+";"+nome+";"+idade+";"+limiteCredito;
	}
}
