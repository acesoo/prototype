public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Creating Clones
        Animal sheep1 = registry.createSheep();
        Animal sheep2 = registry.createSheep();

        Animal cow1 = registry.createCow();
        Animal cow2 = registry.createCow();

        Animal horse1 = registry.createHorse();
        Animal horse2 = registry.createHorse();

        // Proving they are unique objects but same type
        System.out.println("--- Testing Clones ---");
        sheep1.makeSound();
        sheep2.makeSound();
        
        cow1.makeSound();
        cow2.makeSound();
        
        horse1.makeSound();
        horse2.makeSound();

        System.out.println("\nMemory Check: Is cow1 the same instance as cow2? " + (cow1 == cow2));
    }
}