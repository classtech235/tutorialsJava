package abhi.practice.Loops;
//  creating  class ith class name Pattern.
public class pattern {
    // creating a main method
    public static void main(String[] args) {
            // creating a for loop to iterate no of rows
            for (int i = 0; i < 5; i++) {
                // nested for loop in order to print *
                for (int j = 0; j <= i; j++) {
                    // Printing the * character until the loop breaks
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }

