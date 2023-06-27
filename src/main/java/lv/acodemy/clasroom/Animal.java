package lv.acodemy.clasroom;

public class Animal {

    private int age;
    private double weight;
    private String colour;
    private Enum size;
    private String name;
    private boolean isMammal;
    private int energy = 4;
    private final int MAX_ENERGY = 4;

    public int getEnergy(){
        System.out.println("Current energy: " + energy);
        return energy;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Enum getSize() {
        return size;
    }

    public void setSize(Enum size) {
        this.size = size;
    }

    public void speak() {
        if (energy <= 0) {
            System.out.println("I don't have power to speak.");
            getEnergy();
        } else {
            System.out.println("I am speaking with you");
            energy--;
        }
    }

    public void feed(String foodName) {
        if(energy == MAX_ENERGY) {
            System.out.println("I have max energy level. Lats go and speak!");
            getEnergy();
        } else {
        System.out.println("I am eating:" + foodName);
        energy++;}
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public Animal(int age, double weight, String colour, Enum size, String name, boolean isMammal) {
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.size = size;
        this.name = name;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
}
