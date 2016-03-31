import java.util.Scanner;


public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		String nombre,raza,localidad="",cedula,propietario,telefono,diaAsistencia;
				Colegio c=new Colegio();
		int opt=-1,k;
		while(opt!=4){
			
			System.out.println("1. Ingresar Perro");
			System.out.println("2. Imprimir Perros");
			System.out.println("3. Imprimir por localidad");
			System.out.println("4. Salir");
			System.out.println("Seleccione una opcion");
			
			opt=Integer.parseInt(scan.nextLine());
			
			
			switch (opt) {
				case 1:
					System.out.println("Digite el nombre del perro: ");
					nombre=scan.nextLine();
					System.out.println("Digite la raza del perro: ");
					raza=scan.nextLine();
					System.out.println("Digite la localidad del perro: ");
					System.out.println("1. Teusaquillo");
					System.out.println("2. Suba");
					System.out.println("3. Usaquen");
					System.out.println("4. Chapinero");
					k=Integer.parseInt(scan.nextLine());
					
					switch (k) {
						case 1:
							localidad="Teusaquillo";
							break;
						case 2:
							localidad="Suba";
							break;
						case 3:
							localidad="Usaquen";
							break;
						case 4:
							localidad="Chapinero";
							break;
					}
					
					System.out.println("Digite el propietario del perro: ");
					propietario=scan.nextLine();
					System.out.println("Digite la cedula del propietario: ");
					cedula=scan.nextLine();
					System.out.println("Digite el Telefono: ");
					telefono=scan.nextLine();
					System.out.println("Digite el dia de Asistencia: ");
					diaAsistencia=scan.nextLine();
					Perro p = new Perro(nombre, raza, localidad, cedula, propietario, telefono, diaAsistencia);
					c.agregarPerro(p);
					break;
					case 2:
						c.imprimir();
						break;
						
					case 3:
						System.out.println("Digite la localidad de la que desea ver los perros: \n");
						System.out.println("1. Teusaquillo");
						System.out.println("2. Suba");
						System.out.println("3. Usaquen");
						System.out.println("4. Chapinero");
						k=Integer.parseInt(scan.nextLine());
						
						switch (k) {
							case 1:
								localidad="Teusaquillo";
								break;
							case 2:
								localidad="Suba";
								break;
							case 3:
								localidad="Usaquen";
								break;
							case 4:
								localidad="Chapinero";
								break;
						}
						c.imprimirLocalidad(localidad);
						break;

			default:
				break;
			}
		}
		
		
		

	}

}
