package abhi.practice.tasks;

public class leapYear {
    //creating  a main method to be an executable program
    public static void main(String[] args) {
        //creating and assigning a variable of name year as int type
        int year=1996;
        //year should be a century year , divisible by 4  and end leap year cycle of 400years
        if (year%100==0 && year%4==0 && year%400==0){
            //printing the year as leap year
            System.out.println(year+" is a Leap Year ");
            //year should be a divisible by 4 and not be a century year
        } else if (year%4==0 && year!=100) {
            //printing the year as leap year
            System.out.println(year+" is a Leap Year ");
        } else {   // if none of the above condition satisfies it's  not leap year
            System.out.println(year+" is a  not Leap Year ");
        }
    }
}
