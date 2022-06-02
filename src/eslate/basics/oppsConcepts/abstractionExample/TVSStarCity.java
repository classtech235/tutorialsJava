package eslate.basics.oppsConcepts.abstractionExample;
//creating an abstract class and naming it as BikeAbstract
abstract class BikeAbstract {
    //creating a regular method and naming it as applyBrakes
    void applyBrakes(){
        System.out.println("brakes applied");
    }
    //creating a abstract method where it doesn't contain a block
    abstract void tires();
    //creating a regular method and naming it as horn
    void horn(){
        System.out.println("pee peep pee peep");
    }
    //creating a regular method and naming it as applyClutch
    void applyClutch(){
        System.out.println("Clutch applied");
    }

}
//creating a regular class of public access where the class BikeAbstract is inherited in this
public class TVSStarCity extends BikeAbstract{
// providing the body of the abstract method tires in child class
    @Override
    void tires() {
        System.out.println("2 tires of Ceat company");
    }
    //creating a regular method and naming it as fuelType
    void fuelType(){
        System.out.println("Its of petrol type");
    }
}
