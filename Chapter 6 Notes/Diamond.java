
/**
 * Write a description of class Diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Diamond
{
    public static void createDiamond()
    {

        Scanner s= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        int stars=1;
        int spaces;
        
        for(int i=0; i<=num; i++)
        {
            spaces=num-i;
            stars=num-spaces;
            for (; spaces>0; spaces--)
            {
                System.out.print(" ");
                
            }
            
            for (; stars+i-1>0; stars--)
            {
                System.out.print("*");

            }
            
            System.out.println("");
        }
        
        for(int i=num-1; i>=0; i--)
        {
        
        spaces=num-i;
        stars=num-spaces;
            for (; spaces>0; spaces--)
            {
                System.out.print(" ");
                
            }
            
            for (; stars+i-1>0; stars--)
            {
                System.out.print("*");

            }
        
        System.out.println("");
        }
        
        

    
    }
}