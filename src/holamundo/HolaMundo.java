/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author tambo
 */
public class HolaMundo {
 
    /**
     * @param args the command line arguments
     */
    private static final int CASO_1 = 1;
    private static final int CASO_2 = 2;
    static int opcion = 1;
    
    public static void printOpcionUno(){
        System.out.println("Opcion 1");
    }
    
    
    public static void printOpcionDos(){
        System.out.println("Opcion 2");
    }
    
    public static void switchOpcionElegida(){
        switch(opcion){
            case CASO_1:
                printOpcionUno();
                break;
            case CASO_2:
                printOpcionDos();
                break;
            default:
                System.out.println("Opcion no encontrada");
        }
    }
    
    public static void main(String[] args) {
        
        switchOpcionElegida();
    }
    
}
