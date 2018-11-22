package modelo;

import java.util.List;


public class Pedido {
	
	private int pedido_id, quantidade;
	private float preço;
	private String observações;
	private Historico historico;
	private Funcionario funcionario;
	private Cliente cliente;
	private List<Produto> produtos; // ArrayList

	// Construtor
	public Pedido(int pedido_id, int quantidade, float preço, String observações, Historico historico,
			Funcionario funcionario, Cliente cliente, List<Produto> produtos) {
		this.pedido_id = pedido_id;
		this.quantidade = quantidade;
		this.preço = preço;
		this.observações = observações;
		this.historico = historico;
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.produtos = produtos;
	}


	// Gets e Sets
	public int getPedido_id() {
		return pedido_id;
	}


	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public float getPreço() {
		return preço;
	}


	public void setPreço(float preço) {
		this.preço = preço;
	}


	public String getObservações() {
		return observações;
	}


	public void setObservações(String observações) {
		this.observações = observações;
	}


	public Historico getHistorico() {
		return historico;
	}


	public void setHistorico(Historico historico) {
		this.historico = historico;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	// Métodos
	public void adicionarProduto ( Produto produto )
	{
		
	}
	
	public float calcularPreco ()
	{
		return (float) 0.11;
	}
	
	public void cancelarPedido()
	{
		
	}
	
	public void efetivarPedido()
	{
		
	}
	
	public void removerProduto ( Produto produto )
	{
		
	}
	
	public void removerProduto ( Produto produto , int quantidade )
	{
		
	}
	

}
