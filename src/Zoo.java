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

        //for (InventoryItem item : iventory){
        // systemout.printLn (....... + item.category}
        }
    static Animal createAnimal(String animalName){
        Animal animal;
        switch(animalName){
            case "Snake":
                animal = new Snake();
                break;
            case "Lion":
                animal = new Lion();
                break;
            case "Condor":
                animal = new Condor();
                break;
            case "alligator":
                animal = new Reptile(){//annomous class
                    @Override
                    public String toString(){
                        return "Alligator";
                    }
                };
                break;
            default :
                animal = new Animal();
        }
        return animal;

    }
}
