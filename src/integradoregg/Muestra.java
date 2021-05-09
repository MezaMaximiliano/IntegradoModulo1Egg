
package integradoregg;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Muestra {
    
    private String muestra;
    private int dim;
    private char matrix[][] = new char[dim][dim];
    
    public Muestra(){
        Scanner entrada = new Scanner(System.in);
        int z=0;
        System.out.println("INGRESE LA MUESTRA: ");
        this.muestra=entrada.nextLine();
        do{
            System.out.println("LA MUESTRA NO ES VALIDA. INTENTE OTRA VEZ.");
            System.out.println("INGRESE LA MUESTRA: ");
            this.muestra=entrada.nextLine();
        }while (!validar(muestra));
        
        this.dim=(int) Math.sqrt(muestra.length());
        char mAux[][]= new char [this.dim][this.dim];
        
        for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
                mAux[i][j]=muestra.charAt(z);
                z++;
            }
        }
        
        this.matrix=mAux;  
    }
    
    private boolean validar(String cad){
        boolean rta=(validarDimension(cad) && validarBases(cad));
        return rta;
    }
    
    private boolean validarDimension(String cad){
        
        boolean rta; double longitud = Math.sqrt(cad.length());
        rta=(longitud==3 || longitud==4 || longitud ==37);
        return rta;
    }
    
    private boolean validarBases(String cad){
        boolean rta=true; char base;
        for(int i = 0;i<cad.length();i++){
            base=cad.charAt(i);
            if(base!='A' && base!='B' && base!='C' && base!='D'){
                rta=false;
            }
        }
         
        
        return rta;
    }

    public char[][] getMatrix() {
        return matrix;
    }
    
    public void mostrar(char [][] matrix){
        for(int i=0;i<this.dim;i++){
            for(int j =0;j<dim;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
