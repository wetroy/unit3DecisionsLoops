import java.util.Scanner;

/**
 * Write a description of class CommonLoopAlgorithms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindMax
{


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers ( type q to exit)");
        
        double currentMax = in.nextDouble();
        
        while(in.hasNextDouble())
        {
            double value = in.nextDouble();
            if(value > currentMax)
            {
                currentMax = value;
            }
        }
        while(in.hasNextDouble())        
        System.out.println("Maximum vlaue: " + currentMax);
        
    }

}
