package temaPentruAcasaLesson12;

public class Count {
    private long id;
    private String firstName;
    private String lastName;

    public static int c;


    public Count(){
        c++;
        id=c;
    }
    /*Creati o clasa Person care sa aiba 3 proprietati. Long id , String firstName, lastName.
    Face-ti in asa fel incit atunci cind creati cite un obiect in main, id sa se incrementeze.
    Adica pentru fiecare obiect creat, sa-i fie generat pe durata rularii programului, un id unic.
     */
    public void setId(long sId){

        id=sId;
    }

    public long getId(){
        return id; }

}
