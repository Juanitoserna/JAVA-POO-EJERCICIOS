import java.util.Scanner;

public class Ahorcado{
    private String palabra_clave;
    private int cantidad_intentos;
    private String nueva_palabra;
    private boolean en_juego;
    private char palabras_acertadas[];

    public Ahorcado(){
        this.palabra_clave = "elefante";
        this.cantidad_intentos = 0;
        this.nueva_palabra = "";
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
                this.nueva_palabra = String.valueOf(this.palabras_acertadas[i]);

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
    // public boolean perdedor(){
    //     if(this.cantidad_intentos == 0){
    //         System.out.print("==> EL JUEGO A TERMINADO <==");
    //         return this.en_juego = false;
    //     }
    // }
    // public boolean ganador(){
        
    //     for(int i=0 ; i<this.palabra_clave.length() ; i++){
    //         if(this.cantidad_intentos > 0){
    //             if(this.palabra_clave.charAt(i) != '-' ){
    //                 return true;
    //             }else{
    //                 return false;
    //             }
    //         }
            
    //     }
        
    // }
    
    
    public void start(){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada_letra = new Scanner(System.in);

        System.out.println("-- JUEGO INICIADO --");
        System.out.print("=> Ingrese La Cantidad De Intentos: ");
        this.cantidad_intentos = entrada.nextInt();

        int cont = 0;
        do{
            int cont_2 = 0;
            this.imprimirTablero();
            System.out.println("Ingrese una letra: ");
            char letra = entrada_letra.next().charAt(0);

            this.marcarLetraEncontrada(letra);

            if(this.letraEncontrada(letra) == true){
                this.imprimirTablero();
            }else{
                this.cantidad_intentos--;
            }
            
            if(this.cantidad_intentos == 0){
                System.out.println("==> EL JUEGO A TERMINADO <==");
                System.out.print("==> SUS INTENTOS HAN TERMINADO.");
                this.en_juego = false;
            }
            
            
            if(this.palabra_clave.compareToIgnoreCase(this.nueva_palabra) == 0 && this.cantidad_intentos > 0){
                System.out.print("=> FELICIDADES USTED GANO <=");
                this.en_juego = false;
            }
                
            

            

            // this.perdedor(); 
            // if(this.ganador() == true){
            //     System.out.print("=> FELICIDADES USTED GANO <=");
            //     this.en_juego = false;
            // }
            
        }while(this.en_juego == true);
    }

    


    
}





    

