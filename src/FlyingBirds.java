public class FlyingBirds extends Birds {
    private String movementType;

    public void fly() {
    }

    static FlyingBirds[] flyingBirdses = new FlyingBirds[4];

    public static boolean flyingBirdsExists(FlyingBirds flyingBirds) {
        for (int i = 0; i < flyingBirdses.length; i++) {
            System.out.println(flyingBirdses[i]);
            if (flyingBirdses[i] != null && flyingBirds.equals(flyingBirdses[i])) {
                return true;
            }
        }

        return false;
    }

    public FlyingBirds(String name, int age, String habitat,String movementType) {
        super(name,age,habitat);
        this.movementType = movementType;
    }



    public String toString(){
        return "Название: " + getName() + "\n"
                + "Возраст: " + getAge() + "\n"
                + "Среда обитания: " + getHabitat() + "\n"
                + "Тип передвижения: " + getMovementType() + "\n"
                + "Класс объекта: " + this.getClass().getSimpleName();
    }


    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    @Override
    public void eat() {
        System.out.println("FlyingBirds eating");
    }

    @Override
    public void go() {
        System.out.println("The FlyingBirds is coming");
    }

}


