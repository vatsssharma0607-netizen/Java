class OddThread extends Thread
{
    public void run()
    {
        for(int i=1; i<=20; i+=2)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
class EvenThread extends Thread
{
    public void run()
    {
        for(int i=2; i<=20; i+=2)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class Assignment7_2 
{
    public static void main(String args[]) 
    {
        OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();
        t1.start();
        t2.start();
    }
}
