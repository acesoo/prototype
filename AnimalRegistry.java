class AnimalRegistry {
    private Sheep sheepPrototype = new Sheep();
    private Cow cowPrototype = new Cow();
    private Horse horsePrototype = new Horse();

    public Animal createSheep() { return sheepPrototype.clone(); }
    public Animal createCow() { return cowPrototype.clone(); }
    public Animal createHorse() { return horsePrototype.clone(); }
}