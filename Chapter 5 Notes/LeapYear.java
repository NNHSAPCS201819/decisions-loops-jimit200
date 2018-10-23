import java.util.Scanner;
/**
 * Write a description of class LeapYear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeapYear
{
    public static void isLeapYear(){
        Scanner in = new Scanner(System.in);
    System.out.print("Input the year: ");
      int year = in.nextInt(); 
      if (((year%4==0) && !(year%100==0)) || (year%400==0)) {
        System.out.println("it is leap");
        
        }
        else {
            System.out.println("it is not leap");
    }
}
}