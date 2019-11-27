// (c) Stix Daniel
import java.util.ArrayList;
import java.util.Scanner;
public abstract class Exercise implements Comparable
{
    private Book[] array;
    private Book objekt;
    private int c = 0;
    private int part = 0;
    private ArrayList<Book> arLis;

    public Exercise(Book[] array, Book objekt)
    {
        this.array = array;
        this.objekt = objekt;

        for (int i = 0;i < array.length;i++)
        {
            array[i] = objekt;
        }

        selection();

        if ( part == 6 )
        {
            part6();
        }
    }

    public void part6 ()
    {
        int cnt = 0;
        while (cnt != 6)
        {
            arLis.add(array[cnt]);
        }
        // unsortiert
        for (Book p: arLis)
        {
            System.out.println(p);
        }
        // sortiert
        arLis.compareTo()
    }

    public void selection ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Part 6,7 oder 8 auswählen: ");
        part = sc.nextInt();
    }
}