/**
 * Dylan Klingensmith
 * CH3PC6 - Widget Factory
 * AP Computer Science 
 * 10/1/18
 */

import java.util.Scanner;

public class WidgetFactory {

    public static void main(String[] args) {
        
        //Establish input variable, scanner object, and factory object
        int input;
        Scanner keyboard = new Scanner(System.in);
        
        Factory widgetFactory = new Factory();
        
        //Get widget quota from user
        System.out.println("Input the number of widgets that are needed "
                + "to be produced.");
        input = keyboard.nextInt();
        widgetFactory.setQuota(input);
        
        //Print number of days needed to produce widgets
        System.out.println("It will take " + widgetFactory.getTime() + " days "
                + "to complete the order.");

        
    }

}
