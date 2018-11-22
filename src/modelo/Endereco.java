package modelo;

/**
 * 
 * Classe Padronizada de Endereço.
 * 
 * @author SIG
 *
 */
public class Endereco {

	private int id;
	private String rua, bairro, cidade, estado, numero, complemento;

	/**
	 * 
	 * @param id 			ID Cliente
	 * @param rua			Nome da Rua
	 * @param bairro		Nome do Bairro
	 * @param cidade		Nome da Cidade
	 * @param estado		SIGLA do Estado (SP, RJ...)
	 * @param numero		Número do estabelecimento, instituição, etc...
	 * @param complemento	Complemento, caso necessário
	 */
	public Endereco(int id, String rua, String bairro, String cidade, String estado, String numero,
			String complemento) {
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.complemento = complemento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
