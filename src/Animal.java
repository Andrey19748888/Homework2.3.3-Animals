public  abstract class Animal {

    private String name;
    private int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public abstract void eat();
    public abstract void go();
    public void sleep() {
        System.out.println("sleeping...");
    }

    //    @Override
    public boolean equals(Animal other) {
        if (other != null && other.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
