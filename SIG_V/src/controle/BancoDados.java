package controle;

import java.sql.ResultSet;

public interface BancoDados {
	
	// Definição de métodos padrões
	
	public boolean abrirConexao();
	
	public boolean abrirConexao( String ip , String senha );
	
	public boolean abrirConexao( String nomeBanco , String login , String senha );
	
	public ResultSet executarBusca( String sql );
	public ResultSet executarComando( String sql );
	
	public void fecharConexao();

}
