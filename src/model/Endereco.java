package model;

public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String cep;
	private int numeroCasa;
	private String descricao;
	
	public Endereco() {
		this.estado = "";
		this.cidade = "";
		this.bairro = "";
		this.rua = "";
		this.cep = "";
		this.numeroCasa = 0;
		this.descricao = "";
	}
	
	public Endereco(String estado, String cidade, String bairro, String rua, String cep, int numeroCasa, String descricao) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.numeroCasa = numeroCasa;
		this.descricao = descricao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void apresentarEndereco() {
		System.out.printf("Estado: %s\nCidade: %s\nBairro: %s\nRua: %s\nCep: %s\nNúmero da Casa: %d\nDescrição: %s"
				, estado, cidade, bairro, rua, cep, numeroCasa, descricao);
	}
}
