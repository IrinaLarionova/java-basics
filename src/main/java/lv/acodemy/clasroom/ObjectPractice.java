package lv.acodemy.clasroom;

import java.sql.SQLOutput;

import static lv.acodemy.clasroom.Sizes.S;

public class ObjectPractice {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        String catName = barsik.getName();

        // name = null;
        System.out.println(catName);
        System.out.println(barsik);


       // name = Barsikzftw
        barsik.setName("Barsikzftw");
        System.out.println(barsik);

        // age = 5;
        barsik.setAge(5);
        System.out.println(barsik);
        System.out.println("My cat is: " + barsik.getAge() + "years old.");

        // Create getter and setter for weight, colour;
        // Set data using setters;

        // weught = 1.5;
        barsik.setWeight(1.5);
        System.out.println(barsik);
        System.out.println("My cat's weight is: " + barsik.getWeight() + "kg.");

        // colour = red;
        barsik.setColour("red");
        System.out.println(barsik);
        System.out.println("My cat's colour is: " + barsik.getColour() + ".");

        // Size = Enum
        barsik.setSize(S);
        System.out.println(barsik);
        System.out.println("My cat's size is: " + barsik.getSize() + ".");

        // isMammal = true

        boolean isMammal = true;
        barsik.setMammal(isMammal);
        System.out.println(barsik);
        System.out.println("My cat: is mammal.");

        Animal ballzik = new Animal(13, "Ballzik");
        // My name is Ballzik. I am 13 years old.
        System.out.printf("My name is %s. I am %d years old.\n", ballzik.getName(), ballzik.getAge());
        System.out.println("My name is " + ballzik.getName() + ".I am " + ballzik.getAge() + "years old.");;

        // Create All argument constructor;

        Animal njusha = new Animal(10,1.5,"red", S, "Njusha", true);
        System.out.println(njusha);

        njusha.speak();
        ballzik.speak();
        barsik.speak();

        String food = "Fish"; // 1 variant
        njusha.feed("Fish"); // 2 variant
        barsik.feed("Milk");
        ballzik.feed("Meat");

        njusha.speak();
        njusha.getEnergy();
        njusha.feed("fish");
        njusha.getEnergy();
        njusha.speak();
        njusha.speak();
        njusha.speak();
        njusha.speak();
        njusha.speak();
        njusha.feed("fish");
        njusha.feed("fish");
        njusha.feed("fish");
        njusha.getEnergy();
        njusha.feed("fish");
        njusha.feed("fish");










    }
}
