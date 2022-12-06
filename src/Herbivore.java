public class Herbivore extends Mammal {
    private String food;


    public static Herbivore[] herbivores = new Herbivore[4];      // [null, null, null, null]

    public Herbivore(String name, int age, String food, String habitat, int speed) {
        super(name,age,habitat, speed);
        this.food = food;
    }

    public static boolean herbivoreExists(Herbivore herbivore) {       // exists значит "существует"
        //       boolean isFound = false;        // "найден"
        for (int i = 0; i < herbivores.length; i++) {
            if (herbivore.equals(herbivores[i])) {
                return true;        // существует и метод завершается
            }
        }

        return false;               // НЕ существует и метод завершается
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
        System.out.println("grazing...");
    } // пастись

    public void eat() {
        System.out.println("Herbivore eating...");
    }

    public void go() {
        System.out.println("going...");
    }

    public void walk() {
        System.out.println("walking...");
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

