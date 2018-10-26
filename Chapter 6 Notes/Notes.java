/**
 * Write a description of class Notes here.
 *
 * @author gcschmit
 * @version 25 October 2018
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop
         * 
         *  Evaluates a boolean expression
         *      if true, executes the body of the loop
         *          and then re-evaluates the condition
         *      if false, skips the body of the loop and continues
         */
        int count = 1;                  // initialization
        
        while(count <= 5)               // condition
        {
            System.out.println(count);  // body
            
            count++;                    // update the condition variable
        }
        
        System.out.println("done");
    }
    
    public static void whileExample2()
    {
        /*
         * This is an example of an infinite loop!
         * 
         *  A better approach would be:
         *      while(count < 50)
         */
        int count = 1;                  // initialization
        
        while(count != 50)              // condition
        {
            System.out.println(count);  // body
            
            count += 2;                 // update the condition var
        }
        
        System.out.println("done");
    }
    
    public static void forExample()
    {
        /*
         * for loop
         * 
         *  Three parts of the for loop statement:
         *      1. initialization - executed once
         *      2. boolean expression - evaluated at the start
         *          of each iteration
         *      3. update the condition variable - executed at
         *          the *end* of each iteration *before* evaluating
         *          the condition again
         */
        for(int count = 1;              // initialization
                count <= 5;             // boolean expression
                count++)                // update the condition var
        {
            System.out.println(count);  // body
        }
        
        System.out.println("done");
        
        /*
         * variables declared with the for statement are scoped
         *      to the for statement and its body
         */
        //System.out.println("final value of count: " + count);
    }
    
    public static void forExample2()
    {
        int count = 1;                  // initialization
        for(    ;
                count <= 5;             // boolean expression
                count++)                // update the condition var
        {
            System.out.println(count);  // body
        }
        
        System.out.println("done");
        
        System.out.println("final value of count: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops
         *      executing one too many or one too few times.
         *      
         *  Carefully ask: should the initial value start at 0 or 1?
         *                 should the condition be < or <= ?
         *                 
         *      "Think! Don't compile and try at random!"
         */
        
        // we want to print five "*"
        for(int i = 0;
                i <= 5;     // should be i < 5;
                i++)
        {
            System.out.println("*");
        }
        
        System.out.println("done");            
    }
    public static void doExample ()
    {
    /*
     * do loop (do while loop):
     * 1. exectutes the body of the loop
     * 2. evaluates the conditional expression
     * if true, executes the conditional expression 
     * if true executes the body of the loop
     */
    int count = 1;//initialization
    
    }
    
    
}

