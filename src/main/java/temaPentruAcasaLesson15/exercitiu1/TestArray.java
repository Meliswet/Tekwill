/*Creati o metoda care primeste un array de int, si un parametru de tip int.
 Metoda trebuie sa returneze indexul elementului din array sub care se afla valoarea argumentului transmis.
  Daca asa element nu exista in array, sa returneze -1;
De ex. daca ii dau metodei un un arr {1,2,3,4,5} si argumentul 4, metoda trebuie sa-mi returneze 3;
 Daca ii dau ca argument 100, sa-mi returneze -1;*/
package temaPentruAcasaLesson15.exercitiu1;

import static temaPentruAcasaLesson15.exercitiu1.Array.findNumber;
import static temaPentruAcasaLesson15.exercitiu2.Array.arraySum;

public class TestArray {

    public static void main(String[] args){

        System.out.println(findNumber( new int[] {1, 2, 3, 4, 5 }, 4) );


    }

}