/*Scrieti o clasa cu metoda main in ea. In main scrieti logica care calculeaza suma tuturor numerelor pina la un anumit numar.
De ex.: Suma tuturor numerelor pina la 5 este 15.*/
public class ExercitiuWhile {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (i <= 4) {
            sum += i++;
        }
        System.out.println(sum);
    }
}