package task2;

public class MainAnimal {
    public static void main(String[] args){

        Animal catNoise = (str) -> "Meow";
        String catCall = catNoise.makeNoise("Cat");
        System.out.println(catCall);

        Animal dogNoise = (str) -> "Woof";
        String dogCall = dogNoise.makeNoise("Dog");
        System.out.println(dogCall);

        Domesticated checkAnimal = (animal) -> {
            if (animal.equals("Cat") || animal.equals("Dog")) {
                return true;
            }else {
                return false;
            }
        };

        boolean isCatDomestic = checkAnimal.isDomestic("Cat");
        System.out.println(isCatDomestic);

        boolean isZebraDomestic = checkAnimal.isDomestic("Zebra");
        System.out.println(isZebraDomestic);
    }
}
