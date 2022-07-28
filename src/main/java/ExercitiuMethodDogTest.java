public class ExercitiuMethodDogTest {
    public static void main(String[] args){
        ExercitiuMethodDog myDog = new ExercitiuMethodDog();
      //metoda1 obiect
       myDog.height( 5);

       //metoda2 obiect
       myDog.dogfamily("Sharik","Belka");

        //metoda3 obiect
        myDog.nickname();
       String result = myDog.nickname();
       System.out.println(result);

        //metoda4 obiect
       myDog.shortname( 'T');

    }
}
