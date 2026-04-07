class Sheep implements Animal {
    private String name = "Dolly";
    private String food = "Grass";

    @Override
    public Animal clone() { return new Sheep(); }

    @Override
    public void makeSound() { 
        System.out.println(name + " says: Baaaa (Eats: " + food + ")"); 
    }

    @Override
    public String getType() { return "Sheep"; }
}