public class Fruit {
    // variable declarations
    // string --> word
    // int --> integer
    public String color;
    public String shape;
    public int numberSeeds;
    public boolean isRipe;
    public int numberBush;
    public void printInfo(){
        System.out.println("The fruit color is: " + color);
        System.out.println("The shape is " +shape);
        System.out.println("The number of seeds is " + numberSeeds);
        System.out.println(isRipe);
        if (isRipe == true){
            System.out.println("The fruit is ripe");
        }
        else{
            System.out.println("The fruit is not ripe :(");
        }
        System.out.println("The number of fruits on a bush " + numberBush);
    }
   // constructor for Fruit Class
    public Fruit(String paramColor, int paramNumberSeeds, String paramShape, boolean paramisRipe){
        color=paramColor;
        numberSeeds = paramNumberSeeds;
        shape = paramShape;
        isRipe = paramisRipe;
        numberBush = (int)(Math.random()*100); //the (int) forces this number to be an integer "casting"
    }
}
