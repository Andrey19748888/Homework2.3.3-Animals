public class Amphibians extends Animal {

    private String habitat;

    static Amphibians[] amphibian = new Amphibians[4];

    public static boolean amphibiansExists(Amphibians amphibians) {
        for (int i = 0; i < amphibian.length; i++) {
            if (amphibian[i] != null && amphibians.equals(amphibian[i])) {
                return true;
            }
        }

        return false;
    }



    public void hunts() {
        System.out.println("Amphibians hunt");
    }

    public Amphibians(String name, int age,String habitat) {
        super(name,age);
        this.habitat = habitat;
    }

    public String toString(){
        return "Название: " + getName() + "\n"
                + "Возраст: " + getAge() + "\n"
                + "Среда обитания: " + getHabitat() + "\n"
                + "Класс объекта: " + this.getClass().getSimpleName();
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void eat() {
        System.out.println("Amphibians eating");
    }

    @Override
    public void go() {
        System.out.println("The Amphibians is coming");
    }

}
