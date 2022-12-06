public  class Flightless extends Birds { // нелетающие
    private String movementType;

    static Flightless[] flightlesses = new Flightless[4];      // [null, null, null, null]

    public static boolean flightlessExists(Flightless flightless) {       // exists значит "существует"
        //       boolean isFound = false;        // "найден"
        for (int i = 0; i < flightlesses.length; i++) {
            System.out.println(flightlesses[i]);
            if (flightlesses[i] != null && flightless.equals(flightlesses[i])) {
                return true;        // существует и метод завершается
            }
        }

        return false;               // НЕ существует и метод завершается
    }

    public void walk() {
    }

    public Flightless(String name, int age, String habitat,String movementType) {
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

}
