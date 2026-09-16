import java.util.Scanner;
interface Test 
{
    void function1();   
}
public class Main
{
    public static void main(String[] args) 
	{
        Test t1 = () -> System.out.println("Lambda Function1 ");
        t1.function1();
        t1 = () -> System.out.println("Lambda Function2 ");
        t1.function1();
        t1 = () -> 
		{
            System.out.println("Lambda Function3 ");
            Scanner s = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = s.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) 
			{
                arr[i] = s.nextInt();
            }
            System.out.print("Array elements: ");
            for (int val : arr) 
			{
                System.out.print(val + " ");
            }
            System.out.println();
        };
        t1.function1();
        t1 = () -> {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a + b);
        };
        t1.function1();
        t1 = () -> 
		{
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            for(int i = 1; i <= num; i++)
                System.out.println(i);
        };
        t1.function1();
    }
}