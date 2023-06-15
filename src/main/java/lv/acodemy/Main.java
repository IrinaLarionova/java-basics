package lv.acodemy;

public class Main {
    public static void main(String[] args) {

        // One-line comment

        /*This is
        Multi-line comment
         */

        //Primitive data types

        // Double floating numbers
        double pi = 3.14;
        System.out.println(pi);
        // float
        float weight = 70.34f;
        System.out.println(weight);

        // int (integer)
        int populationOfLatvia = 1700000;
        System.out.println(populationOfLatvia);

        //char
        char myFirstNameChar = 'I';
        System.out.println(myFirstNameChar);

        // byte
        byte age = 28;
        System.out.println(age);

        // boolean is , has
        boolean isSummer = true;
        System.out.println(isSummer);

        boolean isWinter = false;
        System.out.println(isWinter);

        // String
        String name = "Irina";
        String surname = "Larionova";
        System.out.println(name +" " + surname);
        System.out.printf("%s %s", name, surname);
        System.out.printf("%s %s", name, surname);

        System.out.println(String. format(("My name is %s. Me surname is: %s"), name, surname));

        // Operator
        int a = 10;
        int b = 5;
        int c = a +b;
        System.out.println(c);

        double d = 20.54;
        double e = 9.61;
        double f = d - e;
        System.out.println(f);
        // 10 + 5 - 9.61
        System.out.println(a + b - f);

        int x = 10;
        int y = 10 % 4;
        System.out.println(y);

            }
}

