package modelo;

public class Produto {
	
	private int id;
	private double valor;
	private String nome;
	private Estoque estoque;

	
	// Construtor
	public Produto(int id, double valor, String nome, Estoque estoque) {
		this.id = id;
		this.valor = valor;
		this.nome = nome;
		this.estoque = estoque;
	}

	// Gets e Sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	// Métodos
	public void aumentarProduto( int quantidade )
	{
		
	}
	
	public boolean diminuirProduto( int quantidade )
	{
		return true;
	}

}
