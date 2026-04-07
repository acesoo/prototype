class Cow implements Animal {
    private String food = "Hay";

    @Override
    public Animal clone() { return new Cow(); }

    @Override
    public void makeSound() { 
        System.out.println("Cow says: Moooo (Eats: " + food + ")"); 
    }

    @Override
    public String getType() { return "Cow"; }
}