package models;

public class Municipio {

	private int id;
	private Provincia idProvincia;
	private int codMunicipio;
	private String nombre;
	
	/**
	 * 
	 */
	public Municipio() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Provincia getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Provincia idProvincia) {
		this.idProvincia = idProvincia;
	}

	public int getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(int codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Municipio [id=" + id + ", idProvincia=" + idProvincia + ", codMunicipio=" + codMunicipio + ", nombre="
				+ nombre + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
