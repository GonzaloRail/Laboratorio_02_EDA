public class ejercicio2 {
    public static void main(String[] args){

        int a[]={1,2,3,4,5};
        System.out.println(a+"\n");
        a=rotarIzq(a,2);
        System.out.println(a);

       
    }

    public static int[] rotarIzq(int[] a, int d){
        int ind=d%a.length;
        int a2[]= new int[a.length];

        System.arraycopy(a, ind, a2,0, a.length-ind);

        System.arraycopy(a, 0, a2,a.length-ind , ind);




        return a2;
    }
}
