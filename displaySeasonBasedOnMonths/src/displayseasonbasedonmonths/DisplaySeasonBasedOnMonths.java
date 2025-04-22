
package displayseasonbasedonmonths;

import java.util.Scanner;


public class DisplaySeasonBasedOnMonths {

    
    public static void main(String[] args) {
        // prompt the user to type in any month number (1-12).
        // switch statement that will display the appropriate season.
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter any month number (1-12): ");
        int month = scn.nextInt();
        
        switch(month){
            case 11:
            case 12:
            case 1:   
            case 2: 
                System.out.println("Summer");
                break;
            case 3:
            case 4:
            case 5: 
                System.out.println("Autumn");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Winter");
                break;
            case 9: 
            case 10:
                System.out.println("Spring");
                break;
            default: 
                System.out.println("Sorry, not a valid month.");
        }
    }
    
}
