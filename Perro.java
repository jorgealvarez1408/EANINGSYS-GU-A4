
public class Perro {

	private String nombre;
	private String raza;
	private String localidad;
	private String cedula;
	private String propietario;
	private String telefono;
	private String diaAsistencia;
	
	
	
	public Perro(String nombre, String raza, String localidad, String cedula,
			String propietario, String telefono, String diaAsistencia) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.localidad = localidad;
		this.cedula = cedula;
		this.propietario = propietario;
		this.telefono = telefono;
		this.diaAsistencia = diaAsistencia;
	}
	
	public Perro(){
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDiaAsistencia() {
		return diaAsistencia;
	}
	public void setDiaAsistencia(String diaAsistencia) {
		this.diaAsistencia = diaAsistencia;
	}
	
	
}
