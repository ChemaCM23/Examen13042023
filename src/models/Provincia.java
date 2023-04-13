package models;

public class Provincia {

	private int id;
	private String provincia;
	
	
	public Provincia() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	@Override
	public String toString() {
		return provincia;
	}
	
	
}
