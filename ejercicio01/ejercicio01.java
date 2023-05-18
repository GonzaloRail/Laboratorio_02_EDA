package ejercicio01;
public class ejercicio01 {

    public static void main(String[] args) {
        int[] A={1,2,3};
        invertirArray(A);
        
    }
    public static int[] invertirArray(int[] A){
        /** */
        //Procedimiento para invertir la matriz
        int inicio = 0;
        int fin = A.length - 1;
        int[] Ain=new int[A.length];
        for(int i=0;i<A.length;i++){
            Ain[inicio] = A[fin];
            inicio++;
            fin--;
        }
        
        /** */
        return Ain;
    }
    
    
    
    
}