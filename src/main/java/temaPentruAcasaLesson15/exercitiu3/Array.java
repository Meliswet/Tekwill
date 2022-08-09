/*Creati o metoda care primeste un arr de int, si returneaza un alt array doar cu elementele pare
din primul array
De ex. {1,2,3,4,5,6}, va returna {2,4,6}*/
package temaPentruAcasaLesson15.exercitiu3;


public class Array {
    public static int[] getEven(int[] a){
        int n=a.length;
        int countEven=0;

        for(int i=0; i<=n-1; i++){
            if( (a[i]%2)==0 ){
                countEven++;
            }
        }

        int[] res=new int[countEven];

        int j=0; //index for res

        for(int i=0; i<=n-1; i++){
            if( (a[i]%2)==0 ){
                res[j]=a[i];
                j++;
            }
        }

        return res;
    }


}