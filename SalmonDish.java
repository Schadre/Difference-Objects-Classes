
public class SalmonDish {
     // This is a class definition named 'SalmonDish'
    // Ingredients listed within the classs
    String ingredients; 
    String spices;
    String lemon;

    // Method of the class. This defines a behavior that objects of the class can perform.
    void prepare() {
        System.out.println("Preparing the salmon with " + ingredients + " and adding " + spices + " with a touch of " + lemon);
    }

    public static void main(String[] args) {
          // Creating the first object from the SalmonDish class.
        SalmonDish dish1 = new SalmonDish();
        // Setting properties of the object 'dish1'.
        dish1.ingredients = "salmon fillet";
        dish1.spices = "salt and pepper";
        dish1.lemon = "lemon juice";
        dish1.prepare(); // Calling the 'prepare' method on the object 'dish1'.

        // Creating the second object from the SalmonDish class.
        SalmonDish dish2 = new SalmonDish();
        // Setting properties of the object 'dish2'.
        dish2.ingredients = "salmon steak";
        dish2.spices = "garlic and herbs";
        dish2.lemon = "lemon zest";
        dish2.prepare(); // Calling the 'prepare' method on the object 'dish2'.
    }
}
