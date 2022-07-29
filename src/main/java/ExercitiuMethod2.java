public class ExercitiuMethod2 {
    /*  Metoda 1.Creati o metoda care calculeaza si afiseaza suma tuturor numerelor
    de la 0< n (n sa fie dinamic: ca argument). De ex. n=6 - suma pina la 6 este 15  */
    public void countSum(int n) {
        int sum=0;
        for (int i = 0; i <n; i++) {
            sum += i;

        }
        System.out.println(sum);
    }

     /*  Metoda 2. Creati o metoda care afiseaza toate cifrele pare pina la un nr n
    (n sa fie dinamic: ca argument). De ex. n=6, cifrele pare pina la 6 sunt 0,2,4  */
    public void showEvenNumbers (int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
            System.out.println(i);
            }
        }
    }
    //  Metoda 3 Creati o metoda care afiseaza la ecran "Hello" de 10 ori
    public void say(String S1){
        String sayHello=S1;
        for (int i=0;i<10;i++){
            System.out.println(sayHello);
            }
        }
    /*Creati o metoda care afiseaza toate cifrele impare pina la un nr n
    (n sa fie dinamic: ca argument). De ex. n=6,cifrele pare pina la 6 sunt 1,3,5 */
    public void showOddNumbers(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2!=0){
                System.out.println(i);
            }
        }
    }
}