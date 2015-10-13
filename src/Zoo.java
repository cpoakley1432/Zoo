import java.util.Scanner;

/**
 * Created by cameronoakley on 10/13/15.
 */
public class Zoo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the name of an animal");
        String animalNAme = scanner.nextLine();
        Animal animal = createAnimal(animalNAme);
        System.out.println(String.format("Created %s!", animal));

    }
    static Animal createAnimal(String animalName){
        if(animalName.equals("Snake")){
            return new Snake();
        }
        else if (animalName.equals("Lion")){
            return new Lion();
        }
        else if (animalName.equals("Condor")){
            return new Condor();
        }
        else{
            return new Animal();
        }
    }
}
