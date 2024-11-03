package factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.createAnimal("dog");
        dog.speak();  // Output: Woof!

        Animal cat = animalFactory.createAnimal("cat");
        cat.speak();  // Output: Meow!
    }
}
