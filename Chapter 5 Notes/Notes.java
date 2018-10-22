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
         * This is an example a "short circuit".
         *      If the left operand is false, the right operand
         *      will not be evaluated because the AND operation
         *      is already false.
         */
        if(firstStr != null && firstStr.length() > 3)
        {
            System.out.println("The first string has more than 3 characters.");
        }

        /*
         * This is another "short circuit" example.
         *      If the left operand is true, the right operand will
         *      not be evaluated because the OR operation is
         *      already true.
         *      
         *  This may result in a bug, if the first word entered is
         *      "kiwi", we will never read the second word from
         *      the stream which may result in unexpected behavior
         *      later.
         */
        System.out.print("Enter your two favorite fruits: ");
        if(s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Kiwi is one of my favorite fruits too!");
        }

        System.out.print("Enter your favorite ice cream flavor.");
        String flavor = s.next();
        System.out.println("Favorite flavor " + flavor ); // could print a fruit

    }

    public static String getStudentClass(int gradeNumber){

        /*
         * switch satement 
         * another conditional decision statment (like if statement)\
         * prefered when evaluating several *discrete* values can be used for byte,
         * short, char, int primative types. It can be used for enumaration and string
         * objectd
         * 
         * The condition is evaluated, the flow of evaluation jumps to the case that matches
         * 
         * 
         */

        String studentClass="";
        switch (gradeNumber)
        {
            case 9:
            {
                studentClass = "freshman";
                /*
                 * break causes the flow of execution to leave the switch.(without a break the flow of
                 * execution continues into next case)
                 */
                break;
            }
            case 10:
            {
                studentClass = "sophomore";
                break;
            }
            case 11:
            {
                studentClass = "junior";
                break;
            }
            case 12:
            {
                studentClass = "senior";
                break;
            }
            case 6:
            case 7:
            case 8:

            {
                studentClass = "junior high";
                break;

            }
            /*
             * deault matches everything not matches 
             */
            default:
            {
                studentClass ="elementary";
                break;}
        }
        return studentClass;
    }

    public static void assignmentOperatorExample()
    {
        /*
         * augmented assignment operators : +=, -=, *=, /=,%=
         * these are same as python.
         * perform the specified mathamatical operation and then assign the resulting value
         */
        int x=7;
        int y =7;
        int z=7;
        x=x+1;
        y+=1;
        z++;
        System.out.println("x:"+x);
        /*
         * post increment/ decrement operator
         * equivalent to adding/subtracting 1 
         * returns the value before performing the increment/decrement
         * 
         */
        int a = 7;
        int b=a++;
        System.out.println("a:"+a+"b:"+b);//a=8 b=7

        /*
         * pre increment/ decrement operators
         * returns the value after performing after performing the incremet/decremnet
         */
        int c = 7;
        int d=++c;
        System.out.println("c:"+c+"d:"+d);//c=8 d=8

    }
}