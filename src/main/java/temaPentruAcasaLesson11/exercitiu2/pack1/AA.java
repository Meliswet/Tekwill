/* Construiti o clasa si in ea sa aveti o metoda publica care cheama in ea alte 2 metode private.
Apoi din afara pachetului accesati metoda publica.*/
package temaPentruAcasaLesson11.exercitiu2.pack1;

public class AA {

    public void metodaDeBaza(){
        metodaAjutatoare();
        metodaAjutatoare1();

    }

    private void metodaAjutatoare(){
        System.out.println("Cat");
    }
    private void metodaAjutatoare1(){
        System.out.println("Dog");
    }

}
