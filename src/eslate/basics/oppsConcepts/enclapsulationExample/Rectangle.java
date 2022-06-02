package eslate.basics.oppsConcepts.enclapsulationExample;
//creating the class and naming it as Rectangle
public class Rectangle {
    //creating a variables of private type Which can be visible to this curert class only
    private int length;
    private int breath;
// getter and setter methods created in order to access or modify  the length and breath variables
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }
    // creating a method of area name with return type of int
    int area(){
        //returning the value of the area calculated
        return length*breath;
    }
    // creating a method of  perimeter name with return type of int
    int perimeter(){
        //returning the value of the perimeter calculated
        return 2*(length + breath);
    }
}

