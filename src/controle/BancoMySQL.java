package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Cliente;
import modelo.Funcionario;

public class BancoMySQL implements BancoDados {

	private Connection conexao;
	private Statement stt;
	private ResultSet rs;
	//											  db			root                root  -> test
	// 											  db			root				fatec -> test
	private String host = "127.0.0.1", database = "db", username = "root", password = "fatec";
	
	/*
	 *  FAZER:
	 *  	* ao inicilizar banco de dados, contar quantos ID existem. Atribuição de ID pelo programa.
	 */
	
	private int contadorEndereco = 0;
	
	public BancoMySQL() {
		/* Construtor Padrão */
	}
	
	/**
	 * 
	 * @param conectar
	 */
	public BancoMySQL( boolean conectar )
	{
		if ( !conectar )
		{
			//
			System.out.println("WARNING: BancoMySQL não foi conectado pelo construtor.");
		}
		else
		{
			boolean status = true;
			
			try {
				//Class.forName( "com.mysql.jdbc.Driver" );
				Class.forName( "com.mysql.cj.jdbc.Driver" );
				
				//										url , username , password
				//conexao = DriverManager.getConnection( "jdbc:mysql://" + host + "/" + database ,  username , password );
				
				// Neste momento, o useSSL não é necessário --><--
				// String url = "jdbc:mysql://" + host + "/" + database + "?useSSL=false"; 
				// --> http://www.guj.com.br/t/banco-de-dados-mysql-workbench/320374/8
				
				String url = "jdbc:mysql://" + host + "/" + database + "?useSSL=false&useTimezone=true&serverTimezone=UTC";
				
				// String url = "jdbc:mysql://" + host + ":3306/" + database + "?useSSL=false&useTimezone=true&serverTimezone=UTC";
				
				// --> useTimezone=true&serverTimezone=UTC
				conexao = DriverManager.getConnection( url ,  username , password );
				// NullPointerException quando tenta fechar a conexão
				
				
				
				
			}
			catch( ClassNotFoundException e )
			{
				e.printStackTrace();
				// Não achou o DRIVER
				status = false;
				
				//http://www.guj.com.br/t/resolvido-erro-fuso-horario-mysql/344446/2
					
			} catch (SQLException e) {
				e.printStackTrace();
				// Não Conseguiu conectar
				status = false;
				
				//http://www.guj.com.br/t/resolvido-erro-fuso-horario-mysql/344446/2
			}
			
			if (status)
				System.out.println("OK!");
		}
	}
	

	/**
	 * 
	 */
	public boolean abrirConexao()
	{
		boolean status = true;
		
		try {
			//Class.forName( "com.mysql.jdbc.Driver" );
			Class.forName( "com.mysql.cj.jdbc.Driver" );
			
			//										url , username , password
			conexao = DriverManager.getConnection( "jdbc:mysql://" + host + "/" + database ,  username , password );
			
		}
		catch( ClassNotFoundException e )
		{
			// Não achou o DRIVER
			status = false;
		} catch (SQLException e) {
			//e.printStackTrace();
			// Não Conseguiu conectar
			status = false;
		}
		
		return status;
	}
	
	public boolean abrirConexao( String ip , String senha )
	{
		return true;
	}
	
	public boolean abrirConexao( String nomeBanco , String login , String senha )
	{
		return true;
	}
	
	/**
	 * 		Já aponta para o primeiro resultado da consulta. 
	 */
	public boolean executarBusca( String sql )
	{
		boolean status = true;
		
		try {
			//stt = conexao.prepareStatement(sql );
			stt = conexao.createStatement();
			
			rs = stt.executeQuery( sql );
			
			
			status = true;
			
			if ( status )
				rs.next();
			
		} catch (SQLException e) {
			e.printStackTrace();
			status = false;
		}
		
		return status;

	}
	
	public ResultSet executarComando( String sql )
	{

		return rs;
	}
	
