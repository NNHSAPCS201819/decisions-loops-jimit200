
/**
 * Write a description of class Substrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Substrings
{
    
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void getSubstring()
    
    {
        Scanner s= new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = s.next();
        int length;
        int sub;
        
        for (length=1; length<=word.length(); length++)
        {
            for (sub=0; sub<=word.length()-length; sub++)
            {
                //System.out.println(word.length()-sub);
                //System.out.println("\nSub: "+sub+"    Length: "+length);
                System.out.println(word.substring(sub,length+sub));
                
                
            }
        }
        
    }
}