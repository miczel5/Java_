package Matrix_.Matrix;

import java.util.Arrays;
/**
 * Test class to create simple 3 x 3 matrix with values for[1,9]
 * @author michal
 */
 class TestMatrix {
    public static void main(String[] args) {
        double[][] obj = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9} };
        Matrix A = new Matrix(obj);
        A.transpose(); 
    }
    
}

class Matrix {
    double[][] x; 
    /**
     * 
     * @param x set 2D array
     */
    Matrix(double[][]x){
        this.x = x;
    }
    /**
     * Return values of 3x3 matrix to check fill
     */
    void print(){
        for(int i=-1;i<x.length-1;System.out.println(Arrays.toString(x[++i])));
    }
    /**
     * Transpose method to change horizont with perpendiculary
     */
    void transpose(){
         double[][] tmp = new double[x.length][x[0].length];
         System.out.println(Arrays.toString(tmp[0]));
         for(int i=0;i<tmp.length;i++){
             for(int j=0;j<tmp[0].length;j++){
                 System.out.println("i:"+i+"// j:"+j+"\n");
                 System.out.println(x[i][j]);
                tmp[i][j]= x[j][i]; 
             }
         }
         x = tmp;
         
         this.print();
         
    }
}
        