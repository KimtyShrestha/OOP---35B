package week1;
public class operatorclass {
    public static void main(String[] args) {
        /*Arithmetic Operations */
        int aNum1=10,aNum2 =20;
        int sum=aNum1 +aNum2; //"+"is an arithmetic operator 
        System.out.println("Addition is"+ sum );
        System.out.println("susbtraction is"+ (aNum1 - aNum2 ));
        System.out.println("Multiplication is "+(aNum1 *aNum2));
        System.out.println("Division is"+aNum1/aNum2);
        System.out.println("Modulo is"+ (aNum1 %aNum2 )); 

        /*Assignment operator */
        int asNum1=20;//= is used to assign  VALUE TO VARIABLE 
        asNum1+=1;//same as asNum1+ 1 ;
        System.out.println("+= value is "+asNum1);
        System.out.println("-= value is"+ (asNum1-=10));
        System.out.println("= value is"+ (asNum1=10));
        System.out.println("/= value is"+ (asNum1/=2));
        System.out.println("%= value is"+(asNum1%=30));


        /*Relational Operators */
        int rNum1 = 20 ,rNum2 = 21;
        boolean rExpressions= rNum1==rNum2; // returns true/false
        System.out.println("equals to "+ rExpressions);
        System.out.println("Greater than "+ (rNum1 >rNum2));
        System.out.println("Less than"+ (rNum1 < rNum2));
        System.out.println("Not equals to "+ (rNum1 !=rNum2));
        System.out.println("Greater than equals to "+(rNum1 >= rNum2));

        /* Logical Operator */
        int lNum1=20, lNum2=20;
        boolean lExpression1= lNum1 == lNum2;
        boolean lExpression2 = lNum2 > lNum1 ;
        System.out.println("&& is used for AND" +(lExpression1 && lExpression2));
        System.out.println("|| is used for OR" +(lExpression1 || lExpression2));
        System.out.println("! is used for NOT" +(!lExpression1));

        /*Unary Operator */
        int uNum1 = 10 ; 
        uNum1 ++; // uNum1 =uNum1+1; // changes values in next line 
        ++uNum1; //changes value in this same line 
        System.out.println("--uNum1 uanry is "+ --uNum1);
        System.out.println("uNum1-- unary is " + uNum1--);

        /*Ternary operator */
        int tNum1 = 20 , tnum2 = 10 ;
        String output;
         /* take following if else as example 
         if )tNum>tNum2 ){
            output = " true Statement";
        }else {
            output = "false statement";
        }
        */
         output = tNum1> tnum2 ?  "True Statement": " False Statement ";
         /*here ternary operator contains expressions
          * if expressions is true if it returns after the "?"
          if the expression  is false it returns after the ":"
          */
         int intOutput = tnum2 ==tNum1 ? -10 : 10;
         System.out.println(output);
         System.out.println(intOutput);


        /*4 tasks  */
        /*task 1 
         * write a program to print whether a variable is greater or equal to 18
          */

          int = 10;
          



          /* task 2 
           * write a program to print simple intrest form variables 
           * make 3 variables for amount, time and rate and save the calculation into SI
           * formula : s1  = amount * time *rate/100: // use float /double
           */

           int amount = 100, time = 5, rate = 15 ;
           float SI = (amount *time * rate )/100 ;
           System.out.println(SI);

           /* task 3 
            * write the program to print area and perimeter of rectangle 
            area = lenght *breadth 
            perimeter = 2 (length +breadth )
            */

            int length =10 , breadth = 20;
            float area = length *breadth;
            float perimeter =  2*(length +breadth);
            System.out.println(area);
            System.out.println(perimeter);
            
            /* task 4
             * complete the task 1 osing ternary operators
             */
            int num1 = 10;
            String output1; 
            output1 =num1 >18? "true statement " : " false statement ";
            System.out.println(output1);
    
    }

    
}
