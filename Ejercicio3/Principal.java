import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {

		Scanner entrada_numero = new Scanner(System.in);
		Scanner entrada_texto = new Scanner(System.in);

		int opcion = 0;
		int pos_disponible = 0;
		Cliente arreglo [] = new Cliente [10];

		do{
			System.out.println("||--------------------------------------||");
			System.out.println("||-------------- PERSONAS --------------||");
			System.out.println("||--------------------------------------||");
			System.out.println("||             Cliente Registradas: "+((pos_disponible<10)? "0":"")+pos_disponible+"  ||");
			System.out.println("||                                  	||");
			System.out.println("||   1. Registrar Cliente.          	||");
			System.out.println("||   2. Ver lista Registrados.      	||");
			System.out.println("||   3. Modificar Informacion Cliente.  ||");
			System.out.println("||   4. Ver Informacion Cliente.        ||");
			System.out.println("||   5. Eliminar Cliente                ||");
			System.out.println("||   6. Salir                           ||");
			System.out.println("||                                      ||");
			System.out.println("||--------------------------------------||");
			System.out.print("||=> Ingrese una opcion: ");
			opcion = entrada_numero.nextInt();

			if (opcion == 1) {
				System.out.print("||=> Ingrese el documento: ");
				int documento = entrada_numero.nextInt();

				System.out.print("||=> Ingrese los nombres: ");
				String nombres = entrada_texto.nextLine();

				System.out.print("||=> Ingrese los apellidos: ");
				String apellidos = entrada_texto.nextLine();

				System.out.print("||=> Ingrese el telefono: ");
				String telefono = entrada_texto.nextLine();

				Cliente temporal = new Cliente(documento, nombres, apellidos, telefono);
				
				boolean valido = true;
				for (int i=0; i<pos_disponible; i++) {
					if (temporal.getDocumento() == arreglo[i].getDocumento()) {
						valido = false;
						System.out.println("||===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. \n\n");
						break;
					}
				}

				if (valido) {
					arreglo[pos_disponible] = temporal;
					pos_disponible++;
					System.out.println("||===> REGISTRADO CON EXITO \n\n");
				}

			}else if (opcion == 2) {
				for (int i=0; i<arreglo.length; i++) {
					if (arreglo[i]!=null) {
						arreglo[i].mostrarResumenDatos();
					}
				}
				System.out.println("\n\n");
			}else if (opcion == 3) {
				if(arreglo[0] == null){
					System.out.print("No Hay Ningun Cliente Registrado. ");
				}else{
					for (int i=0; i<arreglo.length; i++) {
						if (arreglo[i]!=null) {
							arreglo[i].mostrarResumenDatos();
						}
					}
					int new_documento = 0;
					System.out.print("-> Ingrese el documento que quiere cambiar: ");
					new_documento = entrada_numero.nextInt();
					int opcion2 = 0;
					int iterador = 0;
					int encontrado = 0;
					for(int i=0 ; i<pos_disponible ; i++){
						if(new_documento == arreglo[i].getDocumento()){
							encontrado = 1;
							iterador = i;
						}
						
					}
					if(encontrado != 1){
						System.out.println("-> El documeno ingresado no esta registrado. ");	
					}
					if(encontrado == 1){
						do{
							System.out.println("||--------------------------------------||");
							System.out.println("||---------- DATOS A CAMBIAR -----------||");
							System.out.println("||--------------------------------------||");
							System.out.println("||                                  	||");
							System.out.println("||   1. Cambiar Nombre.             	||");
							System.out.println("||   2. Cambiar Apellido.               ||");
							System.out.println("||   3. Cambiar No De Celular.          ||");
							System.out.println("||   4. Salir.                          ||");
							System.out.println("||                                  	||");
							System.out.println("||--------------------------------------||");
							System.out.print("||=> Ingrese una opcion: ");
							opcion2 = entrada_numero.nextInt();
							
							if(opcion2 == 1){
								
								System.out.println("Ingres El Nuevo Nombre: ");
								String new_nombre = entrada_texto.nextLine();
								arreglo[iterador].setNombres(new_nombre);
							}
							if(opcion2 == 2){
								System.out.println("Ingres El Nuevo Apellido: ");
								String new_apellido = entrada_texto.nextLine();
								arreglo[iterador].setApellidos(new_apellido);
							}
							// if(opcion2 == 3){
							// 	System.out.println("Ingres El Nuevo No De Celular: ");
							// 	int new_celular = entrada_numero.nextInt();
							// 	arreglo[iterador].setTelefono(new_celular);
							// }
							if(opcion2 == 4){
								System.out.println("---------------------------------");
								System.out.println("--------     SALIENDO     -------");
								System.out.println("---------------------------------");
								System.out.println("\n\n");
							}

								
						}while(opcion2 != 4);
					}
				}
				
			}else if(opcion == 4){
				if(arreglo[0] == null){
					System.out.print("No Hay Ningun Cliente Registrado. ");
				}else{
					for (int i=0; i<arreglo.length; i++) {
						if (arreglo[i]!=null) {
							arreglo[i].mostrarResumenDatos();
						}
					}
				}
				int new_documento = 0;
				System.out.print("-> Ingrese el documento que quiere buscar: ");
				new_documento = entrada_numero.nextInt();
				int iterador = 0;
				int encontrado = 0;
				for(int i=0 ; i<pos_disponible ; i++){
					if(new_documento == arreglo[i].getDocumento()){
						encontrado = 1;
						iterador = i;
					}
						
				}
				if(encontrado != 1){
					System.out.println("-> El documeno ingresado no esta registrado. ");	
				}
				if(encontrado == 1){
					System.out.println("\n\n");
					System.out.println("Estos son los datos de la persona buscada: ");
					arreglo[iterador].mostrarResumenDatos();
					System.out.println("\n\n");
				}
			}else if(opcion == 5){
				if(arreglo[0] == null){
					System.out.print("No Hay Ningun Cliente Registrado. ");
				}else{
					for (int i=0; i<arreglo.length; i++) {
						if (arreglo[i]!=null) {
							arreglo[i].mostrarResumenDatos();
						}
					}
				}
				//
				int new_documento = 0;
				System.out.print("-> Ingrese el documento que quiere eliminar: ");
				new_documento = entrada_numero.nextInt();
				int iterador = 0;
				int encontrado = 0;
				for(int i=0 ; i<pos_disponible ; i++){
					if(new_documento == arreglo[i].getDocumento()){
						encontrado = 1;
						iterador = i;
					}
						
				}
				if(encontrado != 1){
					System.out.println("-> El documeno ingresado no esta registrado. ");	
				}
				if(encontrado == 1){
					for (int i=0; i<pos_disponible-1; i++) {
						
						if ( arreglo[iterador]!=null) {
							arreglo[iterador] = arreglo[i+1];
							arreglo[i+1] = null;
							pos_disponible--;
						} 
						
						
					} 
					
				}
				
			}else if (opcion == 6) {
				System.out.println("|| ============ SALIENDO ===========||");
			}else{
				System.out.println("||----------------------------------||");
				System.out.println("|| ========= OPCION INVALIDA =======||");
				System.out.println("||----------------------------------||");
			}

		}while(opcion!=6);

	}
}





//for (int i=0; i<arreglo.length; i++) {
// 	for (int j=0; j<arreglo.length-1; j++) {
// 		if ( arreglo[j]!=null && arreglo[j+1]!=null) {
// 			if ( arreglo[j].getNombres().compareToIgnoreCase(arreglo[j+1].getNombres()) > 0 ) {
// 				Cliente aux = arreglo[j];
// 				arreglo[j] = arreglo[j+1];
// 				arreglo[j+1] = aux;
// 			}
// 		}
// 	}
// }