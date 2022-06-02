package eslate.basics.oppsConcepts.abstractionExample;

public class AbstractionConcept {
    //creating a main method to give a runnable program
    public static void main(String[] args) {
        //creating a object variable  of TVSStarCity class and naming it as features
        TVSStarCity features= new TVSStarCity();
        // it is a behaviour of child class i.e., TvsstarCity
        features.fuelType();
        //tires is an abstract method which is inherited from abstract class bike
        //body of the method is provided in the child class
        features.tires();
        //tires is a method which is inherited from abstract class bike
        //these methods cannot be accessed directly through abstract class object
        features.applyBrakes();
        features.applyClutch();
        features.horn();

    }
}
