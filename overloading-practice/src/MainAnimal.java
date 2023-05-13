import java.util.Scanner;
import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");

        while(true) {
            System.out.println("Please enter a name: ");
            String inputName = scanner.nextLine();
            if(inputName.isEmpty()){
                break;
            }

            System.out.println("Is it a dog? Yes or no: ");
            String inputDog = scanner.nextLine();
            Boolean yN = (inputDog.equalsIgnoreCase("yes")? true : false);
            animals.add(new Animal(inputName, yN));
        }

        Animal animal1 = new Animal("Maple", true);
        Animal animal2 = new Animal(true);
        Animal animal3 = new Animal("Yue");

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);


        for (Animal animal: animals) {
            System.out.println(animal);
        }

    }
}
