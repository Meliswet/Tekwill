/*Construiti o clasa si in ea sa veti 2 proprietati private. Gasiti un mod de a seta si citi valoarea
proprietatilor din afara fara a schimba alt modificator de acces.*/
package temaPentruAcasaLesson11.exercitiu3;

public class TestCat {
    public static void main (String []args) {
        Cat myCat = new Cat();
        myCat.setName( "Murzic");
        myCat.setAge( 3);
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
    }
}
