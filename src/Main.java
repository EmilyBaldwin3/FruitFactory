public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main myfactory = new Main();
    }
    // constructor method
    // a constructor is a method with no return type that has the same name as the class its in
    public Main(){
        // strawberry: red, triangle, 200, true, 20
        Fruit strawberry; // declare strawberry
        strawberry = new Fruit(); // construct strawberry
        strawberry.color="red"; // in "" because the color is a string
        strawberry.shape="triangle"; //
        strawberry.numberSeeds=200;
        strawberry.isRipe=true;
        strawberry.numberBush=20;
        strawberry.printInfo();
        // blueberry: blue, circle, 100, yes, 2000
        Fruit blueberry; // declare blueberry
        blueberry = new Fruit (); //construct
        blueberry.color="blue";
        blueberry.shape="circle";
        blueberry.numberSeeds=100;
        blueberry.isRipe=true;
        blueberry.numberBush=30;
        blueberry.printInfo();
    }
}