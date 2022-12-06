public class Amphibians extends Animal { // земноводные

    private String habitat;

    static Amphibians[] amphibian = new Amphibians[4];      // [null, null, null, null]

    public static boolean amphibiansExists(Amphibians amphibians) {       // exists значит "существует"
        //       boolean isFound = false;        // "найден"
        for (int i = 0; i < amphibian.length; i++) {
            if (amphibian[i] != null && amphibians.equals(amphibian[i])) {
                return true;        // существует и метод завершается
            }
        }

        return false;               // НЕ существует и метод завершается
    }

    //static Predator[] predators = new Predator[4];      // [null, null, null, null]

    public void hunts() {

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

    }

    @Override
    public void go() {

    }

}
