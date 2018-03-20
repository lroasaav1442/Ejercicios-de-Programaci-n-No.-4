import java.util.Scanner;
class pendulo {
	private double longtudCuerda;
	private double AceleraGravitacional;

	//Constructor 
	public pendulo(double l, double g){

		this.longtudCuerda = l;
		this.AceleraGravitacional = g;
		}

	public double DarLongitudCuerda(){
		return longtudCuerda;
		}
	public double DarAcelaracionGravita(){
		return AceleraGravitacional;
		}
	public double periodo(){
		return 2 * Math.PI * Math.sqrt(AceleraGravitacional / longtudCuerda);
		}

	//Programa principal
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	pendulo p = null;
	double l, g;
	int opcion = 0;

	do{
		System.out.println("Menu \n1. Crear el pendulo");
		System.out.println("2. Conocer la longitud de la cuerda del pendulo");
		System.out.println("3. Conocer la acelaracion gravitacional del pendulo");
		System.out.println("4. Conocer el periodo del pendulo");
		System.out.println("5. Salir");
		System.out.println("Cual opcion deseas? ");
		opcion = teclado.nextInt();

		switch (opcion) {
			case 1:
				System.out.println("Ingrese la longitud de la cuerda del pendulo: ");
				l = teclado.nextDouble();
				System.out.println("Ingrese la acelaracion gravitacional: ");
				g = teclado.nextDouble();

				p = new pendulo(l, g);
				System.out.println("Pendulo creado de manera sastifactoria. ");
				break;
			case 2:
				System.out.println("La longitud de la cuerda = " + p.DarLongitudCuerda());
				break;
			case 3:
				System.out.println("Aceleracion gravitacional =" + p.DarAcelaracionGravita());
				break;
			case 4:
				System.out.println("Periodo del pendulo = " + p.periodo());
				break;
			}
		} while (opcion != 5);

		System.out.println("Adios!!");
	}
}