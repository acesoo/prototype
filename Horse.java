class Horse implements Animal {
    private int legs = 4;
    private String sound = "Neigh";

    @Override
    public Animal clone() {
        return new Horse();
    }

    @Override
    public void makeSound() { System.out.println("Horse says: " + sound); }

    @Override
    public String getType() { return "Horse"; }
}