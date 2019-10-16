/*
 * reg2_3BHIT
 * Author: sloidl
 * Date: 27.02.2018
 * Description:
 */

import java.util.regex.Pattern;

public class RegexUe2
{
    public static void main(String args[]){
        // It would return true if string matches exactly "ann"
        System.out.println("1: "+Pattern.matches("ann", "Ann")); //False

        // returns true if the string matches exactly "ann" or "Ann"
        System.out.println("2: "+Pattern.matches("Ann|ann", "Ann")); //True
        System.out.println("3: "+Pattern.matches("Ann|ann", "ann")); //True

        /* Returns true if the string matches exactly "tim"
         * or "Tim" or "jin" or "Jin"
         */
        System.out.println("4: "+Pattern.matches("tim|Tim|jin|Jin", "Tim"));//True
        System.out.println("5: "+Pattern.matches("tim|Tim|jin|Jin", "jin"));//True

        // returns true if the string contains "abc" at any place
        System.out.println("6: "+Pattern.matches(".*abc.*", "deabcpq"));//True

        // returns true if the string does not have a number at the beginning
        System.out.println("7: "+Pattern.matches("[a-zA-Z]+[0-9]*[a-zA-Z]*", "123abc")); //False
        System.out.println("8: "+Pattern.matches("[a-zA-Z]+[0-9]*[a-zA-Z]*", "abc123")); //True

        // returns true if the string contains of three letters
        System.out.println("9: "+Pattern.matches("[a-zA-Z]{3}", "aPz"));//True
        System.out.println("10: "+Pattern.matches("[a-zA-Z]{3}", "aAA"));//True
        System.out.println("11: "+Pattern.matches("[a-zA-Z]{3}", "apZx"));//False

        // returns true if the string contains 0 or more non-digits
        System.out.println("12: "+Pattern.matches(, "abcde")); //True
        System.out.println("13: "+Pattern.matches(, "abcde123")); //False

    /* Boundary Matchers example; * use ^ and $
       returns true if "These" is the beginning and the end of the string
    */
        System.out.println("14: "+Pattern.matches(, "These are regular expressions")); //False
        System.out.println("15: "+Pattern.matches(, "These")); //True
        System.out.println("16: "+Pattern.matches(, "are regular expressions")); //False
    }
}