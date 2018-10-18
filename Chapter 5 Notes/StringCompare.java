
/**
 * Write a description of class StringCompare here.
 *
 * @author rkkolker
 * @version 17 October 2018
 */
public class StringCompare
{
    public static void stringCompare()
    {
        String word1 = "catalog";
        String word2 = "cat";
        String cond1 = "aaa";
        int result = word1.compareTo(cond1);
        if(result > 0)
        {
            System.out.println("condition #1 is true");
        }
        int result2 = word1.compareTo(word2);
        if(result2 == 0)
        {
            System.out.println("condition #2 is true");
        }
        int result3 = word1.compareTo(word2);
        if(result3 < 0)
        {
            System.out.println("condition #3 is true");
        }
        String word1new = word1.substring(0,3);
        String word2new = word2.substring(0,3);
        int result4 = word1new.compareTo(word2new);
        if(result4 == 0)
        {
            System.out.println("condition #4 is true");
        }
    }
}

