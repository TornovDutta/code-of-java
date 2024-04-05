package OOPs;

// OOP is a methodology to design a program using classes and objects

// Class
// A class is a user-defined data type which defines its properties and functions
class Pen {
    String type;
    String color;

    public void write() {
        System.out.println("Writing something");
    }
}

public class BasicConcept {
    public static void main(String[] args) {
        //object is a runtime entity
        // Creating an object of the Pen class
        Pen p1 = new Pen();

        // Assigning values to properties
        p1.type = "Ballpoint";
        p1.color = "Blue";

        // Calling the write method
        p1.write();
    }
}
