package modelo;

import java.util.Date;

public class Historico {
	
	private int id;
	private String observações;
	private Date data;

	
	public Historico(int id, String observações, Date data) {
		this.id = id;
		this.observações = observações;
		this.data = data;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getObservações() {
		return observações;
	}


	public void setObservações(String observações) {
		this.observações = observações;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	

}
