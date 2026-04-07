class Cow implements Animal {
    private int legs = 4;
    private String sound = "Moooo";

    @Override
    public Animal clone() {
        return new Cow();
    }

    @Override
    public void makeSound() { System.out.println("Cow says: " + sound); }

    @Override
    public String getType() { return "Cow"; }
}