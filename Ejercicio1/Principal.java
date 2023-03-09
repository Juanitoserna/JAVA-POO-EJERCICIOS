import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_caracteres = new Scanner(System.in);
        int opcion = 0;
        int pos_actual = 0;
        int acum = 0;
        Persona lista[] = new Persona[10];

        while(opcion != 4){
            System.out.println("||-----------------------------------||");
            System.out.println("||---           PERSONA           ---||");
            System.out.println("||-----------------------------------||");
            System.out.println("||            Personas registradas:"+(acum)+acum+"||");
            System.out.println("||                                   ||");
            System.out.println("|| 1.Registrar Persona               ||");
            System.out.println("|| 2.Ver Lista De Persona            ||");
            System.out.println("|| 3.Ordenar Lista Person            ||");
            System.out.println("|| 4.Salir                           ||");
            System.out.println("||-----------------------------------||");
            opcion = entrada_numero.nextInt();

            if(opcion == 1){
                System.out.print("Ingrese su documento: ");
                int documento = entrada_numero.nextInt();
                System.out.print("Ingrese su nombre: ");
                String nombre = entrada_caracteres.nextLine();
                System.out.print("Ingrese su apellido: ");
                String apellido = entrada_caracteres.nextLine();
                System.out.print("Ingrese su direccion: ");
                String direccion = entrada_caracteres.nextLine();
                System.out.print("Ingrese su telefono: ");
                int telefono = entrada_numero.nextInt();
                System.out.print("Ingrese su email: ");
                String email = entrada_caracteres.nextLine();

                Persona temporal = new Persona(documento,nombre,apellido,direccion,telefono,email);
                lista[pos_actual] = temporal ;
                pos_actual++;
                acum++;
            }else if(opcion == 2 ){
                for(int i=0 ; i<pos_actual ; i++){
                    if(lista[i] != null){
                        lista[i].imprimirCarta();
                    }else{
                        System.out.println("La posicion "+i+" de la lista esta vacia. ");
                    }
                }
            }else if(opcion == 3){
                for(int i=0 ; i<pos_actual ; i++){
                    for(int j=0 ;j<pos_actual-1 ; j++){
                        if(lista[j]!=null && lista[j+1]!=null){
                            if(lista[j].getnombre().compareToIgnoreCase(lista[j+1].getnombre()) > 0){
                                Persona aux = lista[j];
                                lista[j] = lista[j+1];
                                lista[j+1] = aux;
                            }
                        }
                    }
                }
                
            }else if(opcion == 4){
                System.out.print("|--- SALIENDO ---|");
                opcion = 4;
            }
            
            
        }
    }
}