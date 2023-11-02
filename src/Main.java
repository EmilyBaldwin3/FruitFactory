public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main myfactory = new Main();
    }
    // constructor method
    // a constructor is a method with no return type that has the same name as the class its in
    public Main() {
        // strawberry: red, triangle, 200, true, 20
        Fruit strawberry; // declare strawberry
        strawberry = new Fruit("red", 200, "triangle", true); // construct strawberry
        strawberry.color = "red"; // in "" because the color is a string
        strawberry.shape = "triangle"; //
        strawberry.numberSeeds = 200;
        strawberry.isRipe = true;
        strawberry.numberBush = 20;
        strawberry.printInfo();
        // blueberry: blue, circle, 100, yes, 30
        Fruit blueberry; // declare blueberry
        blueberry = new Fruit("blue", 100, "circle", true); //construct
        blueberry.color = "blue";
        blueberry.shape = "circle";
        blueberry.numberSeeds = 100;
        blueberry.isRipe = true;
        blueberry.numberBush = 30;
        blueberry.printInfo();
        //orange: orange, circle, 1, yes, 100
        Fruit orange; //declare orange
        orange = new Fruit("orange", 1, "circle", true); // construct
        orange.printInfo(); // print this orange information
    }
}