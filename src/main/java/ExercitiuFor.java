/*Scrieti o clasa cu metoda main in ea. In main scrieti logica care calculeaza suma tuturor numerelor pina la un anumit numar.
De ex.: Suma tuturor numerelor pina la 5 este 15.*/

public class ExercitiuFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
