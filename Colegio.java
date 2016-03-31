
public class Colegio {
	
	private Perro[] perros;
	private int cantidad;
	
	public Colegio(){
		perros=new Perro[100];
		cantidad=0;
	}

	public Colegio(Perro[] perros, int cantidad) {
		super();
		this.perros = perros;
		this.cantidad = cantidad;
	}
	
	public void imprimir(){
		
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("---------------------------------------");
			System.out.println("Nombre: "+perros[i].getNombre());
			System.out.println("Localidad: "+perros[i].getLocalidad());
			System.out.println("Raza: "+perros[i].getRaza());
			System.out.println("Propietario: "+perros[i].getPropietario());
			System.out.println("Cedula: "+perros[i].getCedula());
			System.out.println("Telefono: "+perros[i].getTelefono());
			System.out.println("Dia asistencia: "+perros[i].getDiaAsistencia());
			System.out.println("---------------------------------------");
		}
	}
	
	public void agregarPerro(Perro p){
		
		perros[cantidad]=p;
		cantidad++;
	}
	
	public void imprimirLocalidad(String l){
		for (int i = 0; i < cantidad; i++) {
			if(perros[i].getLocalidad().equals(l)){
				System.out.println("---------------------------------------");
				System.out.println("Nombre: "+perros[i].getNombre());
				System.out.println("Localidad: "+perros[i].getLocalidad());
				System.out.println("Raza: "+perros[i].getRaza());
				System.out.println("Propietario: "+perros[i].getPropietario());
				System.out.println("Cedula: "+perros[i].getCedula());
				System.out.println("Telefono: "+perros[i].getTelefono());
				System.out.println("Dia asistencia: "+perros[i].getDiaAsistencia());
				System.out.println("---------------------------------------");
			}
		}
	}

	public Perro[] getPerros() {
		return perros;
	}

	public void setPerros(Perro[] perros) {
		this.perros = perros;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
