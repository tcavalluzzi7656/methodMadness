public class TCavalluzziLib {
    //Thomas Cavalluzzi


/**
 * checks to see if a word is spelled the same way normally and backwards
 * @param word the word that will be checked to see if it is a palindrome
 * @return a boolean value
 */

    public static boolean isPalindrome (String word)
    {

        //initialization
        String save = "";

        //saving the original word for comparison later, as the string word will be modified
        String original = word;

        while (word.length()>0)
        {
            //saving the end of the word as the last letter
            String end = word.substring(word.length()-1);

            //adding the last letter to the end of the string that we will compare to the original
            save = save + end;

            //removing the last letter of the word string as its not needed anymore
            word = word.substring(0,word.length()-1);

        }

        //if the original and the backwards are the same, it returns true, and if not, it returns false
        if (save.equals(original))
        {
            return true;
        }
        return false;
    }

    /**
     * converts a date in the american format to the european format
     * @param date inputted date in the mm/dd/yyyy format
     * @return a string with the date in a dd-mm-yyyy format
     */


    public static String dateStr (String date)
    {
        //isolating the specific parts of the date
        String months = date.substring(0,2);
        String days = date.substring(3,5);
        String year = date.substring(6);


        //makes sure the input is the right length
        String error = "Your date was entered incorrectly, please enter it in MM/DD/YYYY format.";
        if(date.length() != 10)
        {
            return error;
        }

        //helps ensure proper input
        if(date.indexOf("/") != 2)
        {
            return error;
        }

        String check = date.substring(3);
        if (check.indexOf("/") != 2)
        {
            return error;
        }

        //could probably make this cleaner with a for loop but this works just fine
        if (!Character.isDigit(date.charAt(0))||!Character.isDigit(date.charAt(1))||!Character.isDigit(date.charAt(3))||!Character.isDigit(date.charAt(4))||!Character.isDigit(date.charAt(6))||!Character.isDigit(date.charAt(7))||!Character.isDigit(date.charAt(8))||!Character.isDigit(date.charAt(9)))
        {
            return error;
        }


        //combines the previously saved parts of the date in the right order and with the right barrier
        String euDate = days+"-"+months+"-"+year;
        return euDate;
    }

    /**
     * adds the sum of all numbers up to the integer, inclusive
     * @param num the number that will be the final one added to the sum
     * @return the sum of all the numbers up to and including the inputted number
     */



    public static int sumUpTo (int num)
    {
        //initialization
        int sum = 0;

        //if the number is zero, then the sum will also be zero, which we have already set it as
        if ( num != 0)
        {
            //if the number is positive
            if(num>0)
            {
                //as long as the index remains below the number, it will continue to increment up and add itself to the sum each time
                for(int index = 1; index<=num;index++)
                {
                    sum = sum + index;
                }
            }
            //if the number is negative
            else
            {
                //as long as the index remains above the number, it will continue to increment down and add itself to the sum each time
                for(int index = -1; index>num;index--)
                {
                    sum = sum + index;
                }
            }
        }

        //the sum determined by either the if not zero and if positive statements is returned
        return sum;
    }


    /**
     * prints the product of the base and every integer up to the range
     * @param base the integer being multiplied by every integer up to the range
     * @param range the final integer the base will be multiplied by
     */


    public static void multiplicationTable (int base, int range)
    {
        //checks to see if the range is positive or negative to avoid missing the for loop
        if (range>0)
        {
            //as long as the index is less than the range, it will multiply the base by itself and then increase by one
            for (int index = 0;index<=range;index++)
            {
                System.out.println(base*index);
            }
        }
        else
        {
            //as long as the index is greater than the range, it will multiply the base by itself and then decrease by one
            for (int index = 0;index>=range;index--)
            {
                System.out.println(base*index);
            }
        }

    }


    /**
     * removes the first instance of subStr in the mainStr
     * @param mainStr the thing that will have the first instance of subStr removed from it
     * @param subStr the thing that will be removed from the first instance of the mainStr
     * @return the mainStr with the first instance of subStr removed
     */


    public static String cutOut (String mainStr, String subStr)
    {
        String strFront = mainStr.substring(0,mainStr.indexOf(subStr));
        String strBack = mainStr.substring(mainStr.indexOf(subStr)+subStr.length(),mainStr.length());
        return strFront + strBack;
    }
}
