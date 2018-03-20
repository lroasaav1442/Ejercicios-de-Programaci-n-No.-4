package ascensor4;
import java.util.Scanner;

public class ascensor4 {
	
	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		int opciones=0, N_P=1, D_E_A, N_S=0, A_IR, S_P, to_Tal;
		
	do{	
		System.out.println("1. Crear base de datos ascensor: ");
		System.out.println("2. conocer cual sera el siguiente piso: ");
		System.out.println("3. Conocer cual sera el siguiente piso si desciende un piso: ");
		System.out.println("4. Conocer cuantos pisos puede atender el ascensor: ");
		System.out.println("5. Para salir");
		opciones = tecla.nextInt();
		
		switch(opciones) {
		case 1:
			// método que determine cuál es sería el siguiente piso
			System.out.println("Ingrese numero de pisos que tiene el edificio: ");
			N_P = tecla.nextInt();
			//restriccion
			while (N_P <=-1 ) {
				System.out.println("Error no puedes poner un numero negativo. ");
				System.out.println("\nIngrese el numero de pisos que tiene el edificio: ");
				N_P = tecla.nextInt();
			}
			//restriccion
			while (N_P ==0 ) {
				System.out.println("Error no puedes poner 0 numero de pisos vuelve a intentarlo. ");
				System.out.println("\nIngrese el numero de pisos que tiene el edificio: ");
				N_P = tecla.nextInt();
			}
			System.out.println("\nIngrese el numero de sotanos que tiene el edificio: "+"Por favor si no hay sotanos ponga 0");
			N_S = tecla.nextInt();
			//restriccion

			while (N_P < 1 || N_S > N_P ) {
				System.out.println("Error no puedes poner mas sotanos que numero de pisos. ");
				
				System.out.println("\nIngrese el numero de sotanos que tiene el edificio: ");
				N_S = tecla.nextInt();
			}
			//restriccion
			while (N_S <=-1 ) {
				System.out.println("Error no puedes poner un numero negativo. ");
				System.out.println("\nIngrese el numero de sotanos que tiene el edificio: ");
				N_P = tecla.nextInt();
			}
			System.out.println("Creado correctamente");
			break;
		case 2:
			//determinar cuál es sería el siguiente piso
			System.out.println("Ingrese al piso que quiere ir: ");
			A_IR = tecla.nextInt();
			while (A_IR > N_P ) {
				System.out.println("Error no puedes ir no hay tantos pisos, "+"el piso que quieres ir es el "+A_IR+" y solo hay "+N_P+" pisos en el edificio. ");
				System.out.println("\nIngrese el numero de piso que quiere ir: ");
				A_IR = tecla.nextInt();
			}
			//restriccion
			while(A_IR ==0) {
				System.out.println("Error no hay piso 0. ");
				System.out.println("\nIngrese el numero de piso que quiere ir: ");
				A_IR = tecla.nextInt();
			}
			//restriccion
			if(A_IR ==-1) {
				A_IR = A_IR +1; 
			}
			System.out.println("\nEL siguiente piso sera: "+(A_IR +1));
			break;
		case 3:
			//determinar cuál es sería el siguiente piso si desciende
			System.out.println("Ingrese al piso que quiere ir: ");
			A_IR = tecla.nextInt();
			while (A_IR > N_P ) {
				System.out.println("Error no puedes ir no hay tantos pisos, "+"el piso que quieres ir es el "+A_IR+" y solo hay "+N_P+" pisos en el edificio. ");
				System.out.println("\nIngrese el numero de piso que quiere ir: ");
				A_IR = tecla.nextInt();
			}
			//restriccion
			while(A_IR ==0) {
				System.out.println("Error no hay piso 0");
				System.out.println("\nIngrese el numero de piso que quiere ir: ");
				A_IR = tecla.nextInt();
			}
			System.out.println("\nEL siguiente piso sera: "+(A_IR -1));
			break;
		
		case 4:
			//Cuantos pisos puede atender el ascensor
			to_Tal = N_S + N_P;
			System.out.println("El numero de pisos que puede atender el ascensor es de "+to_Tal);
		}
	} while (opciones != 5);
  }	
}