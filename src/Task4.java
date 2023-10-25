public class Task4
{
    public static void main(String[] args)
    {
        int s=0;
        int i;

        for(i = 1; i<=100; i++)
        {
            if(i%2==0)
            {
                s += i;
            }
        }
        System.out.println("Sum of first 100 even numbers: "+s);
    }
}
