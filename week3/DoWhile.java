package week3;
import java.util.Scanner ;
public class DoWhile {
    public static void main(String[] args) {
        /*Check the same condition in while amd do while for difference  */
        int counter = 0;
        while (counter < 0 ){
            System.out.println("The cndition is false , it wont run ");
        }
        do {
            System.out.println("This runs first then checks the condition ");
        }while (counter < 0 );
        /*Do while run at least once , even if the conditipn is false  */

    Scanner scan  = new Scanner (System.in);
    System.out.println("Please enter a  negative gd,yjchm bnumber ");
    int inputInt = scan.nextInt();
          while(inputInt < 0 ){
            System.out.println("Number between 0 -100 only");
            inputInt=scan.nextInt ();
    
          }
          System.out.println("Condition Matched "+ inputInt );
          scan.close();
}
   
    }
    

/*task 
 * prompt user to enter a number 
 * run loop and ask the user the integer te integer until the 
 * integer is negative 
 */
  
