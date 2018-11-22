package controle;

import java.sql.ResultSet;

import modelo.Cliente;
import modelo.Funcionario;

public interface BancoDados {
	
	// Definição de Métodos Padrões
	
	/**
	 * 
	 * @return
	 */
	public boolean abrirConexao();
	
	/**
	 * 
	 * @param ip
	 * @param senha
	 * @return
	 */
	public boolean abrirConexao( String ip , String senha );
	
	/**
	 * 
	 * @param nomeBanco
	 * @param login
	 * @param senha
	 * @return
	 */
	public boolean abrirConexao( String nomeBanco , String login , String senha );
	 
	/**
	 * 
	 * @param login
	 * @param senha
	 * @return
	 */
	public Funcionario fazerLogin ( String login, String senha );
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	public boolean executarBusca( String sql );
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	public ResultSet executarComando( String sql );
	
	/**
	 * 
	 * @return
	 */
	public int quantidadeRetorno();
	
	/**
	 * 
	 * @return
	 */
	public boolean proximaCedula();
	
	/**
	 * 
	 * @param campo
	 * @return
	 */
	public String buscarCampo( String campo );
	
	/**
	 * 
	 * @param campo
	 * @return
	 */
	public int buscarCampo( int campo );
	
	/**
	 * 
	 * @param cliente
	 * @return
	 */
	public boolean gravarCliente( Cliente cliente );
	
	/**
	 * 
	 * @return
	 */
	public boolean fecharConexao();

}
