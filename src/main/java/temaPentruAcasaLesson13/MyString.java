/*Pentru acasa construiti o metoda care primeste un String ca rezultat final il
 returneaza inversat.
  Folositi doar metode din clasa String, fara a folosi StringBuilder sau StringBuffer.*/

package temaPentruAcasaLesson13;

public class MyString {

    public static String reverse(String stringName){
        String result="";
        for(int i=(stringName.length())-1; i>=0; i--){
            result=result+stringName.charAt(i);
        }
        return result;
    }

}