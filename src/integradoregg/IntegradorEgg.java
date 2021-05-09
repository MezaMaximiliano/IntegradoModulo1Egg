
package integradoregg;

/**
 *
 * @author Maxi
 */
public class IntegradorEgg {

   
    public static void main(String[] args) {
        Muestra muestra1 = new Muestra("AAAAAAAA");
               
        if (muestra1.validar(muestra1.getMuestra())){
            muestra1.mostrar();
            if (muestra1.verificarGenZ()){
                System.out.println("GEN ENCONTRADO");
            }else{
                System.out.println("GEN NO ENCONTRADO");
            }
        }else{
            System.out.println("LA MUESTRA 1 NO ES VALIDA. NO PUEDE SER ANALIZADA.");
            System.out.println("DEBE INGRESAR OTRA MUESTRA.");
        }
        
        Muestra muestraDos = new Muestra();
        muestraDos.mostrar();
        
        if (muestraDos.verificarGenZ()){
            System.out.println("LA MUESTRA DOS ESTA INFECTADA CON EL GEN Z.");
        }else
            System.out.println("LA MUESTA DOS ESTA LIMPIA.");
    }
    
}
