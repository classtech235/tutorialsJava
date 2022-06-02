package abhi.practice.Loops;
// creating a class and naming as EightTable in abhi.practice.hello package
public class EightTable {
    //creating a Main method in order to run
    public static void main(String[] args) {
        forLoop(8);//method call for the forLoop Method
        doWhile(8);//method call for the doWhile method
        whileLoop(8);//method call for the WhileLoop method
    }
    //method definition for the forLoop method with no return type and argument i of int type
    static void forLoop(int i){
        //creating a for loop with an iterative variable j
        for(int j=1;j<=20;j++){
            //printing the table step
            System.out.println(i+"X"+j+"="+i*j);
        }
    }
    //method definition for the doWhile method with no return type and argument i of int type
    static void doWhile(int i){
        //creating a local variable j of int type
        int j=1;
        //creating a doWhile loop
        //starting with do block
        do {
            //printing the multiplication table step
            System.out.println(i+"X"+j+"="+i*j);
            //incrementing the j variable  with every iteration if the condition satisfies
            j++;
        }while (j<=20);//condition of the while block
    }
    //method definition for the WhileLoop method with no return type and argument i of int type
    static void whileLoop(int i){
        //creating a local variable j of int type
        int j=1;
        //creating a While loop
        while (j<=20){
            //printing the multiplication table step
            System.out.println(i+"X"+j+"="+i*j);
            //incrementing the j variable  with every iteration if the condition satisfies
            j++;
        }
    }
}
