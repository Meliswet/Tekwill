
/*Construiti o clasa si in ea sa veti 2 proprietati private. Gasiti un mod de a seta si citi valoarea
proprietatilor din afara fara a schimba alt modificator de acces.*/
package temaPentruAcasaLesson11.exercitiu3;

public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName (String someString){
        name=someString;
    }
    public int getAge() {
        return age;
    }

    public void setAge (int someInt) {
        age=someInt;
    }
}