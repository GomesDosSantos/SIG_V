package modelo;

public class Funcionario extends Usuario {
	
	private String nome, telefone, email;
	
	private Endereco endereco;

	public Funcionario( String login , String senha , String nome, String telefone, String email, Endereco endereco) {
		super( login , senha );
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public Funcionario( String login , String senha , String nome, String telefone, String email, int id_end, String rua, String bairro,
			String cidade, String estado, String complemento, String numero) {
		super( login , senha );
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = new Endereco(id_end, rua, bairro, cidade, estado, complemento, numero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	@Override
	public String toString() {
		return "" + getLogin() + "" + getSenha();
	}
	
	
	

}
