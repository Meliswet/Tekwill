/*Creati o metoda care primeste un array de int si returneaza suma tuturor elementelor
De ex. : Ii dau {1,2,3,4}, returneaza 10*/
package temaPentruAcasaLesson15.exercitiu2;


public class Array {
    public static int arraySum(int[] a){
        int sum=0;
        int j=a.length;
        for(int i=0; i<=j-1; i++){
            sum=sum+a[i];
        }
        return sum;

    }
}
