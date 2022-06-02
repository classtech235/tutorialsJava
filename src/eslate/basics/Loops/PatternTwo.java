package abhi.practice.Loops;
// creating a class of class name PatternTwo in abhi.practice.hello package
public class PatternTwo {
    // creating a static main method
    public static void main(String[] args) {
        // creating and initializing the variables in order to use them as iterating variables
        int i=0,j=0,k=0;
        // creating  a for loop to iterate the no of rows (outer loop)
        for (i=0;i<=4;i++){
            //creating a nested for loop to iterate the no of columns in order to print the spaces
            for(j=4;j>i;j--){
                System.out.print(" ");
            }
            //creating a nested for loop to iterate the no of columns in order to print the * character
                for(k=0;k<i;k++){
                    System.out.print("* ");
                }
                // To print in a new line
            System.out.println();
        }

    }
}
