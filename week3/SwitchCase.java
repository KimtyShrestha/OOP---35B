package week3;
public class SwitchCase {
    public static void main(String[] args) {
        char charValue ='b';
        switch (charValue){
            case 'a':
                System.out.println("Apple ");
                break;
            case 'b':
                System.out.println("Ball ");
                break;
            case 'c':
                System.out.println("Cat ");
                break;
            default:
                System.out.println("Invalid ");
                break;
        }
    

    /*Task
     * use switch case for the following
     * 0 - sunday 
     * 1- monday 
     * 2- tuesday
     * 3-wednesday
     * 4-thursday 
     * 5-friday
     * 6-saturday 
     * rest- invalid day   */
    
     int num = 5;
      switch (num) {
        case 0:
        System.out.println("sunday ");
            break;
        case 1:
        System.out.println("Monday");   
            break;
        case 2:
        System.out.println("Tuesday ");
            break;
        case 3:
        System.out.println("Wednesday ");
            break;
        case 4:
        System.out.println("thursday");
            break;
        case 5:
        System.out.println("friday");
            break;
        case 6:
        System.out.println("saturday");
            break;
      }
    }
}