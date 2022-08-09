/*Creati o metoda care primeste un arr de int, si returneaza ul alt array doar cu elementele pare
 din primul array
De ex. {1,2,3,4,5,6}, va returna {2,4,6}*/
package temaPentruAcasaLesson15.exercitiu3;
import static temaPentruAcasaLesson15.exercitiu3.Array.getEven;

public class   TestArray {

        public static void main(String[] args){

            System.out.println( getEven( new int[] {1, 2, 3, 4, 5 } )[0] );

            int[] arr=getEven( new int[] {1, 2, 3, 4, 5 } );
            for(int i=0; i<=arr.length-1; i++){
                System.out.print(arr[i]);
                System.out.print(" ");

        }
    }
}
