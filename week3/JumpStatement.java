package week3;
public class JumpStatement {
    public static void main(String[] args) {
        /*break and continue aare jump statement */
        for (int index = 0 ;index < 3;index ++){
            if (index == 1){
                break; // this will end the loop from here   }
        }
        System.out.println("Index "+ index );

    }//break will exit scope here 
    /* can be used in while/do while */
    int counter = 0 ; 
    while (counter < 3){
        if (counter==1){
            break; //exist from here
        }
        System.out.println("WHile Counter"+ counter);
        counter++;
    }
    /*continue will akip the current interation
    or will bypass all the statementg below it  */
    for (int index = 0; index <5 ;index ++){ 
        if (index == 2 ){ 
            continue ; // when called , it will byspass everything below
    }
    System.out.println("continue index "+ index );
    }
    /*break on a nested loop */
    for ( int outer = 0 ; outer <2 ; outer++){
        for ( int inner = 0 ; inner <=5 ; inner ++){
            if (inner == 2){
                break ; // this will only exit the inner fr loop 
            }
            System.out.println("Inner index "+ inner );

        }// break wil exit this scope if used in inner 
        System.out.println("Outer Index "+ outer );

    }
    System.out.println("Labeled Break");
    /* Labeled break  */
    outerLoop: for (int outer = 0 ; outer < 2; outer ++){
        innerLoop: for (int inner =0; inner <=5; inner++){
            if (inner == 2){
                break outerLoop; //this will break the loop with this label
            }
            System.out.println("Inner index"+inner);
        }
        System.out.println("Outer index"+outer);
    }
    /*Task
     * loop form -5 to 5 
     * break the loop if the value is positive 
     */

     
        // Loop from -5 to 5
        for (int i = -5; i <= 5; i++) {
            if (i>0){
                break;
            }
            System.out.println(i);
        }
                
             
        }
    
    

    /*task 
     * loop from 1 -20 
     * print the number only if even 
     * use continue to complete 
     */
}


  


