package entities;

public class Prospecto {

	private String nome_razaosocial;
	private String email;
	private Integer cep;
	private Integer telefone;
	private Integer cpf_cnpj;
	private String tipo_pessoa;
	
	
	public Prospecto(String nome_razaosocial, String email, Integer cep, Integer telefone, Integer cpf_cnpj,
			String tipo_pessoa) {
		this.nome_razaosocial = nome_razaosocial;
		this.email = email;
		this.cep = cep;
		this.telefone = telefone;
		this.cpf_cnpj = cpf_cnpj;
		this.tipo_pessoa = tipo_pessoa;
	}


	public Prospecto() {
		super();
	}


	public String getNome_razaosocial() {
		return nome_razaosocial;
	}


	public void setNome_razaosocial(String nome_razaosocial) {
		this.nome_razaosocial = nome_razaosocial;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getCep() {
		return cep;
	}


	public void setCep(Integer cep) {
		this.cep = cep;
	}


	public Integer getTelefone() {
		return telefone;
	}


	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}


	public Integer getCpf_cnpj() {
		return cpf_cnpj;
	}


	public void setCpf_cnpj(Integer cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}


	public String getTipo_pessoa() {
		return tipo_pessoa;
	}


	public void setTipo_pessoa(String tipo_pessoa) {
		this.tipo_pessoa = tipo_pessoa;
	}
	
	
}