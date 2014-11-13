import java.util.Scanner;

public class SumAndAverageValue
{
    private String name;
    private int days;
    public Event(String nameEvent, int numDays)
    {
        name = nameEvent;
        days = numDays;
    }
    /**
     * Default constructor for objects of class SumAndAverageValue
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        double total = 0;
        int count = 0;
        System.out.println("Enter one number at a time or a q to quit");
        while(in.hasNextDouble())
        {
            double value = in.nextDouble();
            total += value;
            count++;
        }
        
        double average = 0;
        if(count > 0)
        {
            average = total / count;
        }
        System.out.println(average);
    }


}
