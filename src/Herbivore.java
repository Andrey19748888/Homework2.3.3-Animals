public class Herbivore extends Mammal {
    private String food;


    public static Herbivore[] herbivores = new Herbivore[4];

    public Herbivore(String name, int age, String food, String habitat, int speed) {
        super(name,age,habitat, speed);
        this.food = food;
    }

    public static boolean herbivoreExists(Herbivore herbivore) {
        for (int i = 0; i < herbivores.length; i++) {
            if (herbivore.equals(herbivores[i])) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        return "Название: " + getName() + "\n"
                + "Возраст: " + getAge() + "\n"
                + "Еда: " + food + "\n"
                + "Среда обитания: " + getHabitat() + "\n"
                + "Скорость: " + getSpeed() + "\n"
                + "Класс объекта: " + this.getClass().getSimpleName();
    }

    public void graze() {
        System.out.println("Herbivores graze");
    }

    public void eat() {
        System.out.println("Herbivore eating");
    }

    public void go() {
        System.out.println("The Herbivore is coming");
    }

    public void walk() {
        System.out.println("The Herbivore is walking");
    }

    public String getFood() {
        if (food == null) {
            return "default";

        }
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

