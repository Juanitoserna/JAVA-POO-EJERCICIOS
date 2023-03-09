public class Persona{

    //Atributos 
    int documento;
    String nombre;
    String apellido;
    String direccion;
    int telefono;
    String email;

    //metodos: 
    public Persona(int documento,String nombre,String apellido,String direccion,int telefono,String email){
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
    //para mandar esta variable afuera o para cuando me pidan el peso
    public int getDocumento(){
        return this.documento;
    }
    public String getnombre(){
        return this.nombre;
    }
    public String getapellido(){
        return this.apellido;
    }
    public String getdireccion(){
        return this.direccion;
    }
    public int gettelefono(){
        return this.telefono;
    }
    public String getemail(){
        return this.email;
    }
    //este sirve para modificar la variable 
    public void setDocumento(int new_documento){
        this.documento = new_documento;
    }
    public void setNombre(String new_nombre){
        this.nombre = new_nombre;
    }
    public void setApellido(String new_apellido){
        this.apellido = new_apellido;
    }
    public void setDireccion(String new_direccion){
        this.direccion = new_direccion;
    }
    public void setTelefono(int new_telefono){
        this.telefono = new_telefono;
    }
    public void setEmail(String new_email){
        this.email = new_email;
    }
    //_-----------------------------------------
    public void imprimirCarta(){
       
        System.out.println("--------------------------------------");
        System.out.println("|  Documento: " + this.documento);
        System.out.println("|  Nombre: " + this.nombre);
        System.out.println("|  Apellido: " + this.apellido);
        System.out.println("--------------------------------------");
    }

}