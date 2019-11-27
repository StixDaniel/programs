import java.util.List;
import java.util.ArrayList;

public class PrintSorted
{
    private List<Integer> list;

    public PrintSorted()
    {
        this.list = new ArrayList<>();
    }

    public void add (int amount,int number)
    {
        for(int i = 0; i < amount; i++)
        {
            list.add(number);
        }
    }

    public void multiply ()
    {
        for (Integer p : list)
        {
            p = p * 10;
        }
    }

    public void print ()
    {
        for (Integer p : list)
        {
            System.out.println(p);
        }
    }
}