import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Pattern;

public class RegexUe1
{
    public static void main(String[] args)
    {
        System.out.println(Pattern.matches("06[0-9]{2}/[0-9]+","0664/5124199"));
        System.out.println(Pattern.matches("[0-9]{4}","4845"));
        System.out.println(Pattern.matches("[0-9]{4}","4873"));
        System.out.println(Pattern.matches("[0-9]{4}","4600"));
    }
}