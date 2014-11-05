import java.util.Scanner;

/**
 * Write a description of class CompareAdjecent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompareAdjecent
{

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        final double EPSILON = 1e-7;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type q to exit)");
        double prevValue;
        double currentValue = in.nextDouble();
                    
        while(in.hasNextDouble())
        {
            prevValue = currentValue;
            currentValue = in.nextDouble();
            
            if(Math.abs(currentValue - prevValue) < EPSILON)
            {
                System.out.println("Duplicate numbers");
            }
        }
            
    }

}
