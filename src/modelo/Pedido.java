package modelo;

import java.util.List;


public class Pedido {
	
	private int pedido_id, quantidade;
	private float pre�o;
	private String observa��es;
	private Historico historico;
	private Funcionario funcionario;
	private Cliente cliente;
	private List<Produto> produtos; // ArrayList

	// Construtor
	public Pedido(int pedido_id, int quantidade, float pre�o, String observa��es, Historico historico,
			Funcionario funcionario, Cliente cliente, List<Produto> produtos) {
		this.pedido_id = pedido_id;
		this.quantidade = quantidade;
		this.pre�o = pre�o;
		this.observa��es = observa��es;
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


	public float getPre�o() {
		return pre�o;
	}


	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}


	public String getObserva��es() {
		return observa��es;
	}


	public void setObserva��es(String observa��es) {
		this.observa��es = observa��es;
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
	
	
	// M�todos
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
