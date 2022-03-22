
package Desarrollo;


public class Ejemplo1 {
    long carnet;
    String nombre,apellido;       
         
    public void registroEstudiante(){
        System.out.println("Mètodo para registrar estudiantes: ");
    }
    public void consultarEstudiante(){
        System.out.println("Mètodo para consultar estudiantes: ");
    
    }
    public void eliminarEstudiante(){
        System.out.println("Mètodo para eliminar estudiantes: ");
    }
    
    
    //METODO PRINCIPAL
        public static void main(String[] args) {
        Ejemplo1 est = new Ejemplo1();
        est.carnet = 1234;
        est.nombre = "Camelia";
        est.apellido = "La Tejana";
        
        est.registroEstudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        

        
            System.out.println("Carnet     : " + est.carnet);
            System.out.println("Nombre     : " + est.nombre);
            System.out.println("Apellido   : " + est.apellido);      
        
        }
    
}
