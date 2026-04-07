public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Creating pairs of clones
        Animal sheep1 = registry.createSheep();
        Animal sheep2 = registry.createSheep();
        Animal cow1 = registry.createCow();
        Animal cow2 = registry.createCow();
        Animal horse1 = registry.createHorse();
        Animal horse2 = registry.createHorse();

        // Output matching your screenshot format
        sheep1.makeSound();
        sheep2.makeSound();
        cow1.makeSound();
        cow2.makeSound();
        horse1.makeSound();
        horse2.makeSound();
    }
}