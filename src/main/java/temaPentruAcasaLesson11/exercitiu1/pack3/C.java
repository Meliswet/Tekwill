package temaPentruAcasaLesson11.exercitiu1.pack3;
import org.w3c.dom.ls.LSOutput;
import temaPentruAcasaLesson11.exercitiu1.pack2.B;
public class C {
    public int count(int someint){
        System.out.println(someint);
        return(someint);
    }

    int count1(int someint1){
        return someint1;
    }

    private int count2(int someint2){
        return someint2;
    }

    public static void main(String[] args) {
        B b = new B();
        b.go();
        String result=b.go();
        System.out.println(result);
        /* metodele go1 si go2 din Clasa B pack2 nu se v-or copila deoarece ele sunt metode default si
        private si respectiv sunt accesibile la nivel de packet si Clasa */
    }

}
