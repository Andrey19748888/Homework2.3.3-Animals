public abstract class Birds extends Animal {

    private String habitat;

    public Birds(String name, int age,String habitat) {
        super(name,age);
        this.habitat = habitat;
    }

    public void hunts() {
        System.out.println("bird hunts");

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
