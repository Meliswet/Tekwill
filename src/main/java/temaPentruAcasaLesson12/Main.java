/*Creati o clasa Person care sa aiba 3 proprietati. Long id , String firstName, lastName.
Face-ti in asa fel incit atunci cind creati cite un obiect in main, id sa se incrementeze.
Adica pentru fiecare obiect creat, sa-i fie generat pe durata rularii programului, un id unic.
 */

package temaPentruAcasaLesson12;


public class Main {
    public static void main(String[] args){
        Count obj1 =new Count();
        System.out.println("Id obj1 = "+obj1.getId());
        Count obj2 =new Count();
        System.out.println("Id obj2 = "+obj2.getId());
        Count obj3 =new Count();
        System.out.println("Id obj3 = "+obj3.getId());

    }
}
