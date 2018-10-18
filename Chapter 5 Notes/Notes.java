import java.util.Scanner;
/**
 * Write a description of class Notes here.
 *
 * @author Jimit
 * @version october 16 2018
 */
public class Notes
{
    public static void ifExample()
    {
        //model a coin flip; 1 is heads 0 is tails
        int coinFlip= (int)(Math.random()*2);
        /*
         * if statememt 
         * statements are executed if the conditonal expression is true. 
         * conditional expressions must go inside of parentheses
         * statements are grouped by blocks i.e{} not grouped by indentation like
         * in pyton
         * There is no colon after ghd condditonal expression unlike python
         * 
         */
        if (coinFlip==1)
        {
            System.out.println("coin is heads!");

        }
        /*
         * {} are not required for a single stement.
         * Howerver they are always a good idea 
         * leaving them out can lead to bugs like this
         * 
         */
        if (coinFlip==0)
            System.out.println("coin is tails!");
        System.out.println("better luck next time");
        /*
         * if-else statement
         * else block is executed if the condition for the if is false
         */

        if (coinFlip==1)
        {
            System.out.println("coin is heads!");

        }
        else
        {
            System.out.println("coin is tails!");
            System.out.println("better luck next time");
        }

        //simulate the roll of a four sided die[1-4]
        int dieRoll= (int)((Math.random()*4)+1);
        /*
         * if-else statement
         * if java else if is used instead of elif
         */
        if (dieRoll==1)
        {

            System.out.println("you rolled a 1");
        }
        else if (dieRoll==2)
        {
            System.out.println("you rolled a 2");
        }
        else if (dieRoll==3)
        {
            System.out.println("you rolled a 3");
        }
        else
        {
            System.out.println("you rolled a 4");
        }
    }

    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * if we use the equality operator (==) for double, it will only retuern 
         * true if all binary digits match.
         * for equal numbers this is probably not the case due to floating- point
         * rounding ans therefore not what we want
         * we will check if they are close enough(ie epsilon value)
         */
        final double EPSILON = 1e-14;
        if (Math.abs(num1-num2)<EPSILON)
        {
            return true;
        }
        else{
            return false;
        }

        // dont have to use an if statement
        //return Math.abs(num1-num2)<EPSILON;
    }

    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1 = s.next();
        String str2 = s.next();
        /*
         * the equality operator (==) returns true if the 2 variables contain the 
         * same value. for objects including string this means the contain the same
         * reference(refer to the same object in memory) not that 2 strings have the 
         * same sequnce of charecters 
         */
        if (str1==str2){
            System.out.println("string references are equal");
        }
        else {
            System.out.println("strings references are not equal");}

        /*
         * the equals method returns true if the 2 objects referenced by the varible are 
         * "equal". What equalls means is defined by the class. For strings if means tha the two 
         * objects have the same sequence of charecters
         * 
         */
        if (str1.equals(str2)){
            System.out.println("strings are equal");
        }
        else {
            System.out.println("stringss are not equal");}
        /*
         * we will determine which string comes first comes first lexographically
         * using the compareTo method of the string class
         * compareTo returns an int:
         * 0: if strings are equal (same sequnce of charecter)
         * <0 : if str1 <str2 lexographically
         * >0 if str > str2 lexograhically
         */
        String firstStr= null;
        int result = str1.compareTo(str2);
        if( result <0 ){
            firstStr= str1;
        }
        else if (result >0 ){
            firstStr= str2;
        }
        if (firstStr!= null){
            System.out.println("The first string is "+firstStr);
            System.out.println( "its length is: "+ firstStr.length());
        }
        else {
            System.out.println("string are equal");}
        /*
         * this is an example of a "short circut"
         * if the left operand is false.  the right operand will not be
         * evaluated becase the and operator
         * 
         * 
         */
        if(firstStr != null && firstStr.length()>3){
        System.out.println("the first string has more than 3 charecters");}
        
        
        /*
         * if the lest operand is true the right operand will not be evaluated 
         * becasue the or operation is already ture 
         * 
         * This may result in a bug if the first word entered is a kiwi we w
         * will never read 
         */
    }

}