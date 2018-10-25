
/**
 * Write a description of class Notes here.
 *
 * @author jimit200 
 * @version october 25 2018
 */
public class Notes
{
    public static void whileExample(){
        /*
         * while loop
         * Evaluates a boolean experssion 
         * if true executes the body if the loop
         * and then re-evaluates teh condition
         * if false, skips the body of the loop and continues 
         */

        int count =1;//initialization
        while (count <=5)//condition
        {
            System.out.println(count);//body
            count++;//update the condition varible 
        }
        System.out.println("done");
    }

    public static void whileExample2(){
        /*
         * this is an example of an infinite loop
         * A better approach would be :
         * while(count<50)
         */
        int count =1;//initialization
        while (count !=50){//condition
            System.out.println(count);//body
            count+=2;//update the condition varible 
        }
    }

    public static void forExample(){
        /*
         * for loop
         * three parts if the for loop statement;
         * 1. initialization - executed once
         * 2. bbolean expression - evaluated at the start of each iteration 
         * 3. update the condition varible - executed at the *end* of each iteration
         * *before* evaluating the condition again
         */
        for (int count =1;//initialization
        count<=5; // boolean expression
        count++){//update the condition var
            System.out.println(count);//body
        }
        System.out.println("done");
        /*
         * varibles declared with the for satement are scoped 
         */
    }

    public static void forExample2(){
        int count =1;//initialization
        for (;// still works
        count<=5; // boolean expression
        count++){//update the condition var
            System.out.println(count);//body
        }
        System.out.println("done");
    }

    public static void offByOne(){
        /*
         * the infamous off by one error is the common with for loops 
         * executing one too many or one too few times
         * 
         * Carefully ask: should the initial value start at 0 or 1
         * should the condition be < or <=?
         * THink dont compile at one
         */
        //we want to print 5 *
        for( int i = 0;
        i<=5;//should by i<5;
        i++)
        {
            System.out.println("*");   
        }
        System.out.println("done");
    }
}
