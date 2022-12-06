public class FlyingBirds extends Birds { //летающие
    private String movementType;

    public void fly() {
    }

    static FlyingBirds[] flyingBirdses = new FlyingBirds[4];      // [null, null, null, null]

    public static boolean flyingBirdsExists(FlyingBirds flyingBirds) {       // exists значит "существует"
        //       boolean isFound = false;        // "найден"
        for (int i = 0; i < flyingBirdses.length; i++) {
            System.out.println(flyingBirdses[i]);
            if (flyingBirdses[i] != null && flyingBirds.equals(flyingBirdses[i])) {
                return true;        // существует и метод завершается
            }
        }

        return false;               // НЕ существует и метод завершается
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

    }

    @Override
    public void go() {

    }



//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void go() {
//
//    }
}


