package modelo;

import java.util.Date;

public class Historico {
	
	private int id;
	private String observa��es;
	private Date data;

	
	public Historico(int id, String observa��es, Date data) {
		this.id = id;
		this.observa��es = observa��es;
		this.data = data;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getObserva��es() {
		return observa��es;
	}


	public void setObserva��es(String observa��es) {
		this.observa��es = observa��es;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	

}
