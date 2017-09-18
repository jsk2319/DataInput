/*
*@author jsk2319@email.vccs.edu
* Author Jude Kallista-Fitzpatrick
* Date: 9/18/17
* Descrition: Asks user to input data types and responds by displaying the output through JOptionPane
 */


import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataInput {

    public static void main(String[] args) {

            byte byteValue;
            short shortValue;
            int intValue;
            long longValue;
            float floatValue;
            double doubleValue;
            char charValue;
            boolean booleanValue;

            Scanner keyboard = new Scanner(System.in);
            //Byte
            System.out.println("Enter a byte value");
            byteValue = keyboard.nextByte();

            //Short
            System.out.println("Enter a short value");
            shortValue = keyboard.nextShort();
            JOptionPane.showMessageDialog(null,"You entered " + shortValue);
            //Int
            System.out.println("Enter an int value");
            intValue = keyboard.nextInt();
            JOptionPane.showMessageDialog(null,"You entered " + intValue);
            //Long
            System.out.println("Enter a long value");
            longValue = keyboard.nextLong();
            JOptionPane.showMessageDialog(null,"You entered " + longValue);
            //Float
            System.out.println("Enter a float value");
            floatValue = keyboard.nextFloat();
            JOptionPane.showMessageDialog(null,"You entered " + floatValue);
            //Double
            System.out.println("Enter a double value");
            doubleValue = keyboard.nextDouble();
            JOptionPane.showMessageDialog(null,"You entered " + doubleValue);
            //Char
            System.out.println("Enter a single char value");
            charValue = keyboard.next().charAt(0);
            JOptionPane.showMessageDialog(null,"You entered " + charValue);
            //Boolean
            System.out.println("Enter a boolean value of either true or false");
            booleanValue = keyboard.nextBoolean();
            JOptionPane.showMessageDialog(null,"You entered " + booleanValue);

    }

}