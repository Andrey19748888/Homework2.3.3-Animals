public class Predator extends Mammal{

    private String food;

    static Predator[] predators = new Predator[4];

    public static boolean predatorExists(Predator predator) {
        for (int i = 0; i < predators.length; i++) {
            if (predators[i] != null && predator.equals(predators[i])) {
                return true;
            }
        }

        return false;
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
        System.out.println("predators hunt");
    }

    public void eat() {
        System.out.println("Predator eating");
    }
    public  void go(){
        System.out.println("The predator is coming");
    }
    public void walk(){
        System.out.println("The predator is walking");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
