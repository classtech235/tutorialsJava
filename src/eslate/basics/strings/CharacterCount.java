package abhi.practice.strings;

public class CharacterCount {
    public static void main(String[] args) {
        //creating and assigning a string variable and naming as name
        String name="Abhilash is an mechnical engineer";
        System.out.println(name);
        //creating a count variable of int type in order to store the value of number of characters
        int count =0;
        //creating a for loop with i as iterative variable
        for (int i=0;i<name.length();i++){
            //checking the condition if the current character in the string is not a space
            if(name.charAt(i)!=' '){
                //if condition satisfies then the count is incremented to 1
                count+=1;
            }

        }
        //printing the number of characters
        System.out.println(count);
    }
}
