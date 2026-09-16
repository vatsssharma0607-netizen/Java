class ThreadTest1 extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(i);
            try 
            {
                Thread.sleep(1000); 
            } 
            catch (Exception e) 
            {
            }
        }
    }
}
public class ClassTest1 
{
    public static void main(String[] args) 
    {
        ThreadTest1 thread = new ThreadTest1();
        thread.start(); 
    }
}