package modelo;

/**
 * 	Classe padronizada do Cliente.
 * @author SIG
 *
 */
public class Cliente extends Usuario {
	
	private int matricula_id;
	
	private String nome , CNPJ; 

	private Endereco endereco;

	/**
	 * 
	 * @param matricula_id
	 * @param nome
	 * @param cNPJ
	 * @param endereco
	 */
	public Cliente(int matricula_id, String nome, String cNPJ, Endereco endereco) {
		this.matricula_id = matricula_id;
		this.nome = nome;
		this.CNPJ = cNPJ;
		this.endereco = endereco;
	}

	/**
	 * 
	 * @param matricula_id
	 * @param nome
	 * @param cNPJ
	 * @param id_end
	 * @param rua
	 * @param bairro
	 * @param cidade
	 * @param estado
	 * @param complemento
	 * @param numero
	 */
	public Cliente(int matricula_id, String nome, String cNPJ, int id_end, String rua, String bairro,
			String cidade, String estado, String complemento, String numero) {
		this.matricula_id = matricula_id;
		this.nome = nome;
		this.CNPJ = cNPJ;
		this.endereco = new Endereco( id_end , rua , bairro , cidade , estado , complemento , numero);
	}

	public int getMatricula_id() {
		return matricula_id;
	}

	public void setMatricula_id(int matricula_id) {
		this.matricula_id = matricula_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
