import java.util.Scanner;

public class Ahorcado{
    private String palabra_clave;
    private String palabra_actual;
    private int cantidad_intentos;
    private boolean en_juego;
    private char palabras_acertadas[];

    public Ahorcado(){
        this.palabra_clave = "elefante";
        this.palabra_actual = "";
        this.cantidad_intentos = 0;
        this.en_juego = true;
        this.palabras_acertadas = new char [this.palabra_clave.length()];
    } 
    public void start(){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada_letra = new Scanner(System.in);

        System.out.println("-- JUEGO INICIADO --");
        System.out.println(" ");
        System.out.print("=> Ingrese La Cantidad De Intentos: ");
        this.cantidad_intentos = entrada.nextInt();
        
        System.out.println("PALABRA SECRETA: ");

        for(int i=0 ; i<this.palabra_clave.length() ; i++){
            System.out.print("- ");
        }
        
        int cont = 0;
        do{
            System.out.println("");
            System.out.println("Ingrese una letra: ");
            char letra = entrada_letra.next().charAt(0);

            for(int i=0 ; i<this.palabra_clave.length() ; i++){
                if(letra.equalsIgnoreCase(this.palabra_clave.charAt(i) == true) ){
                    this.palabras_acertadas[i] = letra;
                    System.out.println("palabra encontrada");
                }else{
                    System.out.println("La letra no existe");
                }
                
            }

        }while(this.en_juego == true);
    }

    


    
}





    

