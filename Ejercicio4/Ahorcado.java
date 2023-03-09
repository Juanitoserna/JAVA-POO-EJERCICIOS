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

        for(int i=0 ; i<this.palabra_clave.length() ; i++){
            palabras_acertadas[i] = '-';
        }
    } 

    public void imprimirTablero(){
        System.out.println("PALABRA SECRETA: ");
        for(int i=0 ; i<this.palabra_clave.length() ; i++){
            System.out.print(this.palabras_acertadas[i]);
        }
        System.out.println(" ");
    }

    public void marcarLetraEncontrada(char letra){
        for(int i=0 ; i<this.palabra_clave.length() ; i++){
            if(letra == this.palabra_clave.charAt(i)){
                this.palabras_acertadas[i] = letra;
            }
        }
    }

    public boolean letraEncontrada(char letra){
        for(int i=0 ; i<this.palabra_clave.length() ; i++){
            if(letra == this.palabra_clave.charAt(i)){
                return true;
            }
        }
        return false;
    }

    
    public void start(){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada_letra = new Scanner(System.in);

        System.out.println("-- JUEGO INICIADO --");
        System.out.println(" ");
        System.out.print("=> Ingrese La Cantidad De Intentos: ");
        this.cantidad_intentos = entrada.nextInt();

        int cont = 0;
        do{
            this.imprimirTablero();
            System.out.println("Ingrese una letra: ");
            char letra = entrada_letra.next().charAt(0);

            this.marcarLetraEncontrada(letra);

            if(this.letraEncontrada(letra) == true){
                this.imprimirTablero();
            }else{
                this.cantidad_intentos--;
            }
        }while(this.en_juego == true);
    }

    


    
}





    

