package week3;
import java.util.Scanner ;
public class WhileLoop {
    public static void main(String[] args) {
        int count = 0 ;
        while (count <3){
            System.out.println("While count "+ count );
            ++count;
        }
    /*when using while with variable , increment and decremnet 
     * are done inside the loop
     */
    
     /*rhe main use of while is ehrn you do not know how many time the loop 
      * to interate,For eg: asking user for a number until some condition 
      is match , like 0-100 
      */

      Scanner scan  = new Scanner (System.in);
      System.out.println("Please enter a number ");
      int inputInt = scan.nextInt();
      while(inputInt < 0 || inputInt>100){
        System.out.println("Number between 0 -100 only");

      }
      System.out.println("Condition Matched "+ inputInt );
      scan.close();


}
}


