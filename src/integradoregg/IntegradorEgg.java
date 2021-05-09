
package integradoregg;

/**
 *
 * @author Maxi
 */
public class IntegradorEgg {

   
    public static void main(String[] args) {
        Muestra muestra1 = new Muestra();
        
        muestra1.mostrar();
        
        if (muestra1.verificarGenZ()){
            System.out.println("GEN ENCONTRADO.");
        }else{
            System.out.println("GEN NO ENCONTRADO");
        }
    }
    
}
