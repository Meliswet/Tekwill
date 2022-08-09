/*Creati o metoda care primeste un array de int, si un parametru de tip int.
 Metoda trebuie sa returneze indexul elementului din array sub care se afla valoarea argumentului transmis.
  Daca asa element nu exista in array, sa returneze -1;
De ex. daca ii dau metodei un un arr {1,2,3,4,5} si argumentul 4, metoda trebuie sa-mi returneze 3;
 Daca ii dau ca argument 100, sa-mi returneze -1;*/

package temaPentruAcasaLesson15.exercitiu1;

public class Array {
    public static int findNumber(int[] a, int y){
        int j=a.length;
        for(int i=0; i<j; i++){
            if(a[i]==y){
                return i;
            }
        }
        return -1;
    }

}
