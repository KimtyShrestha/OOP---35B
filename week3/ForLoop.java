package week3;
public class ForLoop {
    public static void main(String[] args) {
        /*For loop takes initialisation
         * condition
         * modify / update */
         for (int index  = 0; index <= 5 ; index ++){
            System.out.println("For Index " + index);
         }
         /*can use different update logic like
          * for (int index= 0; index <=5; index += 3)*/
          /*using decrement  */
          for (int index = 10 ; index >=0 ; index --){ 
            System.out.println("For index decremenet "+ index );
          }
          /*make a multiplication table for 2 
 * fro eg: 
 * 2 x 1 = 2
 * 2 x 2 = 4 
 * .. 
 * 2 x 10 = 20 
 * NOTE : Loop from 1 to 10 and multiply the index ) 
 */
 for (int index = 1; index  <= 10 ; index ++){ 
    System.out.println("2 " + " x" + index +  " =" + index *2);
 }

 /* task
  * make a multiplication table like the following 
  Multiplication table of 10 
  10 x 1 = 10 
  10 x 2 = 20 
  ...
  10 *10 =100
  ..
  Multiplication table of 1 
  1 x 1 = 1 
  1 x 2 = 2 
  .. 
  1 x 10 = 10 
  */
     for (int outer  = 10; outer  >= 1 ; outer--){ 
        for (int inner = 1 ; inner <= 10 ; inner ++){
            System.out.println(outer+" X "+ inner +" = "+ outer*inner);
         }
    } 
}                                            
}