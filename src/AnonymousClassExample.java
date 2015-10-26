/**
 * Created by cameronoakley on 10/26/15.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {//create alligator from seperate class
        Alligator al = new Alligator();
        System.out.println(al);


        Reptile a2 = new Reptile(){//create alligator from anonymous class
            @Override
            public String toString(){
                return "Alligator";
            }

        };
    }
}

class Alligator extends Reptile{
    @Override
    public String toString(){
        return "Alligator";
    }
}
