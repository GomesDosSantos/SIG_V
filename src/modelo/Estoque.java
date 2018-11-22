package modelo;

public class Estoque {

	private int id , quantidade;

	public Estoque(int id, int quantidade) {
		this.id = id;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
