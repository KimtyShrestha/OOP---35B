package week2;


public class Variable {
    public class VariableClass {
        private static char[] staticVariable;
        private char[] instanceVariable;

        public static void main(String[] args) {
            /* Non primitive data type 
             * decalaration          */
            byte byteValue;
            /* Initilizarion */
            byteValue = 10;
            /* decalaration and initilization  */
            short shortValue = 100 ;
            /* multiple declaration */    
            int intValue1, intValue2;
            /* multiple unitilization */
            intValue1 = -99; intValue2 = 99;
            /*multiple declaration and initilization          */
            long longValue = -999, longvalue2 = 999;
            float floatValue = 1.10f;  // the leytter 'f' id  required 
        
            double doubleValue = 28.88; // the letter 'd' is optional
            char charValue ='C' ; // single letter in single quotes
    
            boolean boolValue = true; // true or false lowercase 
        
             /* Non primitive data type   haru // aafaile banako program le //yesma first letter upper case ma huna parchha */ 


            /*string  */
            String stringInfo1= "This is a variable.";
            /* using class  */
            String stringInfo2 = new String("Class");
            /* Objecct use the same class as writtem above  */
            VariableClass variableObj= new VariableClass();// kunai pani refererece lida or add garda oop ma new rakhna parne hunchha 
              // VariableClass chai file name bata aako ho  file name bata hamile euta variable banauna sakinchha  or euta object create garna sakinchha  sakinchha 
            // Illegal action following 
            /*byte byteValue  = 10; // yo can not readeclare
            byteValue = 200; // yo can not reassign
            /* boolean booleanVal3 = "false";*/// wrong data type 
            /* short shortVal = 10000000; */// ypu can not exceed min/max */

            /*we need touse object to access instance variable  */
            System.out.println(variableObj.instanceVariable);
            /*we can ccess the static  variable with class */
            System.out.println(VariableClass.staticVariable);
        }
    }
}
    

            
    
      
    
 






    
        
   