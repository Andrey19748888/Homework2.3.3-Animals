public abstract class Mammal extends Animal {

    private String habitat;
    private final int speed;

    public Mammal(String name, int age, String habitat, int speed) {
        super(name, age);
        this.habitat = habitat;
        this.speed = speed;
    }

    public abstract void walk();

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getSpeed() {
        return speed;
    }
}
