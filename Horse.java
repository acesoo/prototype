class Horse implements Animal {
    private String color = "Brown";
    private String food = "Oats";

    @Override
    public Animal clone() { return new Horse(); }

    @Override
    public void makeSound() { 
        System.out.println("Horse says: Neigh (Color: " + color + ", Eats: " + food + ")"); 
    }

    @Override
    public String getType() { return "Horse"; }
}