package temaPentruAcasaLesson11.exercitiu1.pack1;
import  temaPentruAcasaLesson11.exercitiu1.pack3.C;
public class A {

    public void say(){
        System.out.println("Hello");
    }
    void say1(){
        System.out.println("Good Morning");
    }
    private void say3(){
        System.out.println("Bye");
    }

    public static void main(String[] args){
        C c=new C();
        c.count( 2);
    }
}   /* metodele count1 si Count2 din Clasa C pack3 nu se v-or copila deoarece ele sunt metode default si
        private si respectiv sunt accesibile la nivel pachet si la nivel de Clasa*/

