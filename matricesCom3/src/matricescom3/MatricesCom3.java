/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricescom3;

/**
 *
 * @author Admin
 */
public class MatricesCom3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int matriz[][]=new int[6][4];
         
         for (int i=0;i<matriz.length;i++){
             for(int j=0;j<matriz[i].length;j++){
                 matriz[i][j]=i+j;
                 System.out.println("Matriz fila "+i+" columna "+j+" elemento "+matriz[i][j]);
             }     
         
    }
    
}
}
