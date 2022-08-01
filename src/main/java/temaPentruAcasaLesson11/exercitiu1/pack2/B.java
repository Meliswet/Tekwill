package temaPentruAcasaLesson11.exercitiu1.pack2;
import temaPentruAcasaLesson11.exercitiu1.pack1.A;
public class B {

    public String go(){
        return "Home";
    }

    String go1(){
        return "play";

    }

    private String go3(){
        return "run";
    }

    public static void main(String [] args){
        A a = new A();
        a.say();
        /* metodele say1 si say2 din Clasa A pack1 nu se v-or copila deoarece ele sunt metode default si
        private si respectiv sunt accesibile la nivel de packet si Clasa */
    }
}