	public String buscarCampo( String campo )
	{
		try {
			return rs.getString( campo );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public int buscarCampo( int campo )
	{
		int retorno = 0;
		
		try {
			retorno = rs.getInt( campo );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}
	
	/**
	 * 
	 */
	public int quantidadeRetorno()
	{
		try {
			return stt.getUpdateCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public boolean proximaCedula()
	{
		try {
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean fecharConexao()
	{
		boolean status = true;
		
		try {
			if ( stt != null || rs != null )
			{
				;
			}
			else
			{
				if ( !stt.isClosed() )
					stt.close();
				if ( ! rs.isClosed() )
					rs.close();
			}
			conexao.close();
		}
		catch ( SQLException e )
		{
			status = false;
		}
		
		return status;
	}
	
	public Funcionario fazerLogin(String login, String senha) {
		
		Funcionario funcionario = null;
		
		try {
			
			//stt = conexao.createStatement();
			//rs = stt.executeQuery( "SELECT * FROM cliente WHERE cliente_nome = " + login );
			//PreparedStatement ps = conexao.prepareStatement("SELECT * FROM cliente where cliente_nome = " + login);
			//rs = ps.executeQuery();
			
			/*
			 * // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
                    .prepareStatement("insert into  feedback.comments values (default, ?, ?, ?, ? , ?, ?)");
            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
            // Parameters start with 1
            preparedStatement.setString(1, "Test");
            preparedStatement.setString(2, "TestEmail");
            preparedStatement.setString(3, "TestWebpage");
            preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
            preparedStatement.setString(5, "TestSummary");
            preparedStatement.setString(6, "TestComment");
            preparedStatement.executeUpdate();

            preparedStatement = connect
                    .prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from feedback.comments");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);
			 */
			
			//PreparedStatement ps = conexao.prepareStatement("SELECT * FROM cliente where cliente_nome = ?");
			PreparedStatement ps = conexao.prepareStatement( "SELECT * FROM usuario u INNER JOIN funcionario f INNER JOIN endereco e WHERE u.usuario_login = ? AND u.usuario_senha = ? AND f.end_id = e.end_id" );
			ps.setString(1, login);
			ps.setString(2, senha);
			
			rs = ps.executeQuery();
			//
			
			if ( rs.next() )
			{
				// Significa que eu encontrei alguma coisa
				//System.out.println(rs.getString("cliente_nome"));
				//System.out.println(rs.getString("funcionario_nome"));
				funcionario = new Funcionario( login , senha , buscarCampo("funcionario_nome") , buscarCampo("funcionario_telefone") ,
						buscarCampo("funcionario_email") , Integer.parseInt( buscarCampo("end_id") ) , buscarCampo("end_rua") , buscarCampo("end_bairro")
						, buscarCampo( "end_cidade" ) , buscarCampo( "end_estado" ) , buscarCampo( "end_observacoes" ) , buscarCampo( "end_numero" ) );
			}
			else
			{
				funcionario = null;
			}
			
			
		}
		catch ( SQLException e )
		{
			// Não foi possível conectar ou buscar os itens no Banco de Dados
			e.printStackTrace();
			funcionario = null;
		}
		
		return funcionario;
	}
	
	
	public boolean gravarCliente( Cliente cliente )
	{
		boolean status = true;
		
		try {
			/*
			stt = conexao.createStatement();
			
			rs = stt.executeQuery( "INSERT INTO endereco ( end_rua , end_bairro , end_cidade , end_estado , end_numero , end_observacoes ) VALUES ( "
					+ cliente.getEndereco().getRua() + " , " + cliente.getEndereco().getBairro() + " , "
					+ cliente.getEndereco().getCidade() + " , " + cliente.getEndereco().getEstado() + " , "
					+ cliente.getEndereco().getNumero() + " , " + cliente.getEndereco().getComplemento()
					+ " ) " );
			
			stt = conexao.createStatement();
			rs = stt.executeQuery( "INSERT INTO cliente ( cliente_nome , cliente_CNPJ , cliente_telefone , end_id ) VALUES ("
					+ cliente.getNome() + " , " + cliente.getCNPJ() + " , " + "CLIENTE SEM TELEFONE" + " , " + cliente.getEndereco().getId()
					+ ") " );
			*/
			
			PreparedStatement t = conexao.prepareStatement( "SELECT * FROM endereco" );
			rs = t.executeQuery();
			
			while( rs.next() )
			{
				contadorEndereco += 1;
			}
			
			
			PreparedStatement ps = conexao.prepareStatement( "INSERT INTO endereco ( end_rua , end_bairro , end_cidade , end_estado , end_numero , end_observacoes ) VALUES ( ? , ? , ? , ? , ? , ?) " );
			
			ps.setString( 1 , cliente.getEndereco().getRua() );
			ps.setString( 2 , cliente.getEndereco().getBairro() );
			ps.setString( 3 , cliente.getEndereco().getCidade() );
			ps.setString( 4 , cliente.getEndereco().getEstado() );
			ps.setString( 5 , cliente.getEndereco().getNumero() );
			ps.setString( 6 , cliente.getEndereco().getComplemento() );
			
			ps.executeUpdate(); // Executa a atualização no Banco De Dados
			
			
			
			ps = conexao.prepareStatement( "INSERT INTO cliente ( cliente_nome , cliente_CNPJ , cliente_telefone , end_id ) VALUES ( ? , ? , ? , ? ) " );
			
			ps.setString( 1 , cliente.getNome() );
			ps.setString( 2 , cliente.getCNPJ() );
			ps.setString( 3 , "CLIENTE SEM TELEFONE" );
			//ps.setString( 4 , String.valueOf( cliente.getEndereco().getId() ) );
			ps.setInt( 4 , contadorEndereco );
			
			ps.executeUpdate();
			
			status = true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			status = false;
		}
		
		
		
		return status;
	}
	
	
}
