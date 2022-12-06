public class Predator extends Mammal{//хищники

    private String food;

    static Predator[] predators = new Predator[4];      // [null, null, null, null]

    public static boolean predatorExists(Predator predator) {       // exists значит "существует"
        //       boolean isFound = false;        // "найден"
        for (int i = 0; i < predators.length; i++) {
            if (predators[i] != null && predator.equals(predators[i])) {
                return true;        // существует и метод завершается
            }
        }

        return false;               // НЕ существует и метод завершается
    }


    public Predator(String name, int age, String habitat, int speed, String food) {
        super(name, age, habitat, speed);
        this.food = food;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + "\n"
                + "Возраст: " + getAge() + "\n"
                + "Среда обитания: " + getHabitat() + "\n"
                + "Скорость: " + getSpeed() + "\n"
                + "Еда: " + food + "\n"
                + "Класс объекта: " + this.getClass().getSimpleName();
    }

    public void hunts() {
        System.out.println();
    } //охота

    public void eat() {
        System.out.println();
    }
    public  void go(){
        System.out.println();
    }
    public void walk(){
        System.out.println();
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
