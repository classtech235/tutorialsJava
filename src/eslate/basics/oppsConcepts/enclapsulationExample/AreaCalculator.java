package eslate.basics.oppsConcepts.enclapsulationExample;
// creating a class and naming it as AreaCalculator
public class AreaCalculator {
    // creating a main method in order to be a runnable class
    public static void main(String[] args) {
        // creating an object variable and assigning the rectangle object
       Rectangle newOne = new Rectangle();
       // setting the length
       newOne.setLength(5134);
       //setting the breath
       newOne.setBreath(3153);
       //printing the calculated valve of area of the specified length and breath
       System.out.println("The area of the newOne is "+newOne.area());
        //printing the calculated valve of perimeter of the specified length and breath
       System.out.println("The Perimeter of the newOne is "+newOne.perimeter());



    }
}
