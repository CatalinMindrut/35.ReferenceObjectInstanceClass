package com.Catalin;

public class Main {

    public static void main(String[] args) {
        /** A class is basically a blueprint for a house, using the blueprint (plans) we can build as many houses as
         * we like based on those plans.
         *
         * Each house you build (in other words instantiate using the new operator) is an object also known
         * as an instance.
         *
         * Each house you build has an address (a physical location). In other words if you want to tell someone
         * where you live, you give them your address (perhaps on a piece of paper). This is known as a reference.
         *
         * You can copy that reference as many times as you like but there is still just one house. In other words
         * we are copying the paper that has the address on it, not the house itself.
         *
         * We can pass references as parameters to constructors and methods.
         */
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;
        /** The first line creates a new instance of the House class, so the House is a blueprint and we're
         * assigning it to the blueHouse variable.
         *
         * The second line creates a reference to the same object in memory, the blueHouse.
         * Just like having two pieces of paper with the address for the same house.
         * SO using the new keyword, you create a new object, of type House and on the second line you
         * create a reference to that same object.
         */

        System.out.println(blueHouse.getColor()); // prints blue
        System.out.println(anotherHouse.getColor()); // blue

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor()); // red
        System.out.println(anotherHouse.getColor()); // red
        /** Since both references point to the same object of type House, assigning a new color to one
         * object will automatically change the color of the other one. Because you are changing the blueprint
         * that is being used by both the object and the reference.
         */

        House greenHouse = new House("green");
        anotherHouse = greenHouse;
        /** On the first line we create a new object. And now we have 2 objects, the blueHouse and the greenHouse
         * but we have 3 references, blueHouse, greenHouse and anotherHouse.
         *
         * On the second line, anotherHouse has been reassigned to greenHouse and it now points to a
         * different object.
         */

        System.out.println(blueHouse.getColor()); // red
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green
    }
}
