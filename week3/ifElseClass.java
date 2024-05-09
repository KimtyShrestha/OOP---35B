package week3;
public class ifElseClass {
    public static void main(String[] args) {
        /* if statement  */
        if (true ){
            System.out.println("True Statement");


        }
        /* 
         * if takes bolean expression inside the ()
         * if the expression is true then the statement will be executed
         */
        int num1=10;
        int num2=20;

        if (num1==num2){
            System.out.println("Equal");
            }
        else{
            System.out.println("Not Equal");
        }
        /*note that else is optional  */
        /* if else if  */
        if (num1==num2){
            System.out.println("Equal");
            }
        else if (num1<num2){
            System.out.println("lesser");
        }
        else{
            System.out.println("greater");
        }
        /* note that else should be at least  */
        /* if else if ladder  *//// more than 2 codition 
        if (num1>num2){
            System.out.println("greater");
            }
            else if (num1!=num2){
                System.out.println("Not equal");
            }
            else if (num1==num2){
                System.out.println("equal");
            }
            else{
                System.out.println("Default statement");
            }
            if (num1 < 0) {
                if (num1 > num2) {
                    System.out.println("Negative and greater ");
                } else {
                    System.out.println("Negative and lesser ");
                }
            } else if (num1 > 0) {
                if (num1 > num2) {
                    System.out.println("Positive and greater ");
                } else {
                    System.out.println("Positive and lesser ");
                }
            } else {
                System.out.println("Zero");
            }
            

}}





