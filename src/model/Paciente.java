package model;

public class Paciente {
	private String nome;
	private String numeroCartaoSus;
	private String cpf;
	private String dataDeNascimento;
	private int idade;
	private char sexo;
	private String telefone1;
	private String telefone2;
	private boolean ehWhatsApp;
	private Endereco endereco;
	
	public Paciente() {
		this.nome = "";
		this.numeroCartaoSus = "";
		this.cpf = "";
		this.dataDeNascimento = "";
		this.idade = 0;
		this.sexo = 'm';
		this.telefone1 = "";
		this.telefone2 = "";
		this.ehWhatsApp = false;
		this.endereco = new Endereco();
	}
	
	public Paciente(String nome, String numeroCartaoSus, String cpf, String dataDeNascimento, 
			int idade, char sexo, String telefone1, String telefon2, boolean ehWhatsApp, Endereco endereco) {
		this.nome = nome;
		this.numeroCartaoSus = numeroCartaoSus;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone1 = telefone1;
		this.telefone2 = telefon2;
		this.ehWhatsApp = ehWhatsApp;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroCartaoSus() {
		return numeroCartaoSus;
	}

	public void setNumeroCartaoSus(String numeroCartaoSus) {
		this.numeroCartaoSus = numeroCartaoSus;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public boolean isEhWhatsApp() {
		return ehWhatsApp;
	}

	public void setEhWhatsApp(boolean ehWhatsApp) {
		this.ehWhatsApp = ehWhatsApp;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void apresentarPaciente() {
		System.out.printf("Nome Completo: %s\nNúmero do Cartão do Sus: %s\nCpf: %s\nData de Nascimento: %s\nIdade: %d\n"
				+ "Sexo: %c\nTelefone de Contato 1: %s\nTelefone de Contato 2: %s\nÉ WhatsApp: %b\n"
				, nome, numeroCartaoSus, cpf, dataDeNascimento.toString(), idade, sexo, telefone1, telefone2, ehWhatsApp);
		endereco.apresentarEndereco();
		
	}
}
