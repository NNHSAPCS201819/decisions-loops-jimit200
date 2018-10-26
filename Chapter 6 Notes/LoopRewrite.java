import java.util.Scanner;
/**
 * Write a description of class LoopRewrite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopRewrite
{
    public static int loopRewrite1(){
        int s = 0;
        for (int i = 1; i <= 10; i++)
        {
            s = s + i;
        }
        //return s;
        s=0;
        int i = 1;
        while ( i <=10 ){
            s=s+i;
            i++;

        } 
        return s;
    }

    public static double loopRewrite2(){
        // Scanner in = new Scanner( System.in );
        // int n = in.nextInt();
        // double x = 0;
        // double s;
        // do
        // {
            // s = 1.0 / (1 + n * n);
            // n++;
            // x = x + s;
        // }
        // while (s > 0.01);
        // return x;
        
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        double x = 0;
        double s = 0.02;
        while (s > 0.01)
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
        return x;
        
    }
}
