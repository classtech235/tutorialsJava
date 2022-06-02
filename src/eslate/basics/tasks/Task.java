package abhi.practice.tasks;
//creating a class and naming it as Task
public class Task {
    //creating a main method in order to execute or run
    public static void main(String[] args) {
        //creating a variable of the max limit and assigning a value
        int max = 1000;
        //method call to sumOdd method with max variable as parameter and assigning the return value to oddSum variable of int type
        int oddSum =sumOdd(max);
        //printing the value of oddSum
        System.out.println(oddSum);
        //method call to sumEven method with max variable as parameter and assigning the return value to evenSum variable of int type
        int evenSum = sumEven(max);
        //printing the value of evenSum
        System.out.println(evenSum);
        //method call to absoluteValue method with two parameters oddSum and evenSum
        absoluteValue(oddSum,evenSum);
    }
    //definition of the method sumOdd with return type as int and initializing the argument
    static int sumOdd(int n) {
        int count = 0; //creating and assigning a local variable count (to store the sum of odd numbers)
        //creating a for loop with creating and assigning iteration variable j
        for (int j = 1; j <= n; j++) {
            if (j % 2 != 0) {  //if condition to check the number is odd
                count+=j;//for each and every iteration the valve of count updates
            }
        }
        return count ;// returns the value of count
    }
    //definition of the method sumEven with return type as int and initializing the argument
    static int sumEven(int n) {
        int count = 0;  //creating and assigning a local variable count (to store the sum of even numbers)
        //creating a for loop with creating and assigning iteration variable j
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {  //if condition to check the number is even
                count+=j;//for each and every iteration the valve of count updates
            }
        }
        return count ; // returns the value of count
    }
    //definition of the absoluteValue method with two arguments as i and j are sum of odd and sum of even respectively
   static void absoluteValue(int i, int j){
        if (i>j){   //if condition to check i is greater than j
            System.out.println("the absolute valve is"+(i-j));// printing the absolute value
        }
        else {    // if condition fails i.e.,j is greater than i
            System.out.println("the absolute valve is"+(j-i));//printing the absolute value
        }
   }
}
