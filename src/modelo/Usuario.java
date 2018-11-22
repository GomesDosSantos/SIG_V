package modelo;

public class Usuario {
	
	private String login , senha;

	// Construtores
	public Usuario() { /* Construtor Padrão */ }
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	// Gets e Sets
	public String getLogin() { return login; }

	public void setLogin(String login) { this.login = login; }

	public String getSenha() { return senha; }

	public void setSenha(String senha) { this.senha = senha; }

	
	
	public void login()
	{
		
	}
	
	public void login (String login , String senha )
	{
		
	}

	public void verificarEmail (String email)
	{
		
	}
	
	public void redefinirSenha ()
	{
		
	}
	
}
