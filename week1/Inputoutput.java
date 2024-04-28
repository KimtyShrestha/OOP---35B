
package week1;
import java.util.Scanner;

public class Inputoutput {
    public static void main(String[] args) {
        /*user output
        System.out.println("Print Next Line ")
        "sout "for shortcut
         */

         System.out.println("this string breaks the line  ");
         /*System.out.print */
         System.out.print("this will not break line ");
         System.out.println("this will continue");
         /*Systwm.out.printf
          * String formatter
          %s String ,%d Integra, %f floating Point , %b boolean 
          */
          System.out.printf("Helllo %s,Nice",  "world" );
          System.out.printf("This is num %d", 10) ;
          /*you can use multiple formatter */ 
          System.out.printf("Num %f and bool %b", 10.3f,false);


          /*User Input  */
          Scanner scan = new Scanner (System.in);
          System.out.println("the following tajkes whole sentence ");
          String wholeWString= scan.nextLine();
          System.out.println("The input is "+ wholeWString);
          System.out.println("The following takes integer");
          int intInput= scan.nextInt();
          System.out.println("The input is "+ intInput);
          System.out.println("The following takes  double ");
          double DoubleInput = scan.nextDouble();
          System.out.println("This is "+DoubleInput);
          System.out.println("The following take boolean");
          boolean boolInput = scan.nextBoolean();
          System.out.println("This is "+boolInput);
          scan.close();// close after taking all the input


        /* Task  
         * Make a new scanner object/ variable scan1
         * Prompt the following
         * What is your name ? -> savw a string , name 
         * Are you over 18 ? - > save as boolena,status
         * How many siblings ? -> save as int, siblings
         * Print the following
         *Hello,name
         over 18 ? status
         You have sibling num of sibling
         // comment the previous scanner for ease of us 
         */


         Scanner scan1 = new Scanner (System.in);
         System.out.println("What is your name ?");     
         String name = scan1.nextLine();
         System.out.println("Are you over 18?");
         boolean status = scan1.nextBoolean();
         System.out.println("How many sibilings");
         int sibling = scan1.nextInt();
         System.out.println("hello "+name);
         System.out.println("over 18? "+status);
         System.out.println("YOu have sibling number of sibling "+sibling);
         scan1.close();

    }   









    }
    
}
