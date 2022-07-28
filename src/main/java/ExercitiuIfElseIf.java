/*Scrieti o clasa cu metoda main in ea. Definiti o variabila de tip numeric intreg. Daca valoare variabilei este un numar intreg par si mai mare ca 10, atunci printati mesajul "Numarul este par." Daca numarul este impar si mai mic de 15, atunci printati un mesaj "Numarul este impar". */

public class ExercitiuIfElseIf {
    public static void main (String[] args) {
        int a = 14;
        if (a == (int)a && a%2==0 && a>10) {
            System.out.println("numarul este par");
        }
        else if (a%2!=0 && a<15 ) {
            System.out.println("numarul este impar");
        }

    }
}
